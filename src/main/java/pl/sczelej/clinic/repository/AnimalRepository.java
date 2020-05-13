package pl.sczelej.clinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sczelej.clinic.model.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
