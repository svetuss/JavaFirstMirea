package ru.mirea.task5.furniture;

class Table extends Furniture{
    private int size;

    public Table(String material, String color, int price, int size) {
        super(material, color, price);
        this.size = size;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Размер стола: "+size+" см");
    }
}
