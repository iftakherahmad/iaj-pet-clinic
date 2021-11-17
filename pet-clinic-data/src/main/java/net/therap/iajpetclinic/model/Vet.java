package net.therap.iajpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author iftakhar.ahmed
 * @since 11/11/21
 */
public class Vet extends Person {

    private Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}