package com.example.jpa.jpaTest.dao;

import com.example.jpa.jpaTest.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDao extends JpaRepository<Person,Long> {
}
