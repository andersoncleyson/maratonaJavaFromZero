package academy.devdojo.maratonajava.javacore.Gassociacao.tests;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class ExercicioAssociacao {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Anderson", 29);
        Aluno aluno2 = new Aluno("Shayla", 28);
        Aluno aluno3 = new Aluno("Darlene", 26);
        Aluno[] alunos = {aluno1, aluno2, aluno3};

        Local local = new Local("Universidade Harvard");

        Seminario seminario1 = new Seminario("Os mistérios do Cosmos", local);
        Seminario seminario2 = new Seminario("Pálido ponto azul", local);
        seminario1.setAlunos(alunos);
        seminario2.setAlunos(alunos);

        Seminario[] seminarios = {seminario1, seminario2};
        Professor professor = new Professor("Carl Sagan", "Cosmologia", seminarios);

        System.out.println("Seminário: " + seminario1.getTitulo());
        seminario1.imprimeLocal();
        System.out.println("--------------------");
        System.out.println("Professor: " + professor.getNome() + " - Especialidade: " + professor.getEspecialidade());
        professor.imprimeSeminarios();
        System.out.println("====================");
        System.out.println("Alunos:");
        seminario1.imprimeAlunos();

    }
}
