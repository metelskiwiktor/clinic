package pl.sczelej.clinic.service;

import org.springframework.stereotype.Service;
import pl.sczelej.clinic.controller.dto.request.DoctorDTO;
import pl.sczelej.clinic.model.Doctor;
import pl.sczelej.clinic.repository.DoctorRepository;

@Service
public class DoctorService {
    private DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public void createDoctor(DoctorDTO doctorDTO){
        Doctor doctor = new Doctor(doctorDTO.getFirstName(), doctorDTO.getLastName());
        doctorRepository.save(doctor);
    }

    public Doctor getDoctor(Long id){
        return doctorRepository.getOne(id);
    }
}
