package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.domain.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ConnectionFactoryTest01 {
    private static final Logger log = LogManager.getLogger(ConnectionFactoryTest01.class);

    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Cavaleiros dos Zodíacos").build();
        //ProducerRepository.save(producer);
        //Producer producerToUpdate = Producer.builder().id(5).name("Sant Seiya").build();
        //ProducerService.save(producer);
        //ProducerService.update(producerToUpdate);
        //List <Producer> producers = ProducerService.findAll();
        //log.info("Producers found {}", producers);

        //List<Producer> producers = ProducerService.findAll();
        //log.info("Producers found '{}'", producers);

        //ProducerService.showProducerMetaData();
        //ProducerService.showDriverMetaData();
        ProducerService.showTypeScrollWorking();
    }
}
