package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.domain.Person;

public class BuildPatternTest01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .withFirstName("Elliot")
                .withLastName("Alderson")
                .withUsername("mrRobot")
                .withEmail("elliot@ecorp.com")
                .build();
        System.out.println(build);
    }
}
