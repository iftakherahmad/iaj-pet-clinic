package net.therap.iajpetclinic.service;

import net.therap.iajpetclinic.model.Pet;

import java.util.Set;

/**
 * @author iftakhar.ahmed
 * @since 11/12/21
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}