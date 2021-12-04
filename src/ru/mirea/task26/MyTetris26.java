package ru.mirea.task26;

public class MyTetris26 {
    public static void main(String[] args) {
        Figure oshape = new OShape();
        Figure ishape = new IShape();
        Figure othershape = new EverythingExcept();
        System.out.print("O-shape ");
        oshape.turn();
        System.out.print("I-shape ");
        ishape.turn();
        System.out.print("Оставшиеся: ");
        othershape.turn();
        oshape.left();
        ishape.right();
    }
}
