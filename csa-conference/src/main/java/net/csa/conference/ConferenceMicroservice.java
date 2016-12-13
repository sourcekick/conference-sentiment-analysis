package net.csa.conference;

import net.csa.conference.repository.ConferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConferenceMicroservice {

    public static void main(String[] args) {
        SpringApplication.run(ConferenceMicroservice.class, args);
    }


}