package ru.mirea.task29;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MyTetris29 {
    public static void main(String[] args) throws IOException {
        ShapesInfo shapesInfo = new ShapesInfo("S-Shape, T-Shape, O-Shape");
        ColourInfo colourInfo = new ColourInfo("Red figure, Green figure, Yellow figure");
        SavedTetris savedGame = new SavedTetris(shapesInfo, colourInfo);
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\79253\\Desktop\\save.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(savedGame);
        objectOutputStream.flush();
        objectOutputStream.close();
    }
}

