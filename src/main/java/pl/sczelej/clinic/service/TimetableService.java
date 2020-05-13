package pl.sczelej.clinic.service;

import org.springframework.stereotype.Service;
import pl.sczelej.clinic.repository.TimetableRepository;

@Service
public class TimetableService {
    private TimetableRepository timetableRepository;

    public TimetableService(TimetableRepository timetableRepository) {
        this.timetableRepository = timetableRepository;
    }

    private void createVisit(){

    }
}
