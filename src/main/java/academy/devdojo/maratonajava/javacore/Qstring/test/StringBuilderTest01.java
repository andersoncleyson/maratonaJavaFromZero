package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
         String nome = "Elliot Anderson";
         nome.concat(" DevDojo");
         nome.substring(0, 3);
         System.out.println(nome);
         StringBuilder sb = new StringBuilder("Elliot Anderson");
         sb.append(" DevDojo").append(" Academy");
         sb.reverse();
         System.out.println(sb);

    }

}
