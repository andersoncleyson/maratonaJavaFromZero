package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Elliot Anderson");
        Queue<Consumidor> consumidorQueue = new PriorityQueue<>();
        consumidorQueue.add(consumidor);
    }
}
