package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args){
        Anime anime = new Anime();
        anime.setNome("Naruto");
        anime.setTipo("TV");
        anime.setEpisodios(500);

        anime.imprime();

        anime.init("Dragon Ball", "Tv", 200, "Ação");


        anime.imprime();
    }
}
