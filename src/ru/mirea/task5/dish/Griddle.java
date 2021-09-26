package ru.mirea.task5.dish;

import ru.mirea.task5.dish.Dish;

public class Griddle extends Dish {
    private String shape;
    public Griddle(String material, String colour, String shape){
        super(material,colour);
        this.shape = shape;
    }
    public void intoConsol(){
        System.out.println("Сковородка, сделанная из материала "+ super.getMaterial()+", "+super.getColor()+" цвета, имеет форму "+ shape);
    }
}
