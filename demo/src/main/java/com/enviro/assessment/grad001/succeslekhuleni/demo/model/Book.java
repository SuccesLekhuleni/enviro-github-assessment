package com.enviro.assessment.grad001.succeslekhuleni.demo.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Books")
@Setter
@Getter
@ToString
public class Book {


    private String title;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String author;

    public Book() {

    }
    public Book(Long id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
