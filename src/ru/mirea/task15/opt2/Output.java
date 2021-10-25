package ru.mirea.task15.opt2;

import java.io.FileReader;
import java.io.IOException;

public class Output {
    public static void main(String[]args)
    {
        try (FileReader rea = new FileReader("task15JavaMirea.txt"))
        {
            int a;
            while ((a=rea.read())!=-1) {
                System.out.print((char) a);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
