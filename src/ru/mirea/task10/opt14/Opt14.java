package ru.mirea.task10.opt14;

import java.util.Scanner;

public class Opt14 {
    public static String fourteen(int n){
        n = Math.abs(n);
        if (n < 10) {
            return Integer.toString(n);
        }
        else {
            return fourteen(n / 10) + " " + n %  10;
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println("Цифры числа в обычном порядке: " + fourteen(x));
    }
}
