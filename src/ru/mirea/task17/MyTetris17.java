package ru.mirea.task17;

enum Tetrominoes { // фигуры Тетриса
    NoShape, ZShape, SShape, IShape, TShape, OShape, LShape, JShape
}

class MyTetris17 {
    public static void main(String[] args) {
        Tetrominoes tetr;

        tetr = Tetrominoes.NoShape;

        System.out.println("Координаты незаданной фигуры " + tetr + ": { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }");

        tetr = Tetrominoes.SShape;

        if (tetr == Tetrominoes.SShape) {
            System.out.println("Координаты фигуры " + tetr + ": { 0, -1 }, { 0, 0 }, { 1, 0 }, { 1, 1 }");
        }

        tetr = Tetrominoes.OShape;

        switch (tetr) {
            case ZShape:
                System.out.println("Координаты фигуры " + tetr + ": { 0, -1 }, { 0, 0 }, { -1, 0 }, { -1, 1 }");
                break;
            case IShape:
                System.out.println("Координаты фигуры " + tetr + ": { 0, -1 }, { 0, 0 }, { 0, 1 }, { 0, 2 }");
                break;
            case TShape:
                System.out.println("Координаты фигуры " + tetr + ": { -1, 0 }, { 0, 0 }, { 1, 0 }, { 0, 1 }");
                break;
            case OShape:
                System.out.println("Координаты фигуры " + tetr + ": { 0, 0 }, { 1, 0 }, { 0, 1 }, { 1, 1 }");
                break;
            case JShape:
                System.out.println("Координаты фигуры " + tetr + ": { -1, -1 }, { 0, -1 }, { 0, 0 }, { 0, 1 }");
                break;
            case LShape:
                System.out.println("Координаты фигуры " + tetr + ": { 1, -1 }, { 0, -1 }, { 0, 0 }, { 0, 1 }");
                break;
        }
    }
}