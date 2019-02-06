package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(BuddyInfoRepository repository) {
        return (args) -> {

            // save a couple of customers
            repository.save(new BuddyInfo("Jack", 15, "324-235-1356"));
            repository.save(new BuddyInfo("Chloe", 16, "234-346-2341"));
            repository.save(new BuddyInfo("Kim", 20, "234-153-1235"));
            repository.save(new BuddyInfo("David", 30, "123-534-5464"));
            repository.save(new BuddyInfo("Michelle", 12, "134-345-4567"));
        };
    }

}