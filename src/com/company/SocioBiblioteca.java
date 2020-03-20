package com.company;

public class SocioBiblioteca {
    private String nombre;
    private String apellido;
    private Integer numeroIdentificacion;

    public SocioBiblioteca(String nombre, String apellido, Integer numeroIdentificacion){
        this.nombre=nombre;
        this.apellido=apellido;
        this.numeroIdentificacion=numeroIdentificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumeroIdentificacion(Integer numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getNumeroIdentificacion() {
        return numeroIdentificacion;
    }
}
