package ru.mirea.task15.opt1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write {
    public static void main(String[]args)
    {
        try(FileWriter wr = new FileWriter("task15JavaMirea.txt"))
        {
            Scanner scan  =new Scanner(System.in);
            String text = scan.nextLine();
            wr.write(text);
            wr.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
