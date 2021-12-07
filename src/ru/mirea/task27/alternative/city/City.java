package ru.mirea.task27.alternative.city;

public class City {
    String country;
    String town;

    public City(String country, String town) {
        this.country = country;
        this.town = town;
    }

    public City(String country) {
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public String setTown(String town) {
       this.town = town;
       return town;
    }
}