package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int[] idades = new int[5];

        for (int i = 0; i < idades.length; i++){
            idades[i] = i;
        }

        for (int j = 0; j < idades.length; j++){
            System.out.println(idades[j]);
        }

    }
}
