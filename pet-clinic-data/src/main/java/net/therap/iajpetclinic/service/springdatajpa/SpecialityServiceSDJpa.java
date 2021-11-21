package net.therap.iajpetclinic.service.springdatajpa;

import net.therap.iajpetclinic.model.Speciality;
import net.therap.iajpetclinic.repository.SpecialityRepository;
import net.therap.iajpetclinic.service.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author iftakhar.ahmed
 * @since 11/21/21
 */
@Service
@Profile("SDJPA")
public class SpecialityServiceSDJpa implements SpecialityService {

    private final SpecialityRepository specialityRepository;

    public SpecialityServiceSDJpa(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialityRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }
}