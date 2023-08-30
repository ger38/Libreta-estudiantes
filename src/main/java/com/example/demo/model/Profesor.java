package com.example.demo.model;
public class Profesor {
    private long idProfesor;
    private long idPersona;

    public  Profesor(long idProfesor, long idPersona){
        this.idProfesor=idProfesor;
        this.idPersona=idPersona;
    }

    public long getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(long idProfesor) {
        this.idProfesor = idProfesor;
    }

    public long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(long idPersona) {
        this.idPersona = idPersona;
    }
}


