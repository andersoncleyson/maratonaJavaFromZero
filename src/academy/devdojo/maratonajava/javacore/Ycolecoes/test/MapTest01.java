package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        System.out.println(map);

        System.out.println("---------------");
        for(String values: map.values()){
            System.out.println(values);
        }

        System.out.println("----------------");
        for (Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry);
        }
    }
}
