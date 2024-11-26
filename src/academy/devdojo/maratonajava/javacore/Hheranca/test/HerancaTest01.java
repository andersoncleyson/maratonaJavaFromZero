package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 9");
        endereco.setCep("2342342");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Elliot");
        pessoa.setCpf("5959595");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Elliot");

        funcionario.setCpf("5465465");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        funcionario.imprime();


    }
}
