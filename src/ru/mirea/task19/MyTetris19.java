package ru.mirea.task19;

import java.util.Scanner;

class WrongNumberException extends Exception {
    private int lvl;
    WrongNumberException(int _lvl) {
        lvl = _lvl;
    }
    public String toString() {
        String msg = "Exception: " + lvl + " is a wrong level!";
        return msg;
    }
}

public class MyTetris19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите желаемую скорость уровня: любое число от 200 до 500. Чем оно больше, тем медленнее падают фигуры.");
        try {
            int lvl = in.nextInt();
            if (lvl > 500 || lvl < 200)
                throw new WrongNumberException(lvl);
        } catch (WrongNumberException e){
            System.out.print(e);
        }
    }
}

