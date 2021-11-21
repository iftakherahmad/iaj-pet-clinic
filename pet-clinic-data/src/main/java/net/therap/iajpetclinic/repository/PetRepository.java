package net.therap.iajpetclinic.repository;

import net.therap.iajpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * @author iftakhar.ahmed
 * @since 11/20/21
 */
public interface PetRepository extends CrudRepository<Pet,Long> {
}