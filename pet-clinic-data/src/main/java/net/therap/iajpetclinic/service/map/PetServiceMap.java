package net.therap.iajpetclinic.service.map;

import net.therap.iajpetclinic.model.Pet;
import net.therap.iajpetclinic.service.CrudService;

import java.util.Set;

/**
 * @author iftakhar.ahmed
 * @since 11/13/21
 */
public class PetServiceMap extends AbstractMapService<Pet,Long> implements CrudService<Pet,Long> {

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
        return super.save(pet.getId(),pet);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
