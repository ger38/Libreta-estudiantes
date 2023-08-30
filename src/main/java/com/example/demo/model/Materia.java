package com.example.demo.model;
public class Materia {
    private long idMateria;
    private String nombre;
    private Integer anio;
    private long idCarrera;
    private long idProfesor;

    public Materia(long idMateria, String nombre, Integer anio, long idCarrera, long idProfesor){
        this.idMateria=idMateria;
        this.nombre=nombre;
        this.anio=anio;
        this.idCarrera=idCarrera;
        this.idProfesor=idProfesor;
    }
    public long getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(long idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public long getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(long idCarrera) {
        this.idCarrera = idCarrera;
    }

    public long getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(long idProfesor) {
        this.idProfesor = idProfesor;
    }
}


