package net.therap.iajpetclinic.service.map;

import net.therap.iajpetclinic.model.BaseEntity;

import java.util.*;

/**
 * @author iftakhar.ahmed
 * @since 11/13/21
 */
public abstract class AbstractMapService<T extends BaseEntity,ID extends Long> {

    protected Map<Long,T> map;

    public AbstractMapService(){
        this.map=new HashMap<>();
    }

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T object){
        if(object!=null){
            if(object.getId()==null){
                object.setId(getNextId());
            }
            map.put(object.getId(),object);
        }else {
            throw new RuntimeException("Object can not be null!!!");
        }
        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry->entry.getValue().equals(object));
    }

    private Long getNextId(){
        try {
            return Collections.max(map.keySet())+1;
        }catch (Exception e){
            return 1L;
        }
    }
}