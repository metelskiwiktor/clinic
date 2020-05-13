package pl.sczelej.clinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sczelej.clinic.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
