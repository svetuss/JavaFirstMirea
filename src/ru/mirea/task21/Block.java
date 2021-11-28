package ru.mirea.task21;

import java.util.Random;

public class Block {
        private int x, y, type;
        public Block(int x, int y) {
            setX(x);
            setY(y);
        }
        final int[][][] SHAPES = { // фигуры в Тетрисе
            {{0, 0, 0, 0}, {1, 1, 1, 1}, {0, 0, 0, 0}, {0, 0, 0, 0}, {4, 0x00f0f0}}, // I
            {{0, 0, 0, 0}, {0, 1, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}, {4, 0xf0f000}}, // O
            {{1, 0, 0, 0}, {1, 1, 1, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {3, 0x0000f0}}, // J
            {{0, 0, 1, 0}, {1, 1, 1, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {3, 0xf0a000}}, // L
            {{0, 1, 1, 0}, {1, 1, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {3, 0x00f000}}, // S
            {{1, 1, 1, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {3, 0xa000f0}}, // T
            {{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {3, 0xf00000}}  // Z
        };
        Random random = new Random();
        public void addType() {
            int type = random.nextInt(SHAPES.length);
            System.out.println("Тип фигуры: " + type);
            switch (type) {
                case 1:
                    System.out.println("Координаты фигуры Z: { 0, -1 }, { 0, 0 }, { -1, 0 }, { -1, 1 }");
                    break;
                case 2:
                    System.out.println("Координаты фигуры I: { 0, -1 }, { 0, 0 }, { 0, 1 }, { 0, 2 }");
                    break;
                case 3:
                    System.out.println("Координаты фигуры T: { -1, 0 }, { 0, 0 }, { 1, 0 }, { 0, 1 }");
                    break;
                case 4:
                    System.out.println("Координаты фигуры O: { 0, 0 }, { 1, 0 }, { 0, 1 }, { 1, 1 }");
                    break;
                case 5:
                    System.out.println("Координаты фигуры J: { -1, -1 }, { 0, -1 }, { 0, 0 }, { 0, 1 }");
                    break;
                case 6:
                    System.out.println("Координаты фигуры L: { 1, -1 }, { 0, -1 }, { 0, 0 }, { 0, 1 }");
                    break;
            }
        }
        void setX(int x) { this.x = x; }
        void setY(int y) { this.y = y; }
}
