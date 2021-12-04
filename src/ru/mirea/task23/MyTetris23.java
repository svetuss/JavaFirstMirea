package ru.mirea.task23;

import java.util.ArrayList;
import java.util.Scanner;

public class MyTetris23 {
    public static Figure shapesCheck(ArrayList<Figure> figu, Figure figure) {
        for (int i = 0; i < 2; i++) {
            if (figure.hashCode() == figu.get(i).hashCode())
                return figu.get(i);
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        String colour, shapes;
        ArrayList<Figure> figu = new ArrayList<>();

        figu.add(new Figure("Yellow", "T-shape"));
        figu.add(new Figure("Green","S-shape"));

        for (int i = 0; i < 2; i++) {
            System.out.println(figu.get(i));
        }

        System.out.print("Colour of Tetris figure: ");
        colour = inScanner.next();
        System.out.print("Shape: ");
        shapes = inScanner.next();

        while (shapesCheck(figu, new Figure(colour, shapes)) == null) {
            System.out.println("Re-enter!");
            System.out.print("Colour of Tetris figure: ");
            colour = inScanner.next();
            System.out.print("Shape: ");
            shapes = inScanner.next();
        }

        Figure figure = shapesCheck(figu, new Figure(colour, shapes));
        System.out.println("Your Tetris figure: "+ figure.getColour() + " " + figure.getShapes());
    }
}
