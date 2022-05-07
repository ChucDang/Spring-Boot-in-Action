package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(force=true,access = AccessLevel.PRIVATE)
@Entity
public class Ingredient {
    @Id
    private final String id;
    private final String name;
    private final Type type;
    
    public static enum Type {
      WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
