package com.example.jpa.jpaTest.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {

    @Id
    private int id;
    private String name;
}
