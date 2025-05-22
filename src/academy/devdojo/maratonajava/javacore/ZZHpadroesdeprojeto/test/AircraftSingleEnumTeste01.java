package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.domain.AircraftSingletonEager;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.domain.AircraftSingletonEnum;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.domain.AircraftSingletonLazy;

public class AircraftSingleEnumTeste01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonEnum.INSTANCE);
        AircraftSingletonEnum instance = AircraftSingletonEnum.INSTANCE;
        System.out.println(instance.bookSeat(seat));
    }
}
