package com.catbook.catbook.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String biography;

    public Author() {
    }
}