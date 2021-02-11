package ru.idcore;

public class Main {
    public static void main(String[] args) {
        Randoms randoms = new Randoms();
        int min = 90;
        int max = 100;
        while (true) {
            int newRandom = randoms.nextRandom(min, max);
            if (newRandom != max) {
                randoms.getRandom().add(newRandom);
            } else {
                randoms.getRandom().add(newRandom);
                for (int r : randoms.getRandom()) {
                    System.out.println("Случайное число: " + r);
                    if (r == max) {
                        System.out.println("Выпало число 100, давайте на этом закончим");
                        //break;
                    }
                }
                break;
            }
        }
    }
}
