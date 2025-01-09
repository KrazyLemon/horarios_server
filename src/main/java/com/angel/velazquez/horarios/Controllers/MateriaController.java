package com.angel.velazquez.horarios.Controllers;

import com.angel.velazquez.horarios.Models.Materia;
import com.angel.velazquez.horarios.Services.MateriaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/materias")
public class MateriaController {

    private final MateriaService materiaService;

    public MateriaController(MateriaService materiaService) {
        this.materiaService = materiaService;
    }

    @GetMapping
    public List<Materia> getAllMaterias() {
        return materiaService.findAll();
    }

    @GetMapping("/{id}")
    public Materia getMateriaById(@PathVariable String id) {
        return materiaService.findById(id);
    }

    @GetMapping("/semestre/{semestre}")
    public List<Materia> obtenerMateriasPorSemestre(@PathVariable int semestre) {
        return materiaService.obtenerMateriasPorSemestre(semestre);
    }

    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<Materia> getMateriaByNombre(String nombre) {
       Materia materia1 = materiaService.findByNombre(nombre);
       return materia1 != null ? ResponseEntity.ok(materia1) : ResponseEntity.noContent().build();
    }

    @PostMapping
    public Materia createMateria(@RequestBody Materia materia) {
        return materiaService.save(materia);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Materia> updateMateria(@PathVariable String id, @RequestBody Materia materia) {
        Materia existingMateria = materiaService.findById(id);
        if (existingMateria != null) {
            materia.setId(id);
            return ResponseEntity.ok(materiaService.save(materia));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMateria(@PathVariable String id) {
        materiaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
