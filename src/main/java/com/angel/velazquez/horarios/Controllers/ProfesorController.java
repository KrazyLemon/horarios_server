package com.angel.velazquez.horarios.Controllers;


import com.angel.velazquez.horarios.Models.Profesor;
import com.angel.velazquez.horarios.Services.ProfesorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/profesores")
public class ProfesorController {

    private final ProfesorService profesorService;

    public ProfesorController(ProfesorService profesorService) {
        this.profesorService = profesorService;
    }

    @GetMapping
    public List<Profesor> getAllProfesores() {
        return profesorService.findAll();
    }

    @GetMapping("/{id}")
    public Profesor getProfesorById(@PathVariable String id) {
        return profesorService.findById(id);
    }

    @GetMapping("/nombre/{nombre}")
    public Profesor getProfesorByNombre(@PathVariable String nombre) {
        return profesorService.findByNombre(nombre);
    }

    @GetMapping("/materias/{materia}")
    public List<Profesor> getProfesorByMaterias(@PathVariable String materia) {
        return profesorService.findByMateriasContaining(materia);
    }

    @PostMapping
    public Profesor createProfesor(@RequestBody Profesor profesor) {
        return profesorService.save(profesor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Profesor> updateProfesor(@PathVariable String id, @RequestBody Profesor profesor) {
        Profesor existingProfesor = profesorService.findById(id);
        if (existingProfesor != null) {
            profesor.setId(id);
            return ResponseEntity.ok(profesorService.save(profesor));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProfesor(@PathVariable String id) {
        profesorService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
