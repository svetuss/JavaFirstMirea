package ru.mirea.task12.Sort2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Алгоритм быстрой сортировки:
Выбрать опорный элемент из массива (обычно средний элемент).
Разделить массив на два подмассива: элементы, меньше опорного и элементы, больше опорного.
Рекурсивно применить сортировку к двум подмассивам.
 */

public class SortTest {
    public static void main(String []args)
    {
        ArrayList<Student> iDNumber=new ArrayList<>();
        System.out.print("Введите количество студентов: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i=0; i<n; i++) {
            iDNumber.add(new Student((int) (Math.random() * 50),(int)(Math.random()*100)));
            System.out.println((i+1) + iDNumber.get(i).toString() + ";");
        }
        Collections.sort(iDNumber,new SortingStudentsByGPA());
        System.out.println();
        System.out.println("Отсортированный список студентов по их итоговым баллам в порядке убывания с использованием алгоритма быстрой сортировки.");
        for (int i=0; i<n; i++) {
            System.out.println(iDNumber.get(i).toString() + ";");
        }
    }
}
