package ru.mirea.task11.opt1;

import javax.swing.*;
import java.awt.*;

public class Game extends JFrame{
    int x, att;
    JButton butTry = new JButton(" Угадать! ");
    JLabel mess = new JLabel("Угадайте число между 0 и 20. У Вас 3 попытки.");
    JLabel title = new JLabel("Угадайте число!");
    JTextField field = new JTextField(15);

    Game() {
        super("Угадайте число!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        x=(int)(Math.random()*20);
        att=0;

        Font font1 = new Font("Verdana", Font.BOLD, 16);
        title.setFont(font1);
        Font font2 = new Font("Verdana", Font.PLAIN, 14);
        mess.setFont(font2);

        GridBagLayout gridBagLayout = new GridBagLayout();
        Container container = getContentPane();
        GridBagConstraints constraints = new GridBagConstraints();
        container.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        setLayout(gridBagLayout);
        constraints.fill = GridBagConstraints.VERTICAL;

        setSize(550, 270);
        constraints.gridy=0;
        constraints.weighty=1;
        //constraints.gridx=2;
        container.add(title, constraints);
        constraints.gridy=5;
        container.add(mess, constraints);
        constraints.gridy=2;
        container.add(butTry, constraints);
        constraints.gridy=3;
        container.add(field, constraints);

        butTry.addActionListener(ae -> {
            int number;
            try {
                number=Integer.parseInt(field.getText().trim());
                att++;
                if (att==3) {
                    title.setText("Вы проиграли! Попытки закончились!");
                    field.setVisible(false);
                    mess.setVisible(false);
                    butTry.setVisible(false);
                    title.setForeground(Color.BLUE);
                }
                if (number>x) {
                    if (att!=1) {
                        mess.setText("Неверно! Число должно быть меньше. У вас осталось: " + (3 - att) + " попытка");
                    }
                    else {
                        mess.setText("Неверно! Число должно быть меньше. У вас осталось: " + (3 - att) + " попытки");
                    }
                }
                else if(number<x) {
                    if (att!=1) {
                        mess.setText("Неверно! Число должно быть больше. У вас осталось: " + (3 - att) + " попытка");
                    }
                    else {
                        mess.setText("Неверно! Число должно быть больше. У вас осталось: " + (3 - att) + " попытки");
                    }
                }
                else
                {
                    field.setVisible(false);
                    butTry.setVisible(false);
                    title.setVisible(false);
                    mess.setForeground(Color.GREEN);
                    mess.setText("Вы победили! Поздравляю!");
                }
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null,"Только целочисленные числа!");
            }
        });
    }

    public static void main(String []args)
    {
        new Game();
    }
}
