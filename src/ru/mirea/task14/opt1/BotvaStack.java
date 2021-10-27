package ru.mirea.task14.opt1;

import java.util.Stack;
import java.util.Scanner;

public class BotvaStack {
    Stack<Integer> fiplayer = new Stack<>();
    Stack<Integer> seplayer = new Stack<>();

    public BotvaStack(String firstp, String secondp) {
        int i=4;
        while (i>=0) {
            // push() Ставит элемент в верх стека
            // Метод parseInt(String s) преобразует строку в число
            // Метод substring() возвращает новую строку, которая является подстрокой данной строки.
            this.fiplayer.push(Integer.parseInt(firstp.substring(i, i+1)));
            this.seplayer.push(Integer.parseInt(secondp.substring(i, i+1)));
            i--;
            // по итогу числа будут располагаться в порядке: от последнего введённого до первого введённого
        }
    }

    private void pushBack(Stack<Integer> stkonetwo, Integer itm){
        // перетасовка стека - новой колоды - после выигранного хода
        // "тот, чья карта старше, забирает себе обе открытые карты, которые кладутся под низ его колоды."
        Stack<Integer> newstk = new Stack<>();
        while (!stkonetwo.isEmpty()) {
            newstk.push(stkonetwo.pop());
        }
        stkonetwo.push(itm);
        while (!newstk.isEmpty()) {
            stkonetwo.push(newstk.pop());
        }
    }

    public String play(){
        int moves = 0;
        while (!fiplayer.isEmpty() && !seplayer.isEmpty() && moves < 106) {
            // peek() Рассматривает объект стека, не удаляя его
            // pop() Удаляет элемент с вершины стека (самый новый элемент в стеке).
            // Элемент удаляется в контейнер стека, а размер стека уменьшается на 1.
            if ((fiplayer.peek() > seplayer.peek()) && seplayer.peek() != 0) { // тк 0 по условию побеждает 9
                pushBack(fiplayer, fiplayer.pop());
                pushBack(fiplayer, seplayer.pop());
            }
            else {
                pushBack(seplayer, fiplayer.pop());
                pushBack(seplayer, seplayer.pop());
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
        System.out.println(new BotvaStack(one, two).play());
    }
}