package com.angel.velazquez.horarios.Services;

import com.angel.velazquez.horarios.Models.Salon;
import com.angel.velazquez.horarios.Repositories.SalonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalonService {
    private final SalonRepository repo;

    public SalonService(SalonRepository repo) {
        this.repo = repo;
    }

    public List<Salon> findAll(){
        return  repo.findAll();
    }

    public Salon findBySalon(String salon){
        return repo.findBySalon(salon);
    }

    public Salon findById(String id){
        return repo.findById(id).orElse(null);
    }

    public Salon save(Salon salon){
        return repo.save(salon);
    }

    public void deleteById(String id){
        repo.deleteById(id);
    }

}
