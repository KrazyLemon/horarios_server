package com.angel.velazquez.horarios.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "grupos")
public class Grupo {

    @Id
    private String id;
    private String grupo;
    private String turno;
    private String salon;
    private String semestre;
    private List<List<String>> horario;
    private List<Asignaciones> asignaciones;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public List<List<String>> getHorario() {
        return horario;
    }

    public void setHorario(List<List<String>> horario) {
        this.horario = horario;
    }

    public List<Asignaciones> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(List<Asignaciones> asignaciones) {
        this.asignaciones = asignaciones;
    }
}
