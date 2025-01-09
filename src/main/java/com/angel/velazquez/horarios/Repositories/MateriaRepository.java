package com.angel.velazquez.horarios.Repositories;

import com.angel.velazquez.horarios.Models.Materia;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface MateriaRepository extends MongoRepository<Materia, String> {

    @Query("{ 'nombre': ?0 }")
    Materia findByNombre(String nombre);

    List<Materia> findBySemestre(int semestre);

}
