package pl.sczelej.clinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sczelej.clinic.model.Timetable;

public interface TimetableRepository extends JpaRepository<Timetable, Long> {
}
