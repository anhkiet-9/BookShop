package com.catbook.catbook.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "book_categories")
public class BookCategory {
    private Book book;
    private Category category;
}
