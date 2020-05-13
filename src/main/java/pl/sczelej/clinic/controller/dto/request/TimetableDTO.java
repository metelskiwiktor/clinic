package pl.sczelej.clinic.controller.dto.request;

import pl.sczelej.clinic.model.Animal;
import pl.sczelej.clinic.model.Doctor;
import pl.sczelej.clinic.model.Patient;

import java.time.LocalDate;
import java.util.List;

public class TimetableDTO {
    private LocalDate start;
    private LocalDate end;
    private Long doctorId;
    private Long patientId;
    private String description;
    private List<Animal> animals;

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

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
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

    @Override
    public String toString() {
        return "TimetableDTO{" +
                "start=" + start +
                ", end=" + end +
                ", doctorId=" + doctorId +
                ", patientId=" + patientId +
                ", description='" + description + '\'' +
                ", animals=" + animals +
                '}';
    }
}
