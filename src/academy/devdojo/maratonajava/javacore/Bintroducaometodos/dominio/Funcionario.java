package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] variosSalarios;
    private double mediaSalario;

    public void imprimeDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (variosSalarios != null) {
            for (double salario: this.variosSalarios){
                System.out.println(salario);
            }
        }

        System.out.println("---Média salário---");
        mediaSalario(this.variosSalarios);

    }

    public void mediaSalario(double... salarios){
        if (salarios == null){
            return;
        }
        double somaSalario = 0;


        for(double salario: salarios){
            somaSalario += salario;
        }
         mediaSalario =  somaSalario / salarios.length;

        System.out.println(String.format("%.2f", mediaSalario));
    }

    public double getMediaSalario() {
        return mediaSalario;
    }

    public void setMediaSalario(double mediaSalario) {
        this.mediaSalario = mediaSalario;
    }
}
