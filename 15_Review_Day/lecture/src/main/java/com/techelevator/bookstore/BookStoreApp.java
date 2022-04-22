package com.techelevator.bookstore;

import com.techelevator.bookstore.Book;

import java.util.*;

    public class BookStoreApp {

        public static void main(String[] args) {

            Book book1 = new Book("123", "Harry Potter");
            book1.setPrice(10.00);
            Book book2 = new Book("456", "Ziggy");
            book2.setPrice(20.00);
            Book book3 = new Book("789", "Goosebumps");
            book3.setPrice(30.00);

            ColoringBook colorBk = new ColoringBook("123", "Red light Green light", "Beginner");





            //create a hashmap to store the books  (key = isbn, value is the book object)
            Map<String, Book> bookMap = new HashMap<>();


            //add the books to the map
            bookMap.put(book1.getIsbn(), book1);
            bookMap.put(book2.getIsbn(), book2);
            bookMap.put(book3.getIsbn(), book3);
            bookMap.put(colorBk.getIsbn(), colorBk);

            BookStoreApp app = new BookStoreApp();

            List<Book> myList = app.hashToList(bookMap);

            for(Book book : myList) {
                System.out.println(book.toString());
            }

        }


        private List<Book> hashToList (Map<String, Book> map) {

            List<Book> bookList = new ArrayList<>();

            for (Map.Entry<String, Book> entry : map.entrySet()) {
                bookList.add(entry.getValue());
            }
            return bookList;
        }
    }



