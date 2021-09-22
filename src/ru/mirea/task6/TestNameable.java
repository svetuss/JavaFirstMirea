package ru.mirea.task6;

public class TestNameable implements Nameable
{
    public String getName(String name)
    {
        return name;
    }
    public static void main(String[] args)
    {
        TestNameable planet = new TestNameable();
        System.out.println(planet.getName("Меркурий"));
        TestNameable dog = new TestNameable();
        System.out.println(dog.getName("Бобик"));
        TestNameable car = new TestNameable();
        System.out.println(car.getName("Мерседес"));
    }
}
