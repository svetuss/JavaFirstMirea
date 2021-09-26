package ru.mirea.task7.movable;

public class TetsMovable {
    public static void main(String[] args){
        MovablePoint p1 = new MovablePoint(1,11,5,16);
        MovablePoint p2 = new MovablePoint(10,9,4,3);
        MovableCircle c1 = new MovableCircle(5,15,1,10, 1);
        MovableRectangle r1 = new MovableRectangle(0, 6, 11, 80,25,3);

        c1.moveUp();
        p1.moveLeft();
        r1.moveRight();
        p2.moveDown();

        System.out.println(p1+"\n"+c1+"\n"+r1+"\n"+p2);
    }
}
