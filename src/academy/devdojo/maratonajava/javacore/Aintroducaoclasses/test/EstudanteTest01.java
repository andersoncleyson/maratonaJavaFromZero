package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();

        aluno.nome = "Elliot";
        aluno.idade = 29;
        aluno.sexo = 'M';

        System.out.println(aluno.nome);


    }
}
