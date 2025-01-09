package com.angel.velazquez.horarios.Services;

import com.angel.velazquez.horarios.Models.Profesor;
import com.angel.velazquez.horarios.Repositories.ProfesorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService {
    private final ProfesorRepository profesorRepository;

    public ProfesorService(ProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }

    public List<Profesor> findAll() {
        return profesorRepository.findAll();
    }

    public Profesor findById(String id) {
        return profesorRepository.findById(id).orElse(null);
    }

    public Profesor findByNombre(String nombre) {
        return profesorRepository.findByNombre(nombre);
    }

    public List<Profesor> findByMateriasContaining(String materia) {
        return profesorRepository.findByMateriasContaining(materia);
    }

    public Profesor save(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    public void deleteById(String id) {
        profesorRepository.deleteById(id);
    }


}
