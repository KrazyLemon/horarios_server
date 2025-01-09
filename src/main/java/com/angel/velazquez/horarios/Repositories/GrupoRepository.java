package com.angel.velazquez.horarios.Repositories;

import com.angel.velazquez.horarios.Models.Grupo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface GrupoRepository extends MongoRepository<Grupo, String> {

    @Query("{ 'grupo': ?0 }")
    Grupo findByGrupo(String grupo);

}
