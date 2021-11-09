package ru.mirea.task14.opt5;

import ru.mirea.task14.opt1.BotvaStack;
import javax.swing.*;
import java.awt.*;

public class NewBotva extends JFrame {

    JButton addFir = new JButton("Выдать карты первому.");
    JButton addSec = new JButton("Выдать карты второму.");
    JButton playBut = new JButton("Играть.");
    JLabel firstCount = new JLabel();
    JLabel secondCount = new JLabel();
    JLabel firstplayer = new JLabel("  Первый игрок:");
    JLabel secondplayer = new JLabel("  Второй игрок:");
    JLabel cards = new JLabel("0");
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();

    public NewBotva(){
        super("Botva");
        setSize(490, 170);
        firstplayer.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        secondplayer.setFont(new Font("Times New Roman", Font.PLAIN, 20));

        panel1.add(addFir);
        panel2.add(addSec);
        panel1.add(firstplayer);
        panel2.add(secondplayer);
        panel1.add(firstCount);
        panel2.add(secondCount);

        getContentPane().add(panel1, BorderLayout.NORTH);
        getContentPane().add(panel2, BorderLayout.SOUTH);
        getContentPane().add(playBut, BorderLayout.CENTER);

        playBut.setEnabled(false);

        addFir.addActionListener(e->{
            firstCount.setText(firstCount.getText()+cards.getText());
            cards.setText((String.valueOf(Integer.parseInt(cards.getText())+1)));
            if(firstCount.getText().length() == 5) {
                addFir.setEnabled(false);
                if(secondCount.getText().length() == 5){
                    playBut.setEnabled(true);
                }
            }
        });
        addSec.addActionListener(e->{
            secondCount.setText(secondCount.getText()+cards.getText());
            cards.setText((String.valueOf(Integer.parseInt(cards.getText())+1)));
            if(secondCount.getText().length() == 5) {
                addSec.setEnabled(false);
                if(firstCount.getText().length() == 5){
                    playBut.setEnabled(true);
                }
            }
        });
        playBut.addActionListener(e->{
            JOptionPane.showMessageDialog(this, new BotvaStack(firstCount.getText(), secondCount.getText()).play());
            firstCount.setText("");
            secondCount.setText("");
            addFir.setEnabled(true);
            addSec.setEnabled(true);
            playBut.setEnabled(false);
        });
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NewBotva();
    }
}
