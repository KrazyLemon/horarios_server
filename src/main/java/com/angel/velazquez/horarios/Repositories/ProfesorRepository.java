package com.angel.velazquez.horarios.Repositories;

import com.angel.velazquez.horarios.Models.Profesor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ProfesorRepository extends MongoRepository<Profesor, String> {

    @Query("{ 'nombre': ?0 }")
    Profesor findByNombre(String nombre);

    List<Profesor> findByMateriasContaining(String materia);

}
