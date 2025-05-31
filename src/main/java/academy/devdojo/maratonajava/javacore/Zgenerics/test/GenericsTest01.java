package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsTest01 {
    public static void main(String[] args) {
        //Type erasure
        List<String> lista = new ArrayList<>();
        lista.add("Midori");
        lista.add("Naoko");

        for (Object o: lista){
            System.out.println(o);
        }
    }
}
