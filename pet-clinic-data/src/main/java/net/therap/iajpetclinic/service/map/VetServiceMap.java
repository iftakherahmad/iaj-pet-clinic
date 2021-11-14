package net.therap.iajpetclinic.service.map;

import net.therap.iajpetclinic.model.Vet;
import net.therap.iajpetclinic.service.CrudService;
import net.therap.iajpetclinic.service.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author iftakhar.ahmed
 * @since 11/13/21
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}