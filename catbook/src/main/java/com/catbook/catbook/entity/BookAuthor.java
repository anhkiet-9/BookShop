package com.catbook.catbook.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "book_authors")
public class BookAuthor {
    private Book book;
    private Author author;
}
