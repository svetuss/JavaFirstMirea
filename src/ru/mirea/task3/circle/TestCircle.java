package ru.mirea.task3.circle;

import ru.mirea.task3.circle.Circle;

public class TestCircle {
    public static void main(String[] ars){
        Circle c = new Circle(3);
        c.setDiametr(56);
        System.out.println("Диаметр равен " + c.getDiametr());
        c.intoRadius();
    }
}
