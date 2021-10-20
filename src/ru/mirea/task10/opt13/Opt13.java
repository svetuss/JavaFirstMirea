package ru.mirea.task10.opt13;

import java.util.Scanner;

public class Opt13 {
    public static void main(String[] args) {
        System.out.println("Введите числа: ");
        Opt13 test = new Opt13();
        test.thirteen();
    }

    public static void thirteen() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n != 0) {
            int m = in.nextInt();
            System.out.println("Число на нечётной позиции " + n);
            if (m != 0) {
                thirteen();
            }
        }
    }
}
