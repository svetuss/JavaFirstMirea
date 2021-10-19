package ru.mirea.task10.opt11;

import java.util.Scanner;

public class Opt11 {
    public int eleven(){
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        if (x1 == 1) {
            int x2 = in.nextInt();
            if (x2 == 1) {
                return eleven() + x1 + x2;
            }
            else {
                int x3 = in.nextInt();
                if (x3 == 1) {
                    return eleven() + x1 + x3;
                }
                else {
                    return x1 + x2;
                }
            }
        }
        else {
            int x2 = in.nextInt();
            if (x2 == 1) {
                return eleven() + x2;
            }
            else if (x1==0 && x2==0) {
                return 0;
            }
            else {
                return eleven();
            }
        }
    }

    public static void main(String[]args)
    {
        Opt11 test = new Opt11();
        System.out.println("Введите числа: ");
        System.out.println("Результат: " + test.eleven());
    }
}
