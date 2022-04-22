package com.techelevator.bookstore;

import java.util.*;

public class BookStoreApp {

    public static void main(String[] args) {

       Book book1 = new Book("1234", "Harry Potter Learns Java");
       book1.setPrice(10.00);
       Book book2 = new Book("4567", "Harry Potter Hates C#");
        book2.setPrice(11.00);
       Book book3 = new Book("9999", "Everybody Hates C++");
        book3.setPrice(12.00);

        ColoringBook colorBk = new ColoringBook("1112", "Java Colors Pretty Pics", "Beginner");
       // Book colorBk2 = new ColoringBook()


       //create a hashmap to store the books  (key = isbn, value is the book object)
        Map<String, Book> bookMap = new HashMap<>();


        //add the books to the map
        bookMap.put(book1.getIsbn(), book1);
        bookMap.put(book2.getIsbn(), book2);
        bookMap.put(book3.getIsbn(), book3);
        bookMap.put(colorBk.getIsbn(), colorBk);




        BookStoreApp app = new BookStoreApp();

        List<Book> myList = app.hashToList(bookMap);

        for (Book book : myList) {
            System.out.println(book.toString());
        }


    }


    private List<Book> hashToList(Map<String, Book> map) {

        List<Book> bookList = new ArrayList<>();

        // this code


        for (Map.Entry<String, Book> entry : map.entrySet()) {
            bookList.add(entry.getValue());
        }

//        Set<String> keys = map.keySet();
//
//        for (String key: keys) {
//            Book b = map.get(key);
//            bookList.add(b);
//        }




        return bookList;

    }


}
