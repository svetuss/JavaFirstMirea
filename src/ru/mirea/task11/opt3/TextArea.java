package ru.mirea.task11.opt3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextArea extends JFrame {

    JMenuBar menuBar = new JMenuBar();
    JTextField field = new JTextField(9);
    JMenu font = new JMenu("Font");
    JMenu color = new JMenu("Color");
    JMenuItem courier = new JMenuItem("Courier New");
    JMenuItem timesRoman = new JMenuItem("Times new Roman");
    JMenuItem bradley = new JMenuItem("Bradley Hand ITC");
    JMenuItem yellow = new JMenuItem("Yellow");
    JMenuItem blue = new JMenuItem("Blue");
    JMenuItem green = new JMenuItem("Green");

    TextArea() {
        super("TextArea");
        setPreferredSize(new Dimension(310, 115));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());
        field.setFont(new Font("TimesRoman", Font.PLAIN, 32));
        menuBar.add(color);
        menuBar.add(font);
        setJMenuBar(menuBar);
        font.add(timesRoman);
        font.add(courier);
        font.add(bradley);
        color.add(yellow);
        color.add(blue);
        color.add(green);
        ActionListener alistener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JMenuItem jMenuItem=(JMenuItem)e.getSource();
                if (yellow.equals(jMenuItem)) {
                    field.setForeground(Color.YELLOW);
                } else if (blue.equals(jMenuItem)) {
                    field.setForeground(Color.BLUE);
                } else if (green.equals(jMenuItem)) {
                    field.setForeground(Color.GREEN);
                } else if (timesRoman.equals(jMenuItem)) {
                    field.setFont(new Font("Times new roman", Font.PLAIN, 32));
                } else if (bradley.equals(jMenuItem)) {
                    field.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 32));
                } else if (courier.equals(jMenuItem)) {
                    field.setFont(new Font("Courier New", Font.PLAIN, 32));
                }
            }
        };
        courier.addActionListener(alistener);
        timesRoman.addActionListener(alistener);
        bradley.addActionListener(alistener);
        yellow.addActionListener(alistener);
        green.addActionListener(alistener);
        blue.addActionListener(alistener);
        pack();
        add(field);
        setLocationRelativeTo(null);
    }

    public static void main(String[]args) {
        new TextArea();
    }
}
