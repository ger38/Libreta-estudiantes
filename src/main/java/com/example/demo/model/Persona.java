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
        this.idPersona=idPersona;
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.telefono=telefono;
        this.direccion=direccion;
    }
    public long getIdPersona() {
        return idPersona;
    }
    public void setIdPersona(long idPersona){
        this.idPersona = idPersona;
    }
    public  String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDni(){
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

