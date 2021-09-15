package edu.uaslp.examen;


import java.util.ArrayList;
import java.util.List;

public class BookCollection {

    private String name;
    private List<Book> books;

    public BookCollection(String name){
        this.name = name;
        books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public int getStars(){
        int count = 0;
        for (Book book: books) {
            count = book.getStars() + count;
        }
        return count / books.size();
    }

}
