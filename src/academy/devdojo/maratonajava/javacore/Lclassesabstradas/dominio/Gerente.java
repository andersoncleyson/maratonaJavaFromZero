package academy.devdojo.maratonajava.javacore.Lclassesabstradas.dominio;

public class Gerente extends Funcionario{
    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public Gerente(String nome, double salario){
        super(nome, salario);


    }
}
