package org.example;

public class Book {
    String title;
    String author;
    int yearOfPublication;
    int numberOfPages;
    double price;

    public Book(String title, String author, int yearOfPublication, int numberOfPages, double price) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public Book(String title, String author) {
        this(title, author, 0, 0, 0);
    }

    public Book(String title, String author, int yearOfPublication) {
        this(title, author, yearOfPublication, 0, 0);
    }

    public Book(String title, String author, int yearOfPublication, int numberOfPages) {
        this(title, author, yearOfPublication, numberOfPages, 0);
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

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Назваение: " + getTitle());
        System.out.println("Автор: " + getAuthor());
        System.out.println("Год издания: " + getYearOfPublication());
        System.out.println("Количество страниц: " + getNumberOfPages());
        System.out.println("Цена: " + getPrice());
    }

    public boolean isClassic() {
        if (getYearOfPublication() < 1990) {
            return true;
        } else {
            return false;
        }
    }
}
