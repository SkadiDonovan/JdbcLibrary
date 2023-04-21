package ru.skadidonovan.library.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {
    private int id;
    @NotEmpty(message = "Нужно указать название книги")
    @Size(min = 2, max = 30, message = "Название книги должно содержать от 2 до 100 символов")
    private String title;

    @NotEmpty(message = "Нужно указать автора")
    @Size(min = 2, max = 100, message = "ФИО автора не может быть короче 2 и больше 100 символов ")
    private String author;
    private int year;

    public Book() {
    }


    public Book(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
