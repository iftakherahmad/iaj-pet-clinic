package net.therap.iajpetclinic.model;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author iftakhar.ahmed
 * @since 11/17/21
 */
@Entity
@Table(name = "visit")
public class Visit extends BaseEntity{

    @Column(name = "date")
    private LocalDate date;

    @Lob
    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}