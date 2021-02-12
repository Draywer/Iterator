package ru.idcore;

public class Main {
    public static void main(String[] args) {
        int min = 90;
        int max = 100;
        for (int r : new Randoms(min, max)) {
            System.out.println("Случайное число: " + r);
            if (r == max) {
                System.out.printf("Выпало число %d, давайте на этом закончим\n", max);
                break;
            }
        }
    }
}
