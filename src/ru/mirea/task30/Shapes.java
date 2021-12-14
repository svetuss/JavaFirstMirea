package ru.mirea.task30;

import java.util.*;

public class Shapes {
    private int frequency;
    private String shape;
    private String colour;
    private static Map<Integer, Shapes> allShapes;
    private static int count = 0;

    public Shapes(String shape, String colour, int frequency) {
        if (allShapes == null){
            allShapes = new HashMap<>();
        }
        this.shape = shape;
        this.colour = colour;
        this.frequency = frequency;
        if (!hasUser()){
            count++;
            this.frequency = count;
            allShapes.put(frequency, this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shapes shapess = (Shapes) o;
        return frequency == shapess.frequency &&
                Objects.equals(shape, shapess.shape);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shape, colour, frequency);
    }

    private boolean hasUser(){
        for (Shapes shapes : allShapes.values()){
            if (shapes.equals(this) && shapes.hashCode() == this.hashCode()){
                return true;
            }
        }
        return false;
    }

    public static List<Shapes> getAllShapes(){
        return new ArrayList<>(allShapes.values());
    }

    public static List<Shapes> getAllShapes(String shape){
        List<Shapes> listAllShapes = new ArrayList<>();
        for (Shapes shapes : allShapes.values()){
            if (shapes.shape == shape){
                listAllShapes.add(shapes);
            }
        }
        return listAllShapes;
    }

    public static int getHowManyShapes(){
        return allShapes.size();
    }

    public static int getAllFrequency(){
        int countf = 0;
        for (Shapes shapes : allShapes.values()){
            countf += shapes.frequency;
        }
        return countf;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "shape=" + shape +
                ", colour=" + colour + '\'' +
                ", frequency=" + frequency +
                '}';
    }

    public static void main(String[] args) {
        new Shapes("S-shape", "red", 1);
        new Shapes("T-shape", "yellow", 2);
        new Shapes("T-shape", "blue", 3);
        System.out.println("All tetris figures:");
        Shapes.getAllShapes().forEach(System.out::println);
        System.out.println("T-shape: " + Shapes.getAllShapes("T-shape"));
        System.out.println("Total frequency: " + Shapes.getAllFrequency());
    }
}
