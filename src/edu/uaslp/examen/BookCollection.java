package edu.uaslp.examen;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {

    private String name;
    private ArrayList<Book> books;

    public BookCollection(String name){
        this.name = name;
        books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addBook(Book book){

        book.setTitle(book.getTitle());
        book.setIsbn(book.getIsbn());
        book.setAuthor(book.getAuthor());
        book.setStars(book.getStars());

        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public int getStars(){
        int count;
        for (int i=0;i<books.size();i++) {
            count = books.getStars + count;
        }
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }
}
