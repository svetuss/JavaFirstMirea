package ru.mirea.task29;

public class ShapesInfo {
    private String info;

    public ShapesInfo(String info) {
        this.info = info;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "ShapesInfo{" +
                "info='" + info + '\'' +
                '}';
    }
}
