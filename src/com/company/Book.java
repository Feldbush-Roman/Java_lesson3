package com.company;

public abstract class Book {
    private Integer code;
    private String author;
    private String bookName;
    private Integer year;
    private String edition;


    public Book(Integer code, String author, String bookName, Integer year, String edition) {
        this.code = code;
        this.author = author;
        this.bookName = bookName;
        this.year = year;
        this.edition = edition;
    }

    @Override
    public String toString() {
        return "Book{" +
                "code=" + code +
                ", author='" + author + '\'' +
                ", bookName='" + bookName + '\'' +
                ", year=" + year +
                ", edition='" + edition + '\'' +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }
}
