package com.angel.velazquez.horarios.Controllers;

import com.angel.velazquez.horarios.Models.Grupo;
import com.angel.velazquez.horarios.Services.GrupoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GrupoController {

    private GrupoService grupoService;


    public GrupoController(GrupoService grupoService) {
        this.grupoService = grupoService;
    }

    @GetMapping("/grupos")
    public List<Grupo> getAllGrupos() {
        return grupoService.findAll();
    }

    @GetMapping("/grupo/{id}")
    public ResponseEntity<Grupo> getGrupoById(@PathVariable String id) {
        Grupo grupo = grupoService.findById(id);
        return grupo != null ? ResponseEntity.ok(grupo) : ResponseEntity.noContent().build();
    }

    @GetMapping("/grupos/grupo/{grupo}")
    public ResponseEntity<Grupo> getGrupoByGrupo(@PathVariable String grupo) {
        Grupo grupo1 = grupoService.buscarPorGrupo(grupo);
        return grupo != null ? ResponseEntity.ok(grupo1): ResponseEntity.noContent().build();
     }

    @PostMapping("/grupo")
    public Grupo createGrupo(@RequestBody Grupo grupo) {
        return grupoService.save(grupo);
    }

    @PutMapping("/grupo/{id}")
    public ResponseEntity<Grupo> updateGrupo(@PathVariable String id, @RequestBody Grupo grupo) {
        Grupo existingGrupo = grupoService.findById(id);
        if (existingGrupo != null) {
            grupo.setId(id);
            return ResponseEntity.ok(grupoService.save(grupo));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/grupo/{id}")
    public ResponseEntity<Void> deleteGrupo(@PathVariable String id) {
        grupoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
