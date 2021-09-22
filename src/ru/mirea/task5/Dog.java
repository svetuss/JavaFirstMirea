package ru.mirea.task5;

public class Dog {
    private String name;
    private int weight;
    public Dog(String n, int w){
        name = n;
        weight = w;
    }
    public Dog(String n)
    {
        name = n;
        weight = 0;
    }
    public Dog(){
        name = "Пёс";
        weight = 0;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public int getWeight() {
        return weight;
    }
    public String toString(){
        return this.name+", weight "+this.weight;
    }
}
