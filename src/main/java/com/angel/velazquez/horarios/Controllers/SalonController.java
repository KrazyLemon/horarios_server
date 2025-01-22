package com.angel.velazquez.horarios.Controllers;

import com.angel.velazquez.horarios.Models.Salon;
import com.angel.velazquez.horarios.Services.SalonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SalonController {
    private final SalonService salonService;

    public SalonController(SalonService salonService) {
        this.salonService = salonService;
    }

    @GetMapping("/salones")
    public List<Salon> getAllSalones(){
        return salonService.findAll();
    }

    @GetMapping("/salon/{id}")
    public Salon getSalonById(@PathVariable String id){
        return salonService.findById(id);
    }

    @GetMapping("/salones/salon/{salon}")
    public Salon getSalonBySalon(@PathVariable String salon){
        return salonService.findBySalon(salon);
    }

    @PostMapping("/salon")
    public Salon createSalon(@RequestBody Salon salon){
        return salonService.save(salon);
    }

    @PutMapping("/salon/{id}")
    public ResponseEntity<Salon>updateSalon(@PathVariable String id, @RequestBody Salon salon){
        Salon salon1 = salonService.findById(id);
        if(salon1 != null){
            salon.setId(id);
            return ResponseEntity.ok(salonService.save(salon));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/salon/{id}")
    public ResponseEntity<Void> deleteSalon(@PathVariable String id){
        salonService.deleteById(id);
        return  ResponseEntity.noContent().build();
    }
}
