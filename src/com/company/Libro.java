package com.company;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String nombre;
    private Integer codigoISBN;
    private String autor;
    private List<Ejemplar>listaDeEjemplares;

    public Libro(String nombre, Integer codigoISBN, String autor){
        this.nombre=nombre;
        this.codigoISBN=codigoISBN;
        this.autor=autor;
        this.listaDeEjemplares= new ArrayList<>();
    }

    public void setListaDeEjemplares(List<Ejemplar> listaDeEjemplares) {
        this.listaDeEjemplares = listaDeEjemplares;
    }

    public List<Ejemplar> getListaDeEjemplares() {
        return listaDeEjemplares;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoISBN(Integer codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCodigoISBN() {
        return codigoISBN;
    }

    public String getAutor() {
        return autor;
    }
}
