package ru.mirea.task8.opt3;

import javax.swing.*;

public class Animation extends JFrame{
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(390,290);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        JLabel photo = new JLabel("", JLabel.CENTER);
        frame.add(photo);
        String path1 = "C:\\Users\\79253\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\opt3_1.jpg";
        String path2 = "C:\\Users\\79253\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\opt3_2.jpg";
        String path3 = "C:\\Users\\79253\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\opt3_3.jpg";
        String path4 = "C:\\Users\\79253\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\opt3_4.jpg";
        String path5 = "C:\\Users\\79253\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\opt3_5.jpg";
        String path6 = "C:\\Users\\79253\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\opt3_6.jpg";
        String path7 = "C:\\Users\\79253\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\opt3_7.jpg";
        String path8 = "C:\\Users\\79253\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\opt3_8.jpg";
        String path9 = "C:\\Users\\79253\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\opt3_9.jpg";
        String path10 = "C:\\Users\\79253\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\opt3_10.jpg";

        while(true) {
            photo.setIcon(new ImageIcon(path1));
            Thread.sleep(80);
            photo.setIcon(new ImageIcon(path2));
            Thread.sleep(80);
            photo.setIcon(new ImageIcon(path3));
            Thread.sleep(80);
            photo.setIcon(new ImageIcon(path4));
            Thread.sleep(80);
            photo.setIcon(new ImageIcon(path5));
            Thread.sleep(80);
            photo.setIcon(new ImageIcon(path6));
            Thread.sleep(80);
            photo.setIcon(new ImageIcon(path7));
            Thread.sleep(80);
            photo.setIcon(new ImageIcon(path8));
            Thread.sleep(80);
            photo.setIcon(new ImageIcon(path9));
            Thread.sleep(80);
            photo.setIcon(new ImageIcon(path10));
            Thread.sleep(80);
        }
    }
}