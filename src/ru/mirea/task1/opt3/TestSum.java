package ru.mirea.task1.opt3;

import ru.mirea.task1.opt3.Sum;
import java.util.Scanner;

public class TestSum
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер целочисленного массива: ");
        Sum sumRes = new Sum(scanner.nextInt());
        System.out.println("Сумма чисел целочисленного массива с помощью цикла for равна "+sumRes.sumFor() + ".");
        System.out.println("Сумма чисел целочисленного массива с помощью цикла while равна "+sumRes.sumWhile() + ".");
        System.out.println("Сумма чисел целочисленного массива с помощью цикла do while равна "+sumRes.sumDoWhile() + ".");
    }
}
