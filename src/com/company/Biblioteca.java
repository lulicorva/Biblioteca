package com.company;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro>listaDeLibros;
    private List<Socio>listaDeSocios;
    private List<Prestamo>prestamosRealizados;

    public Biblioteca(List listaDeLibros, List listaDeSocios, List prestamosRealizados){
        this.listaDeLibros= new ArrayList<>();
        this.listaDeSocios= new ArrayList<>();
        this.prestamosRealizados= new ArrayList<>();
    }

    public void setListaDeLibros(List<Libro> listaDeLibros) {
        this.listaDeLibros = listaDeLibros;
    }

    public void setListaDeSocios(List<Socio> listaDeSocios) {
        this.listaDeSocios = listaDeSocios;
    }

    public void setPrestamosRealizados(List<Prestamo> prestamosRealizados) {
        this.prestamosRealizados = prestamosRealizados;
    }

    public List<Libro> getListaDeLibros() {
        return listaDeLibros;
    }

    public List<Socio> getListaDeSocios() {
        return listaDeSocios;
    }

    public List<Prestamo> getPrestamosRealizados() {
        return prestamosRealizados;
    }
}
