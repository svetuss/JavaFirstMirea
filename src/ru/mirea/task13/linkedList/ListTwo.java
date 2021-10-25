package ru.mirea.task13.linkedList;

import java.util.LinkedList;
import java.lang.String;
import java.util.Scanner;

/*
В двусвязном списке LinkedList элементы фактически представляют собой звенья одной цепи.
У каждого элемента помимо тех данных, которые он хранит, имеется ссылка на предыдущий и следующий элемент.
По этим ссылкам можно переходить от одного элемента к другому.
Вся работа с LinkedList сводится к изменению ссылок.
 */

public class ListTwo {
    String language;
    public ListTwo(String language) {
        this.language = language;
    }
    @Override
    public String toString() {
        return "Country{" +
                "language='" + language + '\'' +
                '}';
    }

    public static void main(String[] args) {
        String str1 = "English language";
        String str2 = "Russian language";
        String str3 = "French language";
        String str4 = "Ukrainian language";
        LinkedList<String> langu = new LinkedList<>();
        langu.add(str1);
        langu.add(str2);
        langu.add(1, str3);
        langu.add(str4);
        System.out.println(langu);
        System.out.print("Enter the index number you want to delete: ");
        Scanner in = new Scanner(System.in);
        int indx = in.nextInt();
        langu.remove(indx);
        langu.addFirst(str4);
        langu.addLast("Polish language");
        System.out.println(langu);
        System.out.println("Deleted first element: " + langu.pollFirst());
        System.out.println("Index of Ukrainian language: " + langu.indexOf("Ukrainian language"));
        System.out.print("What's left in the list? ");
        System.out.println(langu);
        if (langu.contains("Russian language")) {
            System.out.println("The list contains the Russian language.");
        }
        else {
            System.out.println("No! The list does not contain the Russian language.");
        }
    }
}
