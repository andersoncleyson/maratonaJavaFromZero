package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Hello, friend");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("----------");

        Optional<String> nameOptional = Optional.ofNullable(findName("Elliot"));
        String empty = nameOptional.orElse("EMPTY");
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
        System.out.println(empty);
    }

    private static String findName(String name){
        List<String> list = List.of("Elliot", "DevDojo");
        int i = list.indexOf(name);
        if(i != 1) {
            return list.get(i);
        }
        return null;
    }
}
