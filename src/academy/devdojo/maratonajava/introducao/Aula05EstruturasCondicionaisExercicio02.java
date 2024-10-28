package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionaisExercicio02 {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        Scanner scan = new Scanner(System.in);
        System.out.println("Dia da semana (Digite um número de 1 a 7\nConsiderando 1 como Domingo");
        System.out.println("Qual o dia? ");
        int day = scan.nextInt();

        switch (day) {
            case 1:
                System.out.println("Domingo é feriado");
                break;
            case 2:
                System.out.println("Segunda é dia útil");
                break;
            case 3:
                System.out.println("Terça é dia útil");
                break;
            case 4:
                System.out.println("Quarta é dia útil");
                break;
            case 5:
                System.out.println("Quinta é dia útil");
                break;
            case 6:
                System.out.println("Sexta é dia útil");
                break;
            case 7:
                System.out.println("Sábado é dia de folga");
                break;
            default:
                System.out.println("Opção inválida");
        }


    }
}
