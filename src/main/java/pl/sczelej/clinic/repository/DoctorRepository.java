package pl.sczelej.clinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sczelej.clinic.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
