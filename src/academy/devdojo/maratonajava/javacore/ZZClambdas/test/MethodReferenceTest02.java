package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to an instance method of particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Berserk", 43),
                new Anime("One Piece", 400),
                new Anime("Naruto", 500)
        ));

        animeList.sort(animeComparators::compareByEpisodeNonStatic);
        //animeList.sort((a1,a2) -> animeComparators.compareByEpisodeNonStatic(a1,a2));
        System.out.println(animeList);
    }
}
