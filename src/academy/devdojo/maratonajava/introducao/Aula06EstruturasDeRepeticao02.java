package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        int n = 100000;

        for (int i = 0; i <= n; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
