package ru.mirea.task29;
import java.io.Serializable;

public class ColourInfo implements Serializable {
    private String info;

    public ColourInfo(String info) {
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
        return "ColourInfo{" +
                "info='" + info + '\'' +
                '}';
    }
}
