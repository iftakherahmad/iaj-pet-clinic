package net.therap.iajpetclinic.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author iftakhar.ahmed
 * @since 11/12/21
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}