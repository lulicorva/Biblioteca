package com.company;

import java.util.List;

public class SocioVip extends Socio {
    private Integer valorCuotaMensual;
    public static final Integer CANTIDAD_MAXIMA_DE_RETIRO_VIP = 15;


    public SocioVip(String nombre, String apellido, Integer numeroIdentificacion, Integer valorCuotaMensual, List<Ejemplar> listaDeEjemplaresRetirados) {
        super(nombre, apellido, numeroIdentificacion, listaDeEjemplaresRetirados, CANTIDAD_MAXIMA_DE_RETIRO_VIP);
        this.valorCuotaMensual=valorCuotaMensual;
    }

    public Integer getValorCuotaMensual() {
        return valorCuotaMensual;
    }

    public void setValorCuotaMensual(Integer valorCuotaMensual) {
        this.valorCuotaMensual = valorCuotaMensual;
    }
}
