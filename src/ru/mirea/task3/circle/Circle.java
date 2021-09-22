package ru.mirea.task3.circle;

public class Circle {
    private int diametr;

    public Circle(int diametr){
        this.diametr = diametr;
    }

    public void setDiametr(int diametr){
        this.diametr = diametr;
    }
    public int getDiametr(){
        return diametr;
    }
    public void intoRadius(){
        System.out.println("Радиус равен " + diametr/2);
    }
}