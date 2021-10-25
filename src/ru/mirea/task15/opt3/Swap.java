package ru.mirea.task15.opt3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter a new text: ");
        String newtext = sca.nextLine();
        try (PrintWriter swa = new PrintWriter("task15JavaMirea.txt")) {
            swa.print(newtext);
            swa.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
