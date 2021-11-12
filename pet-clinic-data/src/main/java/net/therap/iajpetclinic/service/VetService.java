package net.therap.iajpetclinic.service;


import net.therap.iajpetclinic.model.Vet;

import java.util.Set;

/**
 * @author iftakhar.ahmed
 * @since 11/12/21
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}