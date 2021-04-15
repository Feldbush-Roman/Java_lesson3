package com.company;

public class Directory extends Book {
    private Integer code;
    private String author;
    private String bookName;
    private Integer year;
    private String edition;

    public Directory(Integer code, String author, String bookName, Integer year, String edition) {
        super(code, author, bookName, year, edition);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
