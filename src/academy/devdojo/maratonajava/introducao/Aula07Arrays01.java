package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int[] array = new int[4];

        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }

        for (int j = 0; j < array.length; j++){
            System.out.println(array[j]);
        }
    }
}
