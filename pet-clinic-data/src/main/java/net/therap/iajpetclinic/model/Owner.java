package net.therap.iajpetclinic.model;

import java.util.Set;

/**
 * @author iftakhar.ahmed
 * @since 11/11/21
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}