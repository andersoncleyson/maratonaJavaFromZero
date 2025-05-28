package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Elliot");
        funcionario.setIdade(28);

        funcionario.setVariosSalarios(new double[]{2343.43, 2233.23, 2342.54});
        System.out.println(funcionario.getVariosSalarios());
        funcionario.imprimeDados();

        System.out.println(funcionario.getMediaSalary());


    }
}
