package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.CarroRentalService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentalService carroRentalService = new CarroRentalService();
        Carro carro = carroRentalService.buscarCarroDisponível();
        System.out.println("Usando o carro por um mês...");
        carroRentalService.retornarCarroAlugado(carro);
    }
}
