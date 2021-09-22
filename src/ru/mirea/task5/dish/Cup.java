package ru.mirea.task5.dish;

import ru.mirea.task5.dish.Dish;

public class Cup extends Dish {
    private String shape;
    public Cup(String material, String colour, String shape){
        super(material,colour);
        this.shape = shape;
    }
    public void displayInfo(){
        System.out.println("Чашка, сделанная из  материала "+ super.getMaterial()+", цвет "+super.getColor()+", форма "+ shape);
    }
}