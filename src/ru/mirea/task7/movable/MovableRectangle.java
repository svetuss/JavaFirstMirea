package ru.mirea.task7.movable;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft = new MovablePoint(0,0,0,0);
    private MovablePoint bottomRight = new MovablePoint(0,0,0,0);

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft.x = x1;
        topLeft.y = y1;
        bottomRight.x = x2;
        bottomRight.y = y2;
        topLeft.xSpeed = xSpeed;
        topLeft.ySpeed = ySpeed;
        bottomRight.xSpeed = xSpeed;
        bottomRight.ySpeed = ySpeed;
    }
    @Override
    public String toString(){
        return("Rectangle. A: ("+topLeft.x+", "+topLeft.y+"); B: ("+bottomRight.x+", "+bottomRight.y+").");
    }
    @Override
    public void moveUp(){
        topLeft.y+=topLeft.ySpeed;
        bottomRight.y+=bottomRight.ySpeed;
    }
    @Override
    public void moveDown(){
        topLeft.y-=topLeft.ySpeed;
        bottomRight.y-=bottomRight.ySpeed;
    }
    @Override
    public void moveLeft(){
        topLeft.x-=topLeft.xSpeed;
        bottomRight.x-=bottomRight.xSpeed;
    }
    @Override
    public void moveRight(){
        topLeft.x+=topLeft.xSpeed;
        bottomRight.x+=bottomRight.xSpeed;
    }
}
