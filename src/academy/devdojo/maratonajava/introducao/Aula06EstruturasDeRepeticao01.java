package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for

        int count = 0;

        while(count < 5){
            count++;
            System.out.println(count);
        }

        count = 0;
        do {
            System.out.println("dentro do do-while");
        }while(count < 10);

        for (int i = 0; i < 5; i++){
            System.out.println("Dentro do For");
            System.out.println(i);
        }
    }
}
