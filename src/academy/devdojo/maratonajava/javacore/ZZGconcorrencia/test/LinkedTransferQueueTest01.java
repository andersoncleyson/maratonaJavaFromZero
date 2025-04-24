package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("elliot"));
        System.out.println(tq.offer("elliot"));
        System.out.println(tq.offer("elliot", 10, TimeUnit.SECONDS));
        tq.put("DevDojo");

        if(tq.hasWaitingConsumer()) {
            tq.transfer("Devojo");
        }


        System.out.println(tq.tryTransfer("Academy"));
        System.out.println(tq.tryTransfer("Academy", 5, TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remainingCapacity());
    }
}
