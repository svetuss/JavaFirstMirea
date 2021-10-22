package ru.mirea.task11.opt2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouse extends JFrame {
    Button south=new Button("SOUTH");
    Button center=new Button("CENTER");
    Button north=new Button("NORTH");
    Button east=new Button("EAST");
    Button west=new Button("WEST");

    Mouse() {
        super("Mouse");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(250,250);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        add(north,BorderLayout.NORTH);
        add(east,BorderLayout.EAST);
        add(west,BorderLayout.WEST);
        add(south,BorderLayout.SOUTH);
        add(center,BorderLayout.CENTER);
        MouseListener listener =new MouseListener() {
            public void mouseExited(MouseEvent e) {}
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {
                Button source= (Button) e.getSource();
                if (north.equals(source)) {
                    JOptionPane.showMessageDialog(null, "Добро пожаловать на Север!");
                } else if (east.equals(source)) {
                    JOptionPane.showMessageDialog(null, "Добро пожаловать на Восток!");
                } else if (center.equals(source)) {
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в Центр!");
                } else if (south.equals(source)) {
                    JOptionPane.showMessageDialog(null, "Добро пожаловать на Юг!");
                } else if (west.equals(source)) {
                    JOptionPane.showMessageDialog(null, "Добро пожаловать на Запад!");
                }
            }
        };
        east.addMouseListener(listener);
        north.addMouseListener(listener);
        west.addMouseListener(listener);
        south.addMouseListener(listener);
        center.addMouseListener(listener);
    }

    public static void main(String[]args) {
        new Mouse();
    }
}