package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Porsche";
        carro1.modelo = "911";
        carro1.ano = 2020;

        carro2 = carro1;

        System.out.println(carro1.nome + "\n" + carro1.modelo + "\n" + carro1.ano);
        System.out.println(carro2.nome + "\n" + carro2.modelo + "\n" + carro2.ano);
    }
}
