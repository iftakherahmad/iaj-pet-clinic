package net.therap.iajpetclinic.repository;

import net.therap.iajpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * @author iftakhar.ahmed
 * @since 11/20/21
 */
public interface OwnerRepository extends CrudRepository<Owner,Long> {
}