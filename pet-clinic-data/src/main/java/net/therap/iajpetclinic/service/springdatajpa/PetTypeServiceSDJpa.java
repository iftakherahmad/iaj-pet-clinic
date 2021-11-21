package net.therap.iajpetclinic.service.springdatajpa;

import net.therap.iajpetclinic.model.PetType;
import net.therap.iajpetclinic.repository.PetTypeRepository;
import net.therap.iajpetclinic.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author iftakhar.ahmed
 * @since 11/21/21
 */
@Service
@Profile("SDJPA")
public class PetTypeServiceSDJpa implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeServiceSDJpa(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes=new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long aLong) {
        return null;
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void delete(PetType object) {
        petTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById(aLong);
    }
}