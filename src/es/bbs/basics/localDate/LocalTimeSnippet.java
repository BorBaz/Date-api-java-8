package es.bbs.basics.localDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Lo mismo que {@link java.time.LocalDate} pero con el tiempo
 */
public class LocalTimeSnippet {

    public static void main(String[] args) {
        basic();
        initConHoras();
        initConParse();
        initDateConParse();
    }

    /**
     * En concreto este parse, no me convence, tienes que pasar el parametro en un formato correcto, no es demasiado desacoplado
     *
     * Aunque siempre se le puede pasar un parser {@link java.time.format.DateTimeFormatter}
     */
    private static void initDateConParse() {
        LocalDateTime localDateTime = LocalDateTime.parse("2007-12-03T10:15:30");

        System.out.println(localDateTime);
    }

    private static void initConParse() {
        LocalTime localTime = LocalTime.parse("23:23:01");
        System.out.println(localTime);
    }

    private static void initConHoras() {
        LocalTime localDateTime = LocalTime.of(16,50,00);
        System.out.println(localDateTime);
    }

    public static void basic(){
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);
    }
}
