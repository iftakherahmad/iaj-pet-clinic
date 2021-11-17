package net.therap.iajpetclinic.model;

import java.util.Set;

/**
 * @author iftakhar.ahmed
 * @since 11/11/21
 */
public class Vet extends Person {

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}