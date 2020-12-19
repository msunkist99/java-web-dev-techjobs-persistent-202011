package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity     //class that will be mapped to database table
public class Skill extends AbstractEntity {

    @Size(max=250, message = "Description must be 250 characters or less.")
    private String description;

    // no argument constructor, required for Hibernate to create an object.
    public Skill() {
    }

    public Skill(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}