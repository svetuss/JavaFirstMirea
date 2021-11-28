package ru.mirea.task20;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.text.DateFormat;

public class MyTetris20 {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df_one = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat df_two = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        df_one.setTimeZone(TimeZone.getTimeZone("Europe/Moscow"));
        df_two.setTimeZone(TimeZone.getTimeZone("GMT+5:00"));
        String date_one = df_one.format(date);
        String date_two = df_two.format(date);
        System.out.println("Игра запущена " + date_one + " по московскому времени.");
        System.out.println("Игра запущена " + date_two + " по екатеринбургскому времени.");
    }
}
