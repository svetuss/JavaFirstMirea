package ru.mirea.task16.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

class Figure {
    private ArrayList<Block> figure = new ArrayList<Block>();
    private int[][] shape = new int[4][4]; // нужен для поворота
    private int type, size, color;
    private int x = 3, y = 0;
    final int[][][] SHAPES = { // фигуры в Тетрисе
            {{0,0,0,0}, {1,1,1,1}, {0,0,0,0}, {0,0,0,0}, {4, 0x00f0f0}}, // I
            {{0,0,0,0}, {0,1,1,0}, {0,1,1,0}, {0,0,0,0}, {4, 0xf0f000}}, // O
            {{1,0,0,0}, {1,1,1,0}, {0,0,0,0}, {0,0,0,0}, {3, 0x0000f0}}, // J
            {{0,0,1,0}, {1,1,1,0}, {0,0,0,0}, {0,0,0,0}, {3, 0xf0a000}}, // L
            {{0,1,1,0}, {1,1,0,0}, {0,0,0,0}, {0,0,0,0}, {3, 0x00f000}}, // S
            {{1,1,1,0}, {0,1,0,0}, {0,0,0,0}, {0,0,0,0}, {3, 0xa000f0}}, // T
            {{1,1,0,0}, {0,1,1,0}, {0,0,0,0}, {0,0,0,0}, {3, 0xf00000}}  // Z
    };
    Random random = new Random();

    Figure() {
        type = random.nextInt(SHAPES.length);
        size = SHAPES[type][4][0];
        color = SHAPES[type][4][1];
        if (size == 4) {
            y = -1;
        }
        for (int i = 0; i < size; i++) {
            System.arraycopy(SHAPES[type][i], 0, shape[i], 0, SHAPES[type][i].length);
        }
        createFromShape();
    }

    void createFromShape() {
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                if (shape[y][x] == 1) {
                    figure.add(new Block(x + this.x, y + this.y));
                }
            }
        }
    }

    boolean isTouchGround() {
        for (Block block : figure) {
            if (GameTetris.mine[block.getY() + 1][block.getX()] > 0) {
                return true;
            }
        }
        return false;
    }

    boolean isCrossGround() {
        for (Block block : figure) {
            if (GameTetris.mine[block.getY()][block.getX()] > 0) {
                return true;
            }
        }
        return false;
    }

    void leaveOnTheGround() {
        for (Block block : figure) {
            GameTetris.mine[block.getY()][block.getX()] = color;
        }
    }

    boolean isTouchWall(int direction) {
        for (Block block : figure) {
            if (direction == GameTetris.LEFT && (block.getX() == 0 || GameTetris.mine[block.getY()][block.getX() - 1] > 0)) {
                return true;
            }
            if (direction == GameTetris.RIGHT && (block.getX() == GameTetris.FIELD_WIDTH - 1 || GameTetris.mine[block.getY()][block.getX() + 1] > 0)) {
                return true;
            }
        }
        return false;
    }

    void move(int direction) {
        if (!isTouchWall(direction)) {
            int dx = direction - 38; // LEFT = -1, RIGHT = 1
            for (Block block : figure) {
                block.setX(block.getX() + dx);
            }
            x += dx;
        }
    }

    void stepDown() {
        for (Block block : figure) {
            block.setY(block.getY() + 1);
        }
        y++;
    }

    void drop() {
        while (!isTouchGround()) {
            stepDown();
        }
    }

    boolean isWrongPosition() {
        for (int x = 0; x < size; x++)
            for (int y = 0; y < size; y++)
                if (shape[y][x] == 1) {
                    if (y + this.y < 0) return true; // проверка координат
                    if (x + this.x < 0 || x + this.x > GameTetris.FIELD_WIDTH - 1) return true;
                    if (GameTetris.mine[y + this.y][x + this.x] > 0) return true; // соприкосновение с уже имеющимимся фигурами
                }
        return false;
    }

    void rotateShape(int direction) {
        for (int i = 0; i < size/2; i++)
            for (int j = i; j < size-1-i; j++)
                if (direction == GameTetris.RIGHT) {
                    int tmp = shape[size-1-j][i];
                    shape[size-1-j][i] = shape[size-1-i][size-1-j];
                    shape[size-1-i][size-1-j] = shape[j][size-1-i];
                    shape[j][size-1-i] = shape[i][j];
                    shape[i][j] = tmp;
                } else {
                    int tmp = shape[i][j];
                    shape[i][j] = shape[j][size-1-i];
                    shape[j][size-1-i] = shape[size-1-i][size-1-j];
                    shape[size-1-i][size-1-j] = shape[size-1-j][i];
                    shape[size-1-j][i] = tmp;
                }
    }

    void rotate() {
        rotateShape(GameTetris.RIGHT);
        if (!isWrongPosition()) {
            figure.clear();
            createFromShape();
        } else
            rotateShape(GameTetris.LEFT);
    }

    void paint(Graphics g) {
        for (Block block : figure) {
            block.paint(g, color);
        }
    }
}
