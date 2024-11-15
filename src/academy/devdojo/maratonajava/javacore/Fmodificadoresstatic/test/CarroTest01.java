package academy.devdojo.maratonajava.javacore.Fmodificadoresstatic.test;

import academy.devdojo.maratonajava.javacore.Fmodificadoresstatic.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        //Carro c1 = new Carro("BMW", 280);
        //Carro c2 = new Carro("Mercedes", 275);
        //Carro c3 = new Carro("Audi", 290);

        System.out.println(Carro.velocidadeLimite);
        Carro.velocidadeLimite = 180;
        System.out.println(Carro.velocidadeLimite);

    }
}
