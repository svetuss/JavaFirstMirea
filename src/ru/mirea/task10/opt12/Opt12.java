package ru.mirea.task10.opt12;

import java.util.Scanner;

public class Opt12 {

    public static void main(String[] args) {
        System.out.println("Введите числа: ");
        Opt12 test = new Opt12();
        test.twelve();
    }

    public static int twelve() {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (Math.abs(x) % 2 == 1 && x != 0) {
            System.out.println("Нечётное число: " + x);
            return twelve();
        }
        else if (x != 0) {
            return twelve();
        }
        else {
            return 0;
        }
    }
}