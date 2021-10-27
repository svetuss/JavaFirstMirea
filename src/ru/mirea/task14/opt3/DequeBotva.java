package ru.mirea.task14.opt3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DequeBotva {
    // Deque - это подинтерфейс Queue. Определяет поведение двунаправленной очереди, которая работает как обычная однонаправленная очередь,
    // либо как стек, действующий по принципу LIFO (последний вошел - первый вышел).
    Deque<Integer> fiplayer = new ArrayDeque<>();
    Deque<Integer> seplayer = new ArrayDeque<>();

    public DequeBotva(String firstp, String secondp) {
       for (int i = 0; i < 5; i ++){
            this.fiplayer.addLast(Integer.parseInt(firstp.substring(i, i+1)));
            this.seplayer.addLast(Integer.parseInt(secondp.substring(i, i+1)));
        }
    }

    public String play(){
        int moves = 0;
        while (!fiplayer.isEmpty() && !seplayer.isEmpty() && moves < 106) {
            if ((fiplayer.element() > seplayer.element()) && seplayer.element() != 0) {
                fiplayer.addLast(fiplayer.remove());
                fiplayer.addLast(seplayer.remove());
            }
            else {
                seplayer.addLast(fiplayer.remove());
                seplayer.addLast(seplayer.remove());
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
        System.out.println(new DequeBotva(one, two).play());
    }
}