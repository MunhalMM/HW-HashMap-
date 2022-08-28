package com.telran.project.hashMap.boxmap;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoxMap {
    public static void main(String[] args) throws IOException {

        Book bookOne = new Book("Operation system administration", "Admin", 110);
        Book bookTwo = new Book("System administration", "Admin", 110);
        Book bookThree = new Book("Linux administration", "Admin", 110);
        Book bookFour = new Book("Oracle administration", "Admin", 110);

        Map<Box, List<Book>> catalog = new HashMap<>();
        BoxMap boxmap = new BoxMap();
        boxmap.putBooksToCatalog(catalog, bookOne, bookTwo, bookThree, bookFour);

        catalog.forEach((k, v) -> {
            System.out.println("Box letter " + k.getLetter() + " :" + v.toString());
        });
        System.out.println("Input letter : ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        List<Book> bookList = catalog.get(new Box(s.charAt(0)));
        System.out.println(bookList);
    }

    private void putBooksToCatalog(Map<Box, List<Book>> catalog, Book... books) {
        for (Book book : books) {
            char alphabetIndex = book.getAlphabetIndex();
            Box box = getBox(alphabetIndex);
            List<Book> bookList;
            if (catalog.containsKey(box)) {
                bookList = catalog.get(box);
                bookList.add(book);
            } else {
                bookList = new ArrayList<>();
                bookList.add(book);
                catalog.put(box, bookList);
            }

        }
    }

    private Box getBox(char letter) {
        return new Box(letter);
    }
}
