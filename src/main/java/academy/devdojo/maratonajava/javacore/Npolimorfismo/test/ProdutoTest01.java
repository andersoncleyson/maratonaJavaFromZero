package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10I8", 10000);
        Tomate tomate = new Tomate("Tomate pera", 15);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("================================");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
