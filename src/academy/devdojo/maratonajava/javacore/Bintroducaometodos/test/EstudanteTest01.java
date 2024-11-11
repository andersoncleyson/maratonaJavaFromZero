package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.nome = "Shayla";
        estudante01.idade = 16;
        estudante01.sexo = 'F';

        estudante02.nome = "Elliot";
        estudante02.idade = 17;
        estudante02.sexo = 'M';

        impressoraEstudante.imprime(estudante01);
        impressoraEstudante.imprime(estudante02);

        estudante01.imprime();
    }
}
