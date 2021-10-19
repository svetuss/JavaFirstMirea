package ru.mirea.task10.opt13;

import java.util.Scanner;

public class Opt13 {
    public static void main(String[] args) {
        System.out.println("Введите числа: ");
        Opt13 test = new Opt13();
        test.thirteen();
    }

    public int thirteen() {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x!=0) {
            System.out.println("Число с нечётным номером: " + x);
            return thirteen();
        }
        else {
            return 0;
        }
    }
}
