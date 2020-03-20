package com.company;

public class Libro {
    private String nombre;
    private Integer codigoISBN;
    private String autor;

    public Libro(String nombre, Integer codigoISBN, String autor){
        this.nombre=nombre;
        this.codigoISBN=codigoISBN;
        this.autor=autor;
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
