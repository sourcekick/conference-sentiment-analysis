package net.csa.conference;

import net.csa.conference.repository.CRUD_operationen.KonferenzRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class ConferenceMicroservice {
	KonferenzRepository kr;
    public static void main(String[] args) {
        SpringApplication.run(ConferenceMicroservice.class, args);
        /*
        Konferenz K = new Konferenz();
        K.setUuid("t1");
        K.setName("Jan");
        K.setZeitinterval(5);

        /*
        ApplicationConfiguration ac = new ApplicationConfiguration();
        ac.m*/
    }

}
