package es.bbs.basics.localDate;

import java.time.*;

public class DurationAndPeriodSnippet {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime dentroDeUnosAnhos = LocalDateTime.of(2030, Month.of(3), 13, 14,50);
//
//        Duration duration = Duration.between(dentroDeUnosAnhos,now);
//        System.out.println(duration);
//        System.out.println(duration.toHours());
//        Duration duration2 = Duration.between(now,dentroDeUnosAnhos);
//        System.out.println(duration2);
//        System.out.println(duration2.toHours());
//        System.out.println(duration2.toDays());


        LocalDate localDateNow = now.toLocalDate();
        LocalDate localDateDentroDeUnosAnhos = dentroDeUnosAnhos.toLocalDate();

        Period period = Period.between(localDateNow, localDateDentroDeUnosAnhos);

        System.out.println(localDateDentroDeUnosAnhos.getYear());
        System.out.println(localDateNow.getYear());
        System.out.println("Dias:" + period.getDays());
        System.out.println("Anhos:" + period.getYears());

    }
}
