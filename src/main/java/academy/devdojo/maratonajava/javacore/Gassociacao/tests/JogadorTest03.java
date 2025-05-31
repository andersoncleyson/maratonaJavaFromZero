package academy.devdojo.maratonajava.javacore.Gassociacao.tests;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Time time = new Time("Flamengo");
        Jogador jogador1 = new Jogador("Arrascaeta");
        Jogador jogador2 = new Jogador("BH");
        Jogador jogador3 = new Jogador("Pedro Queixada");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};


        time.setJogadores(jogadores);

        time.imprime();
    }
}
