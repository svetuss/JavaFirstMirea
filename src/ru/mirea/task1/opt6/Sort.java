package ru.mirea.task1.opt6;

import java.util.Random;

public class Sort {
    private int[] arr = new int[100];
    public Sort(){}

    public void rand1(int size){
        this.arr = new int[size];
        for(int i = 0; i < arr.length;i++)
            arr[i] = (int)(Math.random()*1000);
    }

    public void rand2(int size){
        this.arr = new int[size];
        Random rand = new Random();
        for(int i = 0; i < arr.length;i++)
            arr[i] = rand.nextInt(1000);
    }

    public void setArr(){
        for (int i = 0; i < arr.length; i++)
            System.out.print(" "+(arr[i]));
    }

    public void bubbleSort() {
        System.out.println("Отсортированный массив выглядит следующим образом: ");
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
