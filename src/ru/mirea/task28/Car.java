package ru.mirea.task28;

public class Car {
    private String model;
    private int yearOfRelease;
    private Speed speed = new Speed();
    private Doors door = new Doors();

    public Car() {}

    public Car(String model, int yearOfRelease) {
        this.model = model;
        this.yearOfRelease = yearOfRelease;
    }

    public void steering() {
        System.out.print("Руль часто расположен слева.");
    }

    public String getModel() {
        return model;
    }
    public int getYear() {
        return yearOfRelease;
    }

    class Speed {
        boolean move = false;
        int sp;
        public int getSp() {
            return sp;
        }
        public void setSp(int sp) {
            this.sp = sp;
        }
        public void start() {
            move = true;
            System.out.println("Ваша машина едет с максимальной скоростью!");
        }
        public void stop() {
            if (move) {
                move = false;
                System.out.println("Ваша машина остановилась. Скорость снижена до нуля.");
            }
            else {
                System.out.println("Ваша машина стоит. Скорость равна нулю.");
            }
        }
    }

    class Doors {
        boolean open;
        public void setOpenOrNot(boolean open) {
            this.open = open;
        }
        public void check() {
            if (open){
                System.out.println("Дверь машины открыта!");
            }
            else
                System.out.println("Дверь машины закрыта!");
        }
    }

    private class Toyota extends Car {
        String model ="Toyota Corolla";
        private Speed speed = new Speed();
        private Doors door = new Doors();
        public Toyota() {}
        @Override
        public void steering() {
            System.out.println("Руль у машины " + model + " расположен справа.");
        }
    }

    public static void main(String[]args) {
        Car usually = new Car("Toyota Camry", 1994);
        Car different = new Car().new Toyota();
        usually.steering();
        System.out.println(" Как, например, у " + usually.getModel());
        different.steering();
        usually.speed.setSp(75);
        usually.speed.start();
        usually.speed.stop();
    }
}
