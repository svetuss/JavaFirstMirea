package ru.mirea.task1.opt7;

import java.util.Scanner;

public class TestFactorial {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для вычисления факториала введите число x: ");
        Factorial res = new Factorial(scanner.nextInt());
        System.out.println("Факториал числа " + res.getRes()+"! равен "+res.factorial());
    }
}
