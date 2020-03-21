package com.company;

import java.util.Date;

public class Prestamo {
    private Ejemplar unEjemplar;
    private Socio unSocio;
    private Date unaFecha;

    public Prestamo(Ejemplar unEjemplar, Socio unSocio) {
        this.unEjemplar = unEjemplar;
        this.unSocio = unSocio;
        this.unaFecha = new Date();
    }

    public void setUnaFecha(Date unaFecha) {
        this.unaFecha = unaFecha;
    }

    public Date getUnaFecha() {
        return unaFecha;
    }

    public void setUnEjemplar(Ejemplar unEjemplar) {
        this.unEjemplar = unEjemplar;
    }

    public void setUnSocio(Socio unSocio) {
        this.unSocio = unSocio;
    }

    public Ejemplar getUnEjemplar() {
        return unEjemplar;
    }

    public Socio getUnSocio() {
        return unSocio;
    }

}
