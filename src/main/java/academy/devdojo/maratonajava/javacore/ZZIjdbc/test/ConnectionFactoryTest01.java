package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.domain.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Dragon Ball Z").build();
        //ProducerService.save(producer);
        ProducerService.delete(7);
    }
}
