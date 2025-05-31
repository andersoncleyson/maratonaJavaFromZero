package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16); // 1.4
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Elliot");
        nomes.add("DevDojo Academy");

        nomes2.add("Angela");
        nomes2.add("Darlene");

        nomes.addAll(nomes2);

        for (Object nome: nomes) {
            System.out.println(nome);
        }


        System.out.println("---------");
        int size = nomes.size();
        for(int i = 0; i < size; i++){
            nomes.add("Shayla");
            System.out.println(nomes.get(i));
        }
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
