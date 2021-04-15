package com.company;
public class Encyclopedia extends Book {
    private Integer code;
    private String author;
    private String bookName;
    private Integer year;
    private String edition;

    public Encyclopedia(Integer code, String author, String bookName, Integer year, String edition) {
        super(code, author, bookName, year, edition);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
