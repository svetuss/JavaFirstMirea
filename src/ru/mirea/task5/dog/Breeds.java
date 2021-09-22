package ru.mirea.task5.dog;

public class Breeds extends Dog {
    private String breedsDog;
    public Breeds(String n, int years, String br) {
        super("Аска",5);
        breedsDog=br;
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
        return getName()+", возраст: "+getYears()+" , порода: "+getBreeds();
    }
}
