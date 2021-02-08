package ru.idcore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Randoms implements Iterable<Integer>{
    protected List<Integer> random;

    public Randoms(int min, int max) {
        random = new ArrayList<>();
        while (true) {
            int num = min + (int)(Math.random() * ((max - min) + 1));
            if (num != 100) {
                random.add(num);
            } else {
                random.add(num);
                break;
            }
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private int nextPosition = 0;

            @Override
            public boolean hasNext() {
                if (nextPosition >= random.size()) {
                    return !random.isEmpty();
                } else {
                    return true;
                }
            }

            @Override
            public Integer next() {
                if (nextPosition >= random.size()) {
                    return random.get(0);
                } else {
                    return random.get(nextPosition++);
                }
            }
        };
    }
}
