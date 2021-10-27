package ru.mirea.task14.opt4;

import java.util.LinkedList;
import java.util.Scanner;

public class DoubleListBotva {
    // Двусвязный список похож на обычный связный список, только элементы в нем хранят ссылки не только на следующий,
    // но и на предыдущий элемент.
    LinkedList<Integer> fiplayer = new LinkedList<>();
    LinkedList<Integer> seplayer = new LinkedList<>();

    public DoubleListBotva(String firstp, String secondp) {
        for (int i = 0; i < 5; i ++){
            this.fiplayer.add(Integer.parseInt(firstp.substring(i, i+1)));
            this.seplayer.add(Integer.parseInt(secondp.substring(i, i+1)));
        }
    }

    public String play(){
        int moves = 0;
        while (!fiplayer.isEmpty() && !seplayer.isEmpty() && moves < 106) {
            if ((fiplayer.element() > seplayer.element()) && seplayer.element() != 0) {
                fiplayer.add(fiplayer.remove());
                fiplayer.add(seplayer.remove());
            }
            else {
                seplayer.add(fiplayer.remove());
                seplayer.add(seplayer.remove());
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
        System.out.println(new DoubleListBotva(one, two).play());
    }
}
