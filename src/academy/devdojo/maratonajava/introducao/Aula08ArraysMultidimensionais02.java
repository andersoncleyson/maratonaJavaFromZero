package academy.devdojo.maratonajava.introducao;

import java.util.Random;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        Random random = new Random();
        arrayInt[0] = new int[random.nextInt(10) + 1];
        arrayInt[1] = new int[random.nextInt(10) + 1];
        arrayInt[2] = new int[random.nextInt(10) + 1];



        for(int i = 0; i < arrayInt.length; i++){
            for (int j = 0; j < arrayInt[i].length; j++){
                arrayInt[i][j] = random.nextInt(100) ;
            }
        }


        for(int[] arrayBase: arrayInt){
            System.out.println();
            for(int num: arrayBase){
                System.out.print(num + " ");
            }
        }
    }
}
