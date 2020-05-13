package pl.sczelej.clinic.service;

import org.springframework.stereotype.Service;
import pl.sczelej.clinic.controller.dto.request.AnimalDTO;
import pl.sczelej.clinic.model.Animal;
import pl.sczelej.clinic.repository.AnimalRepository;

@Service
public class AnimalService {
    private AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public Animal createAnimal(AnimalDTO animalDTO){
        Animal animal = new Animal(animalDTO.getName(), animalDTO.getBorn(), animalDTO.getType(), animalDTO.getColor());
        return animalRepository.save(animal);
    }

}
