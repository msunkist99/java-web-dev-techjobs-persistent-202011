package org.launchcode.javawebdevtechjobspersistent.models;



import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Job extends AbstractEntity{

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne      //many jobs to one employer
    @NotNull(message = "Employer is required")
    private Employer employer;
    private String skills;

    // no argument constructor
    public Job() {
    }

    // constructor
    public Job(Employer anEmployer, String someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
