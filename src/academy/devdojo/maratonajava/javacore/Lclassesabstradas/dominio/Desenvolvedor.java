package academy.devdojo.maratonajava.javacore.Lclassesabstradas.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}