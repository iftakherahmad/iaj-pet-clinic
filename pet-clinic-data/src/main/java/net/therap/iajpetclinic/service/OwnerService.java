package net.therap.iajpetclinic.service;

import net.therap.iajpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

/**
 * @author iftakhar.ahmed
 * @since 11/12/21
 */
public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);
}