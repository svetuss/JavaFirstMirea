package ru.mirea.task23;
import java.util.Objects;

public class Figure {
    private String colour;
    private String shapes;

    public Figure(String colour, String shapes) {
        this.colour = colour;
        this.shapes = shapes;
    }

    public String getColour() {
        return colour;
    }

    public String getShapes() {
        return shapes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) return false;
        Figure fig = (Figure) o;
        return colour == fig.colour && shapes == fig.shapes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, shapes);
    }

    @Override
    public String toString() {
        return "Tetris Figure. " +
                "Colour: " + colour + "; Shapes: " + shapes + ".";
    }
}
