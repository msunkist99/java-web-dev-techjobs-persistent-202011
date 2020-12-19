package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity     //class that will be mapped to database table
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location cannot be blank.")
    @Size(max=25, message="Location must be 25 characters or less.")
    private String location;

    // no argument constructor, required for Hibernate to create an object.
    public Employer(){}
    public Employer( String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
