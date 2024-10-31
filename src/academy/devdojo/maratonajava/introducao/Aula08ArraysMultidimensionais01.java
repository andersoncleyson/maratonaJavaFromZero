package academy.devdojo.maratonajava.introducao;

import java.util.Random;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5 Meses
        // 31, 26, 31, 30 dias

        Random gerador = new Random();

        int[][] dias = new int[3][3];

        for (int i = 0; i < dias.length; i++){
            for (int j = 0; j < dias.length; j++){
                dias[i][j] = gerador.nextInt(31);
                if (j == 2){
                    System.out.print(dias[i][j] + "\n");
                }else {
                    System.out.print(dias[i][j] + " ");

                }

            }
        }

        System.out.println("----------");
        for (int[] arrBase: dias) {
            System.out.println("");
            for(int num: arrBase){
                System.out.print(num + " ");
            }
        }
    }
}
