package net.therap.iajpetclinic.service.map;

import net.therap.iajpetclinic.model.Pet;
import net.therap.iajpetclinic.service.CrudService;
import net.therap.iajpetclinic.service.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author iftakhar.ahmed
 * @since 11/13/21
 */
@Service
@Profile({"default","MAP"})
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
