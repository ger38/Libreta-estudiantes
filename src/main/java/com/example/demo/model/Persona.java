package com.example.demo.model;

public class Persona {
    private Long idPersona;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String mail;
    private String direccion;

    public Persona(long idPersona, String nombre, String apellido, String dni, String telefono, String mail, String direccion){
        this idPersona=idPersona;
        this nombre=nombre;
        this apellido=apellido;
        this dni=dni;
        this telefono=telefono;
        this direccion=direccion;
    }
}
