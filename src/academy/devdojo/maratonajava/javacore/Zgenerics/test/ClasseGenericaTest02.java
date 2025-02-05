package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.BarcoRentalService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentalService BarcoRentalService = new BarcoRentalService();
        Barco barco = BarcoRentalService.buscarBarcoDisponível();
        System.out.println("Usando o Barco por um mês...");
        BarcoRentalService.retornarBarcoAlugado(barco);
    }
}
