package ru.mirea.task1.opt7;

public class Factorial {
    private int x;

    public Factorial(int x) {
        this.x = x;
    }

    public int factorial() {
        int result = 1;
        for (int i=1; i<=x;i++)
            result *= i;
        return result;
    }
    public int getRes(){
        return x;
    }
}
