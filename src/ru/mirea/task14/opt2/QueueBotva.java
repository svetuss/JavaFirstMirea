package ru.mirea.task14.opt2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueBotva {
    // В отличие от стека очередь основана не на LIFO, а на другом принципе — FIFO
    // (“first in — first out”, “первым вошел — первым вышел”)
    Queue<Integer> fiplayer = new LinkedList<>();
    Queue<Integer> seplayer = new LinkedList<>();

    public QueueBotva(String firstp, String secondp) {
        for (int i = 0; i < 5; i ++){
            this.fiplayer.offer(Integer.parseInt(firstp.substring(i, i+1)));
            this.seplayer.offer(Integer.parseInt(secondp.substring(i, i+1)));
        }
    }

    public String play(){
        int moves = 0;
        while (!fiplayer.isEmpty() && !seplayer.isEmpty() && moves < 106) {
            if ((fiplayer.element() > seplayer.element()) && seplayer.element() != 0) {
                fiplayer.offer(fiplayer.remove());
                // Метод offer (E e) интерфейса очереди вставляет указанный элемент в эту очередь, если это можно сделать немедленно,
                // не нарушая ограничения по емкости. Этот метод предпочтительнее метода add (),
                // так как этот метод не выдает исключение, когда емкость контейнера заполнена, так как он возвращает false.
                fiplayer.offer(seplayer.remove());
            }
            else {
                seplayer.offer(fiplayer.remove());
                seplayer.offer(seplayer.remove());
            }
            moves++;
        }
        String res = "";
        if (moves >= 106) {
            res = "botva";
        }
        else {
            if (seplayer.isEmpty()) {
                res += "The First player won. ";
            }
            else {
                res += "The Second player won. ";
            }
            res += "Number of moves: ";
            res+=moves;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Enter two strings: 5 cards of the first player and 5 cards of the second player.");
        Scanner scan1 = new Scanner(System.in);
        String one = scan1.nextLine();
        Scanner scan2 = new Scanner(System.in);
        String two = scan2.nextLine();
        System.out.println(new QueueBotva(one, two).play());
    }
}