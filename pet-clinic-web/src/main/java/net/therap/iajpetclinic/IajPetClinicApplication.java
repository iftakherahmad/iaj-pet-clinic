package net.therap.iajpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.web.ManagementContextConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ManagementContextConfiguration
public class IajPetClinicApplication {

    public static void main(String[] args) {
        SpringApplication.run(IajPetClinicApplication.class, args);
    }
}