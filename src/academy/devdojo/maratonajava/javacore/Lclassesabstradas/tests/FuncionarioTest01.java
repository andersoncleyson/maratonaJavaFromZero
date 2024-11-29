package academy.devdojo.maratonajava.javacore.Lclassesabstradas.tests;

import academy.devdojo.maratonajava.javacore.Lclassesabstradas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstradas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstradas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Elliot", 10000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
