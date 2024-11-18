package academy.devdojo.maratonajava.javacore.Gassociacao.tests;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Messi");
        Jogador jogador3 = new Jogador("Iniesta");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for(Jogador jogador: jogadores){
            jogador.imprime();
        }
    }
}
