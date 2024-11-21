package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo, Local local){
        this.titulo = titulo;
        this.local = local;

    }

    public void imprimeAlunos(){
        for(Aluno aluno: alunos){
            System.out.println(aluno.getNome());
        }
    }

    public void imprimeLocal(){
        System.out.println("Local: " + local.getEndereco());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
