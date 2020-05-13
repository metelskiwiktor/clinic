package pl.sczelej.clinic.model;

import java.time.LocalDate;
import java.util.List;

public class Timetable {
    private Long id;
    private LocalDate start;
    private LocalDate end;
    private Doctor doctor;
    private Patient patient;
    private String description;
    private List<Animal> animals;
    private boolean tookPlace;

    public Timetable(Long id, LocalDate start, LocalDate end, Doctor doctor, Patient patient, String description, List<Animal> animals) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.doctor = doctor;
        this.patient = patient;
        this.description = description;
        this.animals = animals;
    }

    public Timetable() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public boolean isTookPlace() {
        return tookPlace;
    }

    public void setTookPlace(boolean tookPlace) {
        this.tookPlace = tookPlace;
    }

    @Override
    public String toString() {
        return "Timetable{" +
                "id=" + id +
                "start=" + start +
                ", end=" + end +
                ", doctor=" + doctor +
                ", patient=" + patient +
                ", description='" + description + '\'' +
                ", animals=" + animals +
                '}';
    }
}
