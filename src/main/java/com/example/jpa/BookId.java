package com.example.jpa;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class BookId implements Serializable {

    private String author;
    private String name;

    // standard getters and setters
}
