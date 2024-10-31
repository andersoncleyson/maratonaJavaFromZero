package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double 0
        // char '\u0000'
        // String null
        String[] idade = new String[3];

        idade[0] = "Goku";
        idade[1] = "Kurosaki";
        idade[2] = "Luffy";

        for (int i = 0; i < idade.length; i++) {
            System.out.println(idade[i]);
        }

    }
}
