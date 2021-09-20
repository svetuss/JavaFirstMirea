package ru.mirea.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("Green", 25);
        Ball b2 = new Ball("Red", 7);
        Ball b3 = new Ball("Orange");
        b3.setWeight(10);
        System.out.println(b1);
        b1.intoConsol();
        b2.intoConsol();
        b3.intoConsol();
    }
}
