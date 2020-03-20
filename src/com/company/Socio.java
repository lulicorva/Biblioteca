package com.company;

import java.util.List;

public class Socio {
    private String nombre;
    private String apellido;
    private Integer numeroIdentificacion;
    private List<Ejemplar> listaDeEjemplaresRetirados;
    private Integer cantidadMaximaDeRetiro;

    public Socio(String nombre, String apellido, Integer numeroIdentificacion, List<Ejemplar> listaDeEjemplaresRetirados, Integer cantidadMaximaDeRetiro){
        this.nombre=nombre;
        this.apellido=apellido;
        this.numeroIdentificacion=numeroIdentificacion;
        this.listaDeEjemplaresRetirados=listaDeEjemplaresRetirados;
        this.cantidadMaximaDeRetiro=cantidadMaximaDeRetiro;
    }

    public void setListaDeEjemplaresRetirados(List<Ejemplar> listaDeEjemplaresRetirados) {
        this.listaDeEjemplaresRetirados = listaDeEjemplaresRetirados;
    }

    public void setCantidadMaximaDeRetiro(Integer cantidadMaximaDeRetiro) {
        this.cantidadMaximaDeRetiro = cantidadMaximaDeRetiro;
    }

    public List<Ejemplar> getListaDeEjemplaresRetirados() {
        return listaDeEjemplaresRetirados;
    }

    public Integer getCantidadMaximaDeRetiro() {
        return cantidadMaximaDeRetiro;
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
