package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.PROMOTION;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no Life", 2.99, Category.DRAMA),
            new LightNovel("Fullmetal Alchemist", 4.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)
    ));

    public static void main(String[] args) {
       Map<Category, Long> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);
        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        Map<Category, LightNovel> collect2 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(collect2);

        Map<Category, LightNovel> collect3 = lightNovels.stream().collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect3);
    }
}
