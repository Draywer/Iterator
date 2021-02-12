package ru.idcore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Randoms implements Iterable<Integer> {
    private int min;
    private int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return min + (int) (Math.random() * ((max - min) + 1));
            }
        };
    }
}
