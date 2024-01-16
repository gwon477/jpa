package com.example.jpa;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Book {

    @EmbeddedId
    private BookId id;
    private String genre;
    private Integer price;

    //standard getters and setters
}