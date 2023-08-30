package com.example.demo.model;

public class Estudiante {
    private long idEstudiante;
    private long idPersona;
    private Integer legajo;

    public Estudiante(long idEstudiante, long idPersona, Integer legajo){
        this.idEstudiante=idEstudiante;
        this.idPersona=idPersona;
        this.legajo=legajo;
    }
    public long getIdEstudiante() {
        return idEstudiante;
    }
    public void setIdEstudiante(long idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(long idPersona) {
        this.idPersona = idPersona;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }
}


