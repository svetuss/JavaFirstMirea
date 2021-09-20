package ru.mirea.task1.opt3;

import java.util.Scanner;

public class Sum {
    private int sumArrayFor, sumArrayWhile, sumArrayDoWhile;
    private int s;
    private int[] arr = new int[s];
    private Scanner scanner = new Scanner(System.in);
        
    public Sum(int s) {
        this.s = s;
        arr = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public int sumFor() {
        int sumArrayFor = 0;
        for (int i = 0; i < s; i++) {
            sumArrayFor += arr[i];
        }
        return sumArrayFor;
    }

    public int sumWhile() {
        int sumArrayWhile = 0;
        int count = 0;
        while (count != s) {
            sumArrayWhile += arr[count];
            count++;
        }
        return sumArrayWhile;
    }

    public int sumDoWhile() {
        int sumArrayDoWhile = 0;
        int count = 0;
        do {
            sumArrayDoWhile += arr[count];
            count++;
        }
        while (count != s);
        return sumArrayDoWhile;
    }
}