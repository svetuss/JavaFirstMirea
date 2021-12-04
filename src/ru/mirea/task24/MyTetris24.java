package ru.mirea.task24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyTetris24 {
    private static String[] getDate(String str) {
        int count = 0;
        String[] allMatches = new String[3];
        Matcher matcher = Pattern.compile("(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d").matcher(str);
        while (matcher.find()) {
            allMatches[count] = matcher.group();
            count++;
        }
        return allMatches;
    }

    public static void main(String[] args) throws Exception{
        String[] dates = getDate("Игра Тетрис создавалась с 11/11/2021 до 04/12/2021. Пользователь сможет играть с 12/12/2021.");
        System.out.println("Игра Тетрис создавалась с " + dates[0] + ".");
        System.out.println("Игра Тетрис создавалась до " + dates[1] + ".");
        System.out.println("Пользователь сможет играть в Тетрис с " + dates[2] + ".");
    }
}
