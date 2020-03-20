package com.company;

public class Ejemplar {
    private Libro unLibro;
    private Integer numeroDeEdicion;
    private String ubicacion;

    public Ejemplar(Libro unLibro,Integer numeroDeEdicion, String ubicacion){
        this.unLibro=unLibro;
        this.numeroDeEdicion=numeroDeEdicion;
        this.ubicacion=ubicacion;
    }

    public void setUnLibro(Libro unLibro) {
        this.unLibro = unLibro;
    }

    public void setNumeroDeEdicion(Integer numeroDeEdicion) {
        this.numeroDeEdicion = numeroDeEdicion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Libro getUnLibro() {
        return unLibro;
    }

    public Integer getNumeroDeEdicion() {
        return numeroDeEdicion;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}
