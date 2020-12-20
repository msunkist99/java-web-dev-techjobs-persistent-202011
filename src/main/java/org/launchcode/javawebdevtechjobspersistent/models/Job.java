package org.launchcode.javawebdevtechjobspersistent.models;



import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    //@Id
    //@GeneratedValue
    //private int id;

    @ManyToOne      //many jobs to one employer
    @NotNull(message = "Employer is required")
    private Employer employer;

    @ManyToMany()
    private List<Skill> skills = new ArrayList<>();

    // no argument constructor
    public Job() {
    }

    // constructor
    public Job(Employer anEmployer) {
        super();
        this.employer = anEmployer;
    }

    // Getters and setters.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<Skill> getSkills() {
        return skills;
    }
}
