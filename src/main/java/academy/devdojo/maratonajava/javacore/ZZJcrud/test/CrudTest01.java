package academy.devdojo.maratonajava.javacore.ZZJcrud.test;

import academy.devdojo.maratonajava.javacore.ZZJcrud.service.AnimeService;
import academy.devdojo.maratonajava.javacore.ZZJcrud.service.ProducerService;

import java.io.IOException;
import java.util.Scanner;

public class CrudTest01 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        while(true){
            menu();
            op = Integer.parseInt(scanner.nextLine());
            if (op == 0) break;
            switch (op) {
                case 1 -> {
                    clear();
                    producerMenu();
                    op = Integer.parseInt(scanner.nextLine());
                    ProducerService.menu(op);
                }
                case 2 -> {
                    clear();
                    animeMenu();
                    op = Integer.parseInt(scanner.nextLine());
                    AnimeService.menu(op);
                }
            }

        }
    }

    private static void menu(){
        System.out.println("Type the number of your operation");
        System.out.println("1. Producer");
        System.out.println("2. Anime");
        System.out.println("0. Exit");

    }

    private static void producerMenu(){
        System.out.println("===================");
        System.out.println("    Producer Menu   ");
        System.out.println("===================");
        System.out.println("Type the number of your operation");
        System.out.println("1. Search for producer");
        System.out.println("2. Delete producer");
        System.out.println("3. Save producer");
        System.out.println("4. Update producer");
        System.out.println("9. Go back");
    }

    private static void animeMenu(){
        System.out.println("===================");
        System.out.println("    Anime Menu   ");
        System.out.println("===================");
        System.out.println("Type the number of your operation");
        System.out.println("1. Search for anime");
        System.out.println("2. Delete anime");
        System.out.println("3. Save anime");
        System.out.println("4. Update anime");
        System.out.println("9. Go Back");
    }

    private static void clear(){
        try {
            String so = System.getProperty("os.name");

            if (so.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
