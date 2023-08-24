package com.example.demo.model;
public class Materia {
    private long idMateria;
    private String nombre;
    private Integer anio;
    private long idCarrera;
    private long idProfesor;

    public Materia(long idMateria, String nombre, Integer anio, long idCarrera, long idProfesor){
        this idMateria=idMateria;
        this nombre=nombre;
        this anio=anio;
        this idCarrera=idCarrera;
        this idProfesor=idProfesor;
    }
}
