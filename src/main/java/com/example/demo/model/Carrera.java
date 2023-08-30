package com.example.demo.model;

public class Carrera {
    private long idCarrera;
    private String nombre;

    public Carrera(long idCarrera, String nombre){
        this.idCarrera=idCarrera;
        this.nombre=nombre;
    }
    public long getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(long idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

