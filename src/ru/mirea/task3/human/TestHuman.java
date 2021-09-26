package ru.mirea.task3.human;

import ru.mirea.task3.human.Hand;
import ru.mirea.task3.human.Head;
import ru.mirea.task3.human.Human;
import ru.mirea.task3.human.Leg;

public class TestHuman
{
    public static void main(String[] args) {
        Human hu1 = new Human ("Svetlana", 18, 55, 160);
        System.out.println(hu1.toString());
        System.out.println(hu1.getName());
        System.out.println("Age: "+hu1.getAge());
        System.out.println("Weight: "+hu1.getWeight());
        System.out.println("Height: "+hu1.getHeight());
        Leg l1 = new Leg(36);
        System.out.println("Size of leg: "+l1.getSize());
        l1.setSize(37);
        System.out.println("New size: "+l1.getSize());
        Hand ha1 = new Hand(74);
        System.out.println("Length: "+ha1.getLength());
        ha1.setLength(76);
        System.out.println("New length: "+ha1.getLength());
        Head hea2 = new Head();
        hea2.setEyes("Green");
        hea2.setHair("Shoulder-high");
        System.out.println("Color eyes: "+hea2.getEyes()+"Hair length: "+hea2.getHair());
    }
}
