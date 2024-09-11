package com.sda.advanced.collections.CollectionsTask2and4;

import java.util.List;
import java.util.Objects;

public class Book {
    private String title;
    private double price;
    private int year;
    private List<Author> authors;
    private Genre genre;

    public Book(String title, double price, int year, List<Author> authors, Genre genre) {
        this.title = title;
        this.price = price;
        this.year = year;
        this.authors = authors;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && year == book.year && Objects.equals(title, book.title) && Objects.equals(authors, book.authors) && genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, year, authors, genre);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", authors=" + authors +
                ", genre=" + genre +
                '}';
    }
}
