package academy.devdojo.maratonajava.javacore.Gassociacao.tests;

import java.util.Scanner;

public class LeituraTecladoTest02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String loop = "S";


        while(loop != "N"){
            System.out.println("Faça um pergunta que será respondida com SIM ou NÃO");
            String pergunta = scan.next();

            if(pergunta.charAt(0) == ' '){
                System.out.println("SIM");
            }else {
                System.out.println("NÃO");
            }

            System.out.println();
            System.out.println("Deseja fazer uma nova pergunta? S|N");
            loop = scan.nextLine();
            if (loop.charAt(0) == 'N' || loop.charAt(0) == 'n'){
                System.out.println("Tchauzinho!");
                break;
            }
        }

    }
}
