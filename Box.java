package com.telran.project.hashMap.boxmap;
import java.util.Objects;

public class Box implements Comparable {
    private char letter;

    public char getLetter() {
        return letter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return letter == box.letter;
    }

    @Override
    public int hashCode() {

        return Objects.hash(letter);
    }

    public Box(char letter) {
        this.letter = letter;
    }

    @Override
    public int compareTo(Object o) {
        return this.letter - ((Box) o).letter;
    }
}
