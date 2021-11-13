package net.therap.iajpetclinic.service.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author iftakhar.ahmed
 * @since 11/13/21
 */
public abstract class AbstractMapService<T,ID> {

    protected Map<ID,T> map;

    public AbstractMapService(){
        this.map=new HashMap<>();
    }

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(ID id,T object){
        map.put(id,object);
        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry->entry.getValue().equals(object));
    }
}