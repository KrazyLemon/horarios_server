package com.angel.velazquez.horarios.Services;

import com.angel.velazquez.horarios.Models.Grupo;
import com.angel.velazquez.horarios.Repositories.GrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrupoService {
    private final GrupoRepository grupoRepository;

    public GrupoService(GrupoRepository grupoRepository) {
        this.grupoRepository = grupoRepository;
    }

    public List<Grupo> findAll() {
        return grupoRepository.findAll();
    }

    public Grupo buscarPorGrupo(String grupo) {
        return grupoRepository.findByGrupo(grupo);
    }

    public Grupo findById(String id) {
        return grupoRepository.findById(id).orElse(null);
    }

    public Grupo save(Grupo grupo) {
        return grupoRepository.save(grupo);
    }

    public void deleteById(String id) {
        grupoRepository.deleteById(id);
    }

}
