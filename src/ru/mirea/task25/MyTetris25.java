package ru.mirea.task25;

interface Tetris {
    int getCount();
    String getShape();
}
class StandartShapes implements Tetris {
    final String shape;
    final int count;
    public StandartShapes (String shape, int count) {
        this.shape = shape;
        this.count = count;
    }
    public int getCount() {
        return this.count;
    }
    public String getShape() {
        return this.shape;
    }
}
class TetrisDecorator implements Tetris {
    final Tetris tetris;
    final String shape;
    final int count;
    public TetrisDecorator(Tetris tetris, String shape, int count) {
        this.tetris = tetris;
        this.shape = shape;
        this.count = count;
    }
    public int getCount() {return this.count + tetris.getCount();}
    public String getShape() {return this.shape + tetris.getShape();}
}
class TestOShape extends TetrisDecorator {
    public TestOShape(Tetris service) {
        super(service, "O-Shape", 10);
    }
}
class TestTShape extends TetrisDecorator {
    public TestTShape(Tetris service) {
        super(service, "T-Shape", 15);
    }
}

public class MyTetris25 {
    public static void main(String[] args) {
        Tetris tetr = new StandartShapes("S-Shape, ", 5);
        Tetris testtetr = new TestOShape(tetr);
        Tetris tetr2 = new TestTShape(testtetr);
        System.out.println("The total number of appearances of these tetris figures: " + tetr2.getCount());
    }
}
