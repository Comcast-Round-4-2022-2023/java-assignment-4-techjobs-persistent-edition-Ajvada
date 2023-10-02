package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Name is required.")
    @Size(max = 100, message = "Location must be under 100 characters.")
    public String location;

    @OneToMany // Data Table relationship , employer can have multiple jobs
    @JoinColumn(name = "employer_id")
    private final List<Job> jobs = new ArrayList<>(); // list of all items in a given job

    public Employer() { // Default Constructor?
    }

    public Employer(String location) {
        super();
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
