package ru.mirea.task10.opt15;

import java.util.Scanner;

public class Opt15 {
    public static int fifteen(int n) {
        n= Math.abs(n);
        if (n > 10) {
            System.out.print(n % 10 + " ");
            return fifteen(n / 10);
        }
        else {
            return n;
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println("Цифры числа в обратном порядке: ");
        System.out.println(fifteen(x));
    }
}
