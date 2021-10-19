package ru.mirea.task8.opt1;

import javax.swing.*;
import java.awt.*;

public class TestShapes {
    public static void main(String[] args) {
        JFrame frame = new JFrame("20 Случайных фигур");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.white);
        frame.setSize(1000, 600);
        frame.setLayout(new GridLayout(4,5));
        for (int i = 0; i < 20; i++){
            double n = (int) (Math.random() * 255) ;
            if ((n > 0) && (n < 100)) {
                frame.add(new Triangle());
            }
            if ((n>=100) && (n<179)) {
                frame.add(new Rectangle());
            }
            if ((n >= 179) && (n <= 255)) {
                frame.add(new Circle());
            }
        }
        frame.setVisible(true);
    }
}