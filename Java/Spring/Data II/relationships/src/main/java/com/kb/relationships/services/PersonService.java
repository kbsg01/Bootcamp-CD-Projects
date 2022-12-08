package com.kb.relationships.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kb.relationships.models.Person;
import com.kb.relationships.repositories.PersonRepository;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository pRepo;

    public PersonService(PersonRepository pRepo){
        this.pRepo = pRepo;
    }

    public List<Person> allPerson(){
        return pRepo.findAll();
    }

    public Person create(Person p){
        return pRepo.save(p);
    }

    public Person findPerson(Long id){
        Optional<Person> optionalP = pRepo.findById(id);
        if (optionalP.isPresent()) {
            return optionalP.get();
        } else {
            return null;
        }
    }
}
