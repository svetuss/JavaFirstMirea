package ru.mirea.task22;
import java.util.ArrayList;

enum TetrisShapes {
    NoShape, IShape, OShape;
}
public class MyTetris22 {
    public Figure createUser(TetrisShapes type) {
        Figure figure = null;
        switch (type) {
            case OShape -> figure=new OShape();
            case IShape -> figure=new IShape();
        }
        return figure;
    }

    public static void main(String[]args) {
        ArrayList<Figure> list= new ArrayList<>();
        MyTetris22 figureFactory = new MyTetris22();
        list.add(figureFactory.createUser(TetrisShapes.OShape));
        list.add(figureFactory.createUser(TetrisShapes.IShape));
        for (Figure figure : list) {
            System.out.println("Фигура " + figure.getShape());
        }
    }
}