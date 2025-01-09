package com.angel.velazquez.horarios.Models;

public class Asignaciones {
    private String id;
    private String materia;
    private String objeto;


    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }
}
