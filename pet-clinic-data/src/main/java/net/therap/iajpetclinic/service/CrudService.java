package net.therap.iajpetclinic.service;

import java.util.Set;

/**
 * @author iftakhar.ahmed
 * @since 11/13/21
 */
public interface CrudService<T,ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}