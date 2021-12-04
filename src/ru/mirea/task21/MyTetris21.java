package ru.mirea.task21;

import java.util.ArrayList;
import java.util.List;

public class MyTetris21 {

    List<Block> figure = new ArrayList<>();

    public MyTetris21(int count){
        for (int i=0;i<count;i++) {
            Block one = new Block(1,1);
            one.addType();
            figure.add(one);
        }
    }

    public static void main(String[] args){
        MyTetris21 test = new MyTetris21(7);
    }
}
