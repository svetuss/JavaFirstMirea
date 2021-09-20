package ru.mirea.task2;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape("Triangle", 100);
        Shape s2 = new Shape("Pyramid");
        Shape s3 = new Shape();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
