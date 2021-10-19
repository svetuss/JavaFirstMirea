package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Winner {
    private int pointMilan = 0;
    private int pointReal = 0;

    private JButton butMilan = new JButton("AC Milan");
    private JButton butReal = new JButton("Real Madrid");
    private JButton butRestart = new JButton("Restart");
    private JButton butFinish = new JButton("Finish");
    private JLabel labelResult = new JLabel("Result: 0 X 0");
    private JLabel labelLast = new JLabel("Last Scorer: N/A");
    private JLabel labelWinner = new JLabel("Winner: DRAW");

    void count_of_point() {
        if (pointMilan > pointReal)
            labelWinner.setText("Winner: AC Milan");
        else {
            if (pointReal > pointMilan) {
                labelWinner.setText("Winner: Real Madrid");
            }
            else {
                labelWinner.setText("Winner: DRAW");
            }
        }
    }

    public Winner() {
        JFrame frame = new JFrame("Match");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 550);
        frame.setLocationRelativeTo(null);

        labelResult.setBounds(350,30,400,30);
        labelLast.setBounds(347,90,400,25);
        labelWinner.setBounds(351,105,400,25);
        Font fontRes = new Font("Verdana", Font.BOLD, 16);
        labelResult.setFont(fontRes);
        Font font = new Font("Verdana", Font.PLAIN, 14);
        labelLast.setFont(font);
        labelWinner.setFont(font);

        butReal.setBounds(510,250,150,50);
        butMilan.setBounds(140,250,150,50);
        butRestart.setBounds(355,200,100,50);
        butFinish.setBounds(355, 300,100,50);

        frame.setLayout(null);
        frame.add(butMilan);
        frame.add(butReal);
        frame.add(butRestart);
        frame.add(butFinish);
        frame.add(labelResult);
        frame.add(labelLast);
        frame.add(labelWinner);
        frame.setVisible(true);

        butMilan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pointMilan++;
                labelResult.setText("Result: " + pointMilan + " x " + pointReal);
                labelLast.setText("Last Scorer: AC Milan");
                count_of_point();
            }
        });

        butReal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pointReal++;
                labelResult.setText("Result: " + pointMilan + " x " + pointReal);
                labelLast.setText("Last Scorer: Real Madrid");
                count_of_point();
            }
        });

        butRestart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pointMilan = 0;
                pointReal = 0;
                labelResult.setText("Result: " + pointMilan + " x " + pointReal);
                labelLast.setText("Last Scorer: N/A");
                labelWinner.setText("Winner: DRAW");
            }
        });

        butFinish.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }

    private void labelLast(Font font) {
    }

    public static void main(String[] args){
        Winner frame = new Winner();
    }
}