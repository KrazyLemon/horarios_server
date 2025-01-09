package com.angel.velazquez.horarios.Repositories;

import com.angel.velazquez.horarios.Models.Salon;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SalonRepository extends MongoRepository<Salon,String> {
    Salon findBySalon(String salon);
}
