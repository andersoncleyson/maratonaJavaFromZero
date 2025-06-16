package academy.devdojo.maratonajava.javacore.ZZJcrud.service;

import academy.devdojo.maratonajava.javacore.ZZJcrud.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZJcrud.domain.Producer;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repository.AnimeRepository;
import academy.devdojo.maratonajava.javacore.ZZJcrud.test.CrudTest01;

import java.util.Optional;
import java.util.Scanner;


public class AnimeService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op){
        switch (op) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
        }
    }

    private static void findByName(){
        System.out.println("Type the name or empty to all");
        String name = SCANNER.nextLine();
        AnimeRepository.findByName(name)
            .forEach(p -> System.out.printf("[%d] - %s %d %s%n", p.getId(), p.getName(), p.getEpisodes(), p.getProducer().getName()));

    }

    private static void delete(){
        System.out.println("Type one of the ids below to delete");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? S/N");
        String choice = SCANNER.nextLine();
        if("s".equalsIgnoreCase(choice)){
            AnimeRepository.delete(id);
        }
    }

    private static void save(){
        System.out.println("Type the name of the anime");
        String name = SCANNER.nextLine();
        System.out.println("Type the number of episodes");
        int episodes = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Type the id of the producer");
        Integer producerId = Integer.parseInt(SCANNER.nextLine());
        Anime anime = Anime.builder()
                .episodes(episodes)
                .name(name)
                .producer(Producer.builder().id(producerId).build())
                .build();
        AnimeRepository.save(anime);
    }

    private static void update() {
        System.out.println("Type the id of the object you want to update");
        Optional<Anime> animeOptional = AnimeRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if(animeOptional.isEmpty()){
            System.out.println("Anime not found");
            return;
        }
        Anime animeFromDB = animeOptional.get();
        System.out.println("Type the new name or enter to keep the same");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? animeFromDB.getName() : name;

        System.out.println("Type the new number of episodes");
        int episodes = Integer.parseInt(SCANNER.nextLine());
        Anime animeToUpdate = Anime.builder()
                .id(animeFromDB.getId())
                .episodes(episodes)
                .producer(animeFromDB.getProducer())
                .name(name)
                .build();
        AnimeRepository.update(animeToUpdate);
    }


}
