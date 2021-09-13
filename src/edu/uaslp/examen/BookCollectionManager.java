package edu.uaslp.examen;

import java.util.ArrayList;
import java.util.List;

public class BookCollectionManager {

    private ArrayList<BookCollection> collections;
    
    public BookCollection createCollection(String name){

        BookCollection bookCollection = new BookCollection(name);
        collections.add(bookCollection);
        return bookCollection;
    }

    public BookCollection getCollectionByName(String name) {

        BookCollection bookCollection = new BookCollection(name);

        for (int i = 0; i < collections.size(); i++) {
            if (bookCollection.getName() == name) {
                return bookCollection;
            }
            return null;
        }
    }

    public void deleteCollectionByName(String name) {
        BookCollection bookCollection2 = new BookCollection(name);

        for (int i = 0; i < collections.size(); i++) {
            if (bookCollection2.getName() == name) {
                collections.remove(name);
            }
        }
    }

    public void addBookToCollection(String collectionName, Book book) {

    }

    public List<String> getCollectionNames(){
        return collections.getname();
    }
}
