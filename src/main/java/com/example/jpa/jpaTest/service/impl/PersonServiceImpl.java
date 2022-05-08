package com.example.jpa.jpaTest.service.impl;

import com.example.jpa.jpaTest.dao.PersonDao;
import com.example.jpa.jpaTest.entity.Person;
import com.example.jpa.jpaTest.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public void save(Person person) {
        personDao.save(person);
    }

    @Override
    public List<Person> getPerson() {
        return personDao.findAll();
    }


}
