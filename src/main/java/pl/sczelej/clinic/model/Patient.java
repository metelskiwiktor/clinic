package pl.sczelej.clinic.model;

import java.util.List;

public class Patient {
    private Long id;
    private String firstName;
    private String lastName;
    private List<Animal> animals;

    public Patient(String firstName, String lastName, List<Animal> animals) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.animals = animals;
    }

    public Patient() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", animals=" + animals +
                '}';
    }
}
