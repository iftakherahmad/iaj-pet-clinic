package net.therap.iajpetclinic.service.map;

import net.therap.iajpetclinic.model.Speciality;
import net.therap.iajpetclinic.service.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author iftakhar.ahmed
 * @since 11/17/21
 */
@Service
public class SpecialityServiceMap extends AbstractMapService<Speciality,Long> implements SpecialityService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}