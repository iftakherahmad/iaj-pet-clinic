package net.therap.iajpetclinic.service.springdatajpa;

import net.therap.iajpetclinic.model.Visit;
import net.therap.iajpetclinic.repository.VisitRepository;
import net.therap.iajpetclinic.service.VisitService;
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
public class VisitServiceSDJpa implements VisitService {

    private final VisitRepository visitRepository;

    public VisitServiceSDJpa(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits=new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}