package com.example.jpa.jpaTest.service;

import com.example.jpa.jpaTest.entity.Person;

import java.util.List;

public interface PersonService {
    void save(Person person);

    List<Person> getPerson();
}
