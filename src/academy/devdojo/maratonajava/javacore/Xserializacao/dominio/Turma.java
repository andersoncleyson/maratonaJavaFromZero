package academy.devdojo.maratonajava.javacore.Xserializacao.dominio;

public class Turma {
    private String nome;

    public Turma(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
