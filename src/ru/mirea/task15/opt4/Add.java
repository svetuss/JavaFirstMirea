package ru.mirea.task15.opt4;

import java.io.*;
import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        try (FileWriter filew = new FileWriter("task15JavaMirea.txt",true)) {
            // Java класс BufferedReader читает текст из потока ввода символов, буферизуя прочитанные символы,
            // чтобы обеспечить эффективное считывание символов, массивов и строк.
            BufferedWriter buffw = new BufferedWriter(filew);
            Scanner scann = new Scanner(System.in);
            System.out.println("Enter a text: ");
            String mytext = scann.nextLine();
            buffw.write(mytext);
            buffw.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}