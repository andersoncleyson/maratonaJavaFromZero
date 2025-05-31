package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Elliot"; // String constante pool
        String nome2 = "Elliot";
        nome = nome.concat(" Anderson");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Elliot");
        System.out.println(nome2 == nome3);
    }
}
