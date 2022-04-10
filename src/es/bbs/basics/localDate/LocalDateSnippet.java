package es.bbs.basics.localDate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

/**
 * Vamos a tener una introduccion a LocalDate, LocalTime, Instant, Duration y Period
 * <p>
 * Se trata de implementaciones que incluyen clases para manejar fechas o intervalos simples
 */
public class LocalDateSnippet {

    /**
     * LocalDate representa un objeto inmutable de una fecha plana sin horas
     * <p>
     * Puede instanciarse con el metodo of()
     */
    public void localDateSnipped() {

        // Instanciacion
        LocalDate localDate = LocalDate.of(2021, 12, 1);

        // Se pueden obtener distinta informacion
        int ano = localDate.getYear();
        pinta(ano);
        Month month = localDate.getMonth();
        pinta(month);
        int day = localDate.getDayOfMonth();
        pinta(day);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        pinta(dayOfWeek);
        int len = localDate.lengthOfMonth();
        pinta(len);
        boolean leap = localDate.isLeapYear();
        pinta(leap);

        // Tambien se puede obtener la fecha actual
        LocalDate dateNow = LocalDate.now();

        // Podemos obtener datos a partir de la interface de ChronoField
        int year = dateNow.get(ChronoField.YEAR);
        pinta(year);
        int monthFromChrono = dateNow.get(ChronoField.MONTH_OF_YEAR);
        pinta(monthFromChrono);
        int dayFromChrono = dateNow.get(ChronoField.DAY_OF_YEAR);
        pinta(dayFromChrono);

    }

    public void localTimeSnippet(){

        // Esta interface LocalTime

    }

    private void pinta(Object o) {
        System.out.println(o);
    }


}
