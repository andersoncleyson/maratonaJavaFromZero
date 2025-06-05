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
        Producer producerToUpdate = Producer.builder().id(1).name("DRAGON BALL Z").build();
        //ProducerService.save(producer);
        //ProducerService.update(producerToUpdate);
        //List <Producer> producers = ProducerService.findAll();
        //log.info("Producers found {}", producers);

        //List<Producer> producers = ProducerService.findAll();
        //log.info("Producers found '{}'", producers);

        //ProducerService.showProducerMetaData();
        //ProducerService.showDriverMetaData();
        //ProducerService.showTypeScrollWorking();
        //List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Naruto");
        //List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("A-1 pictures");
        //ProducerService.findByNameAndDelete("A-1 pictures");
        //log.info("Producers found '{}'", producers);
        //List<Producer> producers = ProducerService.findByNamePreparedStatement("B");
        //log.info("Producers found '{}'", producers);
        //ProducerService.updatePreparedStatement(producerToUpdate);
        List<Producer> producers = ProducerService.findByNameCallableStatement("naruto");
        log.info("Producers found '{}'", producers);
    }
}
