package ru.mirea.task12.Sort3;
import java.util.Scanner;

/*
Алгоритм сортировки слиянием:
Работает по технике «Разделяй и властвуй».
Разделяй: Это включает в себя разделение списка входных массивов на два списка одинакового размера.
Властвуй: То есть рекурсивная сортировка подсписоков.
Соединяй: Слияние обоих отсортированных подсписоков в один.
 */

public class TestSort3 {
    public static Student[] sortByMerge(Student[]a) {
        if (a==null) {
            return null;
        }
        if (a.length<2) {
            return a;
        }
        Student[]b = new Student[a.length/2];
        System.arraycopy(a,0,b,0,a.length/2);
        Student[]c=new Student[a.length-a.length/2];
        System.arraycopy(a,a.length/2,c,0,a.length-a.length/2);
        b=sortByMerge(b);
        c=sortByMerge(c);
        return mergeArrays(b,c);
    }

    public static Student[] mergeArrays(Student[]a,Student[]b)
    {
        Student[]c=new Student[a.length+b.length];
        int apos=0,bpos=0;
        for (int i=0; i<c.length; i++)
        {
            if(apos==a.length) {
                c[i]=b[bpos];
                bpos++;
            }
            else if (bpos==b.length) {
                c[i]=a[apos];
                apos++;
            }
            else if(a[apos].getBall()<b[bpos].getBall()) {
                c[i]=a[apos];
                apos++;
            }
            else {
                c[i]=b[bpos];
                bpos++;
            }
        }
        return c;
    }

    public static void main(String []args) {
        System.out.print("Введите количество студентов первого списка: ");
        Scanner in1 = new Scanner(System.in);
        int n1 = in1.nextInt();
        System.out.print("Введите количество студентов второго списка: ");
        Scanner in2 = new Scanner(System.in);
        int n2 = in2.nextInt();
        Student[]one=new Student[n1];
        Student[]two=new Student[n2];
        Student[]th;
        System.out.print("Первый список: ");
        for (int i=0; i<n1; i++) {
            one[i]=new Student((int) (Math.random() * 50),(int)(Math.random()*100));
            System.out.print(one[i].getBall()+" ");
        }
        System.out.println();
        System.out.print("Второй список: ");
        for (int i=0; i<n2; i++) {
            two[i]=new Student((int) (Math.random() * 50),(int)(Math.random()*100));
            System.out.print(two[i].getBall()+" ");
        }
        one=sortByMerge(one);
        two=sortByMerge(two);
        th=mergeArrays(one,two);
        System.out.println();
        System.out.print("Объединённые два списка с использованием алгоритма сортировки слиянием: ");
        for (int j=0;j<n1+n2;j++) {
            System.out.print(th[j].getBall() + " ");
        }
    }
}