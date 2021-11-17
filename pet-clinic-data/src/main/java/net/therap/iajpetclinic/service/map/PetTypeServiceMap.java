package net.therap.iajpetclinic.service.map;

import net.therap.iajpetclinic.model.PetType;
import net.therap.iajpetclinic.service.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author iftakhar.ahmed
 * @since 11/17/21
 */
@Service
public class PetTypeServiceMap extends AbstractMapService<PetType,Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }
}