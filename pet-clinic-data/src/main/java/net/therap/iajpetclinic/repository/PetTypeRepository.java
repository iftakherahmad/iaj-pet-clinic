package net.therap.iajpetclinic.repository;

import net.therap.iajpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * @author iftakhar.ahmed
 * @since 11/20/21
 */
public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
