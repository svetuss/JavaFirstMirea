package ru.mirea.task5.furniture;

class Bed extends Furniture{
    private int sizeWidth, sizeLength;;

    public Bed(String material, String color, int price, int sizeWidth, int sizeLength) {
        super(material, color, price);
        this.sizeWidth = sizeWidth;
        this.sizeLength = sizeLength;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Размер кровати. Длина: "+sizeLength+" см., ширина: "+sizeWidth);
    }
}
