package ru.mirea.task5.dog;

public class Dog {
    private String name;
    private int years;
    public Dog(String n, int y){
        name = n;
        years = y;
    }
    public Dog(String n)
    {
        name = n;
        years = 1;
    }
    public Dog(){
        name = "Пёс";
        years = 1;
    }
    public void setYears(int years) {
        this.years = years;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public int getYears() {
        return years;
    }
    public String toString(){
        return this.name+", weight "+this.years;
    }
}
