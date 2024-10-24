package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, short, long, boolean
        int age = (int) 1000000L;
        long bigNumber = 100000L;
        String name = "Anderson";
        double salaryDouble = 2000;
        float salaryFloat = 2600.0F;
        byte ageByte = 29;
        boolean reality = true;
        char caractere = 80;


        System.out.println("Name: " + name + "\n" + "Age: " + age);
        System.out.println("Salary: " + salaryFloat);
        System.out.println("First name's letter: " + caractere);
        System.out.println(reality);
        System.out.println(bigNumber);
    }
}
