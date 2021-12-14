package ru.mirea.task29;
import java.io.Serializable;

public class SavedTetris implements Serializable {
    private transient ShapesInfo shapesInfo;
    private ColourInfo colourInfo;

    public SavedTetris(ShapesInfo shapesInfo, ColourInfo colourInfo) {
        this.shapesInfo = shapesInfo;
        this.colourInfo = colourInfo;
    }

    public ShapesInfo getShapesInfo() {
        return shapesInfo;
    }
    public void setShapesInfo(ShapesInfo shapesInfo) {
        this.shapesInfo = shapesInfo;
    }
    public ColourInfo getColourInfo() {
        return colourInfo;
    }
    public void setColourInfo(ColourInfo colourInfo) {
        this.colourInfo = colourInfo;
    }

    @Override
    public String toString() {
        return "SavedTetris{" +
                "shapesInfo=" + shapesInfo +
                ", colourInfo=" + colourInfo +
                '}';
    }
}