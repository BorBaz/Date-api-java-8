package es.bbs.basics.localDate;

import java.time.Instant;

/**
 * Esta clase {@link java.time.Instant} permite manejar el tiempo de una forma mas ordenador-friendly, donde para la maquina
 * el tiempo es una cuenta lineal de digitos que van aumentando desde Epoch. Thursday 1 January 1970 00:00:00
 *
 * El caso es que esta clase, esta hecha para ser manejada por maquinas, no por usuarios, es por esto que lanzara
 * excepciones en caso de que querremos obtener fechas human friendly.
 *
 * Para solucionar este problema, surgen las clases {@link java.time.Duration} y {@link java.time.Period}
 */
public class InstantSnippet {

    public static void main(String[] args) {

        Instant instant = Instant.now();

        System.out.println(instant);
    }
}
