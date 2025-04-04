package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Carro;

import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis){
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponível() {
        System.out.println("Buscano objeto disponível...");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + t);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarObjetoAlugado(T t) {
        System.out.println("Devolvendo objeto " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponpiveis para alugar: ");
        System.out.println(objetosDisponiveis);
    }
}
