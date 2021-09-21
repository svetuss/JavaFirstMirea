package ru.mirea.task1.opt6;

import ru.mirea.task1.opt3.Sum;

import java.util.Scanner;

public class TestSort {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер первого целочисленного массива: ");
        Sort arrayOne = new Sort();
        arrayOne.rand1(scanner.nextInt());
        System.out.println("Первый массив: ");
        arrayOne.setArr();
        System.out.println();
        arrayOne.bubbleSort();
        arrayOne.setArr();
        System.out.println();

        System.out.println("Введите размер второго целочисленного массива: ");
        Sort arrayTwo = new Sort();
        arrayTwo.rand2(scanner.nextInt());
        System.out.println("Второй массив: ");
        arrayTwo.setArr();
        System.out.println();
        arrayTwo.bubbleSort();
        arrayTwo.setArr();
    }
}
