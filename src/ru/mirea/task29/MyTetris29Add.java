package ru.mirea.task29;

import java.io.*;

public class MyTetris29Add {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\79253\\Desktop\\save.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        SavedTetris savedGame = (SavedTetris) objectInputStream.readObject();
        System.out.println(savedGame);
        objectInputStream.close();
    }
}
