package ru.mirea.task8.opt2;

import javax.swing.*;
import java.util.Scanner;

public class Img {
    public static void main(String[] args)  {
        // C:\Users\79253\IdeaProjects\JavaFirstMirea\src\ru\mirea\task8\opt2\opt2img.jpg
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        // воспользуемся классом иконок ImageIcon для загрузки собственных изображений
        Icon icon = new ImageIcon(path);
        JLabel lab = new JLabel(icon);
        JFrame frame = new JFrame("Image");
        frame.add(lab);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
