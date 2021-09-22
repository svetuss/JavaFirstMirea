package ru.mirea.task5;

public class Breeds extends Dog {
    private String breedsDog;
    public Breeds(String n, int w, String b) {
        super("Аска",20);
        breedsDog=b;
    }
    public void setBreeds(String breedsDog) {
        this.breedsDog = breedsDog;
    }
    public String getBreeds()
    {
        return breedsDog;
    }
    public String toString()
    {
        return getName()+", вес "+getWeight()+", порода "+getBreeds();
    }
}
