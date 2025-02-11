package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Reference to a static method
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Berserk", 43),
                new Anime("One Piece", 400),
                new Anime("Naruto", 500)
        ));

        Collections.sort(animeList, AnimeComparators::compareByTitle);
        System.out.println(animeList    );
        Collections.sort(animeList, AnimeComparators::compareByEpisode);
        System.out.println(animeList);
    }
}
