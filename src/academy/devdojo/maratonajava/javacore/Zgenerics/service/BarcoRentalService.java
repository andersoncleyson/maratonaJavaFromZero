package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentalService {
    private List<Barco> BarcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));

    public Barco buscarBarcoDisponível() {
        System.out.println("Buscano Barco disponível...");
        Barco Barco = BarcosDisponiveis.remove(0);
        System.out.println("Alugando Barco: " +Barco);
        System.out.println("Barcos disponíveis para alugar: ");
        System.out.println(BarcosDisponiveis);
        return Barco;
    }

    public void retornarBarcoAlugado(Barco Barco) {
        System.out.println("Devolvendo Barco " + Barco);
        BarcosDisponiveis.add(Barco);
        System.out.println("Barcos disponpiveis para alugar: ");
        System.out.println(BarcosDisponiveis);
    }
}
