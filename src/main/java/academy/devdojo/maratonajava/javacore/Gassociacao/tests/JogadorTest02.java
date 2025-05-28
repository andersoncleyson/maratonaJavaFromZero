package academy.devdojo.maratonajava.javacore.Gassociacao.tests;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Zico");
        Time time = new Time("Flamengo");

        jogador1.setTime(time);

        jogador1.imprime();
    }
}
