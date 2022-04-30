package es.bbs.basics.localDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * En JDK8 puedes cambiar facilmente entre los distintos envoltorios de las clases de Fechas y horas
 */
public class BetweenClassesSnippet {

    public static void main(String[] args) {

        LocalDateTime nowWithTime = LocalDateTime.now();

        LocalDate justDate = nowWithTime.toLocalDate();
        LocalTime justTime = nowWithTime.toLocalTime();
    }
}
