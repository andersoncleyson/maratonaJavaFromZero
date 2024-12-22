package academy.devdojo.maratonajava.javacore.Rdates.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1995, Month.AUGUST, 24, 12, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(aniversario, now) + " days");
        System.out.println(ChronoUnit.WEEKS.between(aniversario, now) + " weeks");
        System.out.println(ChronoUnit.MONTHS.between(aniversario, now) + " months");
        System.out.println(ChronoUnit.YEARS.between(aniversario, now) + " years");
    }
}
