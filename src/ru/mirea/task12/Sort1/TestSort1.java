package ru.mirea.task12.Sort1;
import java.util.Scanner;

/*
Общая суть сортировок вставками:
Перебираются элементы в неотсортированной части массива.
Каждый элемент вставляется в отсортированную часть массива на то место, где он должен находиться.
То есть, сортировки вставками всегда делят массив на 2 части — отсортированную и неотсортированную.
Из неотсортированной части извлекается любой элемент.
 */

public class TestSort1 {

    public static void main(String []args)
    {
        System.out.print("Введите количество элементов массива: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Student[] iDNumber=new Student[n];

        System.out.println("Массив iDNumber до сортировки: ");
        for (int i=0;i<n;i++) {
            iDNumber[i] = new Student((int) (Math.random() * 50));
            System.out.println("id student: " + iDNumber[i].getId());
        }
        for(int i = 1; i < n; i++) { // сортировка вставками
            Student currX = iDNumber[i];
            int prevX = i - 1;
            while (prevX >= 0 && iDNumber[prevX].getId() > currX.getId()) {
                iDNumber[prevX+1] = iDNumber[prevX];
                iDNumber[prevX] = currX;
                prevX--;
            }
        }
        System.out.println();
        System.out.println("Массив iDNumber после сортировки вставками: ");
        for (int i=0; i<n; i++) {
            System.out.println("id student: " + iDNumber[i].getId());
        }
    }
}
