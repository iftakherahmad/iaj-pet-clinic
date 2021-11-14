package net.therap.iajpetclinic.bootstrap;

import net.therap.iajpetclinic.model.Owner;
import net.therap.iajpetclinic.model.Vet;
import net.therap.iajpetclinic.service.OwnerService;
import net.therap.iajpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author iftakhar.ahmed
 * @since 11/14/21
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1=new Owner();
        owner1.setFirstName("Ifakher");
        owner1.setLastName("Ahmad");

        ownerService.save(owner1);

        Owner owner2=new Owner();
        owner2.setFirstName("MD");
        owner2.setLastName("Fahim");

        ownerService.save(owner2);

        System.out.println("Owner loaded");

        Vet vet1=new Vet();
        vet1.setFirstName("MR.");
        vet1.setLastName("Play");

        vetService.save(vet1);

        Vet vet2=new Vet();
        vet2.setFirstName("MR.");
        vet2.setLastName("Clay");

        vetService.save(vet2);

        System.out.println("Vet loaded");
    }
}
