package net.therap.iajpetclinic.model;

import java.io.Serializable;

/**
 * @author iftakhar.ahmed
 * @since 11/12/21
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}