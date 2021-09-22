package ru.mirea.task5.furniture;

import java.util.Scanner;

public class FurnitureShop {
    Scanner sc = new Scanner(System.in);

    Bed b1 = new Bed("Сосна", "Коричневый", 15990, 90, 78);
    Bed b2 = new Bed("Дуб", "Серый", 19990, 90, 87);
    Bed b3 = new Bed("Кедр", "Белый", 9990, 90, 90);
    Table t1 = new Table("Кедр", "Розовый", 2500, 130);
    Table t2 = new Table("Дуб", "Желтый", 3450, 150);
    Table t3 = new Table("Металл", "Черный", 900, 90);

    public void search(){
        String com;
        System.out.println("Добро пожаловать в магазин мебели.");
        System.out.println("Выберите интересующую Вас мебель: Кровать или Стол.");
        com = sc.nextLine();
        //System.out.println(com);
        if (com.equals("Стол"))
        {
            t1.displayInfo();
            t2.displayInfo();
            t3.displayInfo();
        }
        if (com.equals("Кровать"))
        {
            b1.displayInfo();
            b2.displayInfo();
            b3.displayInfo();
        }
        else System.out.println("Интересующей Вас продукции у нас нет в наличии.");
    }
}
