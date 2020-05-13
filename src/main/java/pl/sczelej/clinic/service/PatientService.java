package pl.sczelej.clinic.service;

import org.springframework.stereotype.Service;
import pl.sczelej.clinic.controller.dto.request.AnimalDTO;
import pl.sczelej.clinic.controller.dto.request.PatientDTO;
import pl.sczelej.clinic.model.Animal;
import pl.sczelej.clinic.model.Patient;
import pl.sczelej.clinic.repository.PatientRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {
    private PatientRepository patientRepository;
    private AnimalService animalService;

    public PatientService(PatientRepository patientRepository, AnimalService animalService) {
        this.patientRepository = patientRepository;
        this.animalService = animalService;
    }

    public void create(PatientDTO patientDTO){
        Patient patient = new Patient(patientDTO.getFirstName(), patientDTO.getLastName(), new ArrayList<>());

        patientRepository.save(patient);
    }

    public void addAnimal(Long patientId, AnimalDTO animalDTO){
        Patient patient = patientRepository.getOne(patientId);

        Animal animal = animalService.createAnimal(animalDTO);
        List<Animal> animals = patient.getAnimals();
        if(animals == null){
            animals = new ArrayList<>();
        }

        animals.add(animal);

        patientRepository.save(patient);
    }
}
