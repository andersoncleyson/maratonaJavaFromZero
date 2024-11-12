package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Elliot";
        funcionario.idade = 29;
        funcionario.variosSalarios = new double[]{2343.43, 2233.23, 2342.54};

        funcionario.imprimeDados();


    }
}
