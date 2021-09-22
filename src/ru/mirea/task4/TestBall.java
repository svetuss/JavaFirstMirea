package ru.mirea.task4;

public class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball(8, 18);
        System.out.println(b);
        b.move(1, 14);
        System.out.println(b);
    }
}
