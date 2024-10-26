package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int n1 = 321;
        int n2 = 546;
        int soma = n1 + n2;
        int multi = n1 * n2;
        int sub = n1 - n2;
        double div = (double) n2 / n1;

        System.out.println("RESULTS");
        System.out.println("Sum: " + soma);
        System.out.println("Multi: " + multi);
        System.out.println("Sub: " + sub);
        System.out.println("Div: " + div);

        // %
        int rest = n2 % n1;
        System.out.println(rest);

        // < > <= >= == !=
        boolean isDezMaiorQueVint = 10 > 20;
        System.out.println(isDezMaiorQueVint);
    }
}
