package ru.idcore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Randoms implements Iterable<Integer>{
    protected List<Integer> random;

    public Randoms() {
        random = new ArrayList<>();
    }

    public int nextRandom(int min, int max) {
            return min + (int)(Math.random() * ((max - min) + 1));
    }

    public List<Integer> getRandom() {
        return random;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private int nextPosition = 0;

            @Override
            public boolean hasNext() {
                return true;
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
