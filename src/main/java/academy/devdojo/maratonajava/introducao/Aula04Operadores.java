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
        boolean isDezMaiorQueVint = 128 == 128;
        System.out.println(isDezMaiorQueVint);

        // && (AND) || (OR) ! (logical not)

        int age = 34;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = age > 30 && salario > 4621;
        boolean isDentroDaLeiMenorQueTrinta = age < 30 && salario > 3381;

        System.out.println("isDemtrpDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDemtrpDaLeiMenorQueTrinta:" + isDentroDaLeiMenorQueTrinta);

        double valueTotalCountBank = 3000;
        double valorTotalContaPoupanca = 4000;
        double valorPlaystation = 5000F;

        double cashTotal = valueTotalCountBank + valorTotalContaPoupanca;

        boolean isPlaystation5Compravel = cashTotal >= valorPlaystation || valueTotalCountBank >= valorPlaystation || valorTotalContaPoupanca >= valorPlaystation;

        System.out.println("\nDá pra comprar o PS5?");
        System.out.println("Valor: " + valorPlaystation);
        System.out.println("Total de dinheiro na conta: R$" + cashTotal);
        if (isPlaystation5Compravel) {
            System.out.println("Dá pra comprar grl");
        } else {
            System.out.println("Ih dá não :(");
        }

        // = += -= *= /= %=
        double bonus = 0;
        bonus += 500;
        System.out.println(bonus);
        bonus -= 400;
        System.out.println(bonus);

    }
}
