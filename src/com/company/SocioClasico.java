package com.company;

import java.util.List;

public class SocioClasico extends Socio {
    public static final Integer CANTIDAD_MAXIMA_DE_RETIRO_CLASICO = 3;

    public SocioClasico(String nombre, String apellido, Integer numeroIdentificacion, List<Ejemplar> listaDeEjemplaresRetirados) {
        super(nombre, apellido, numeroIdentificacion,listaDeEjemplaresRetirados, CANTIDAD_MAXIMA_DE_RETIRO_CLASICO);
    }

    public static Integer getCantidadMaximaDeRetiroClasico() {
        return CANTIDAD_MAXIMA_DE_RETIRO_CLASICO;
    }
}
