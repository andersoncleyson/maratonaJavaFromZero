package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Random;

public class GerarNumerosAleatorios {
    public static void main(String[] args) {
        Random gerador = new Random();

        for (int i = 0; i < 6; i++){
            System.out.print(gerador.nextInt(60) + " ");
        }
    }
}
