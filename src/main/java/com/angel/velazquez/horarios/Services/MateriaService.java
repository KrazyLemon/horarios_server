package com.angel.velazquez.horarios.Services;

import com.angel.velazquez.horarios.Models.Materia;
import com.angel.velazquez.horarios.Repositories.MateriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaService {
    private final MateriaRepository materiaRepository;

    public MateriaService(MateriaRepository materiaRepository) {
        this.materiaRepository = materiaRepository;
    }

    public List<Materia> findAll() {
        return materiaRepository.findAll();
    }

    public Materia findById(String id) {
        return materiaRepository.findById(id).orElse(null);
    }

    public Materia findByNombre(String nombre) {
        return materiaRepository.findByNombre(nombre);
    }

    public List<Materia> obtenerMateriasPorSemestre(int semestre) {
        return materiaRepository.findBySemestre(semestre);
    }

    public Materia save(Materia materia) {
        return materiaRepository.save(materia);
    }

    public void deleteById(String id) {
        materiaRepository.deleteById(id);
    }

}
