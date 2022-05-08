package com.example.jpa.jpaTest.controller;

import com.example.jpa.jpaTest.entity.Person;
import com.example.jpa.jpaTest.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/")
    public List<Person> getPerson(){
       return personService.getPerson();
    }
    @PostMapping("/savePerson")
    public void savePerson(@RequestBody Person person){
        personService.save(person);
    }
}
