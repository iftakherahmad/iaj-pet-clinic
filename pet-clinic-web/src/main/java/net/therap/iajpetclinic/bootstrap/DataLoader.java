package net.therap.iajpetclinic.bootstrap;

import net.therap.iajpetclinic.model.*;
import net.therap.iajpetclinic.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * @author iftakhar.ahmed
 * @since 11/14/21
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {
        if(ownerService.findAll().size()==0){
            loadData();
        }
    }

    private void loadData() {
        PetType dog=new PetType();
        dog.setName("Dog");
        PetType savedDogPetType=petTypeService.save(dog);

        PetType cat=new PetType();
        cat.setName("Cat");
        PetType savedCatPetType=petTypeService.save(cat);

        Speciality radiology=new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology=specialityService.save(radiology);

        Speciality cardiology=new Speciality();
        radiology.setDescription("cardiology");
        Speciality savedCardiology=specialityService.save(cardiology);

        Speciality anatomy=new Speciality();
        radiology.setDescription("anatomy");
        Speciality savedAnatomy=specialityService.save(anatomy);

        Owner owner1=new Owner();
        owner1.setFirstName("Ifakher");
        owner1.setLastName("Ahmad");
        owner1.setAddress("AEH, chankharpool");
        owner1.setCity("Dhaka");
        owner1.setTelephone("01779864777");

        ownerService.save(owner1);

        Pet mikesPet=new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");

        owner1.getPets().add(mikesPet);

        Owner owner2=new Owner();
        owner2.setFirstName("MD");
        owner2.setLastName("Fahim");
        owner2.setAddress("Ilisha, Jongson");
        owner2.setCity("Bhola");
        owner2.setTelephone("01644404426");

        Pet fahimsPet=new Pet();
        fahimsPet.setName("fam");
        fahimsPet.setPetType(savedCatPetType);
        fahimsPet.setOwner(owner2);
        fahimsPet.setBirthDate(LocalDate.now());
        owner2.getPets().add(fahimsPet);

        ownerService.save(owner2);
        System.out.println("Owner loaded");

        Visit catVisit=new Visit();
        catVisit.setPet(fahimsPet);
        catVisit.setDate(LocalDate.now());
        catVisit.setDescription("Mithu kkee");

        visitService.save(catVisit);
        System.out.println("Visits Loaded");

        Vet vet1=new Vet();
        vet1.setFirstName("MR.");
        vet1.setLastName("Play");
        vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2=new Vet();
        vet2.setFirstName("MR.");
        vet2.setLastName("Clay");
        vet2.getSpecialities().add(savedCardiology);

        vetService.save(vet2);

        System.out.println("Vet loaded");
    }
}
