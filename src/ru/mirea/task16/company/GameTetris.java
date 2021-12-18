package ru.mirea.task16.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;

class GameTetris extends JFrame {

    String TITLE_OF_PROGRAM = "Тетрис ";
    final static int FIELD_WIDTH = 10;
    final static int FIELD_HEIGHT = 20;
    final static int LEFT = 37;
    final static int RIGHT = 39;
    final static int[][] mine = new int[FIELD_HEIGHT + 1][FIELD_WIDTH];
    final int FIELD_DX = 14;
    final int FIELD_DY = 36;
    final int UP = 38;
    final int DOWN = 40;
    final int SHOW_DELAY = 370;
    final int[] SCORES = {100, 300, 700, 1500}; // баллы за 1,2,3,4 исчезнувшие разом строки
    int gameScore = 0;
    Canvas canvas = new Canvas();
    Figure figure = new Figure();
    Block bl = new Block();
    boolean gameOver = false;
    final int[][] GAME_OVER_MSG = {
            {0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0},
            {0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1},
            {0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1},
            {0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0},
            {0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
            {0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0},
            {0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0},
            {0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0},
            {0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0}};

    GameTetris() {
        setTitle(TITLE_OF_PROGRAM);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(FIELD_WIDTH * bl.getBlockSize() + FIELD_DX, FIELD_HEIGHT * bl.getBlockSize() + FIELD_DY);
        setResizable(false);
        setLocationRelativeTo(null);
        canvas.setBackground(Color.black);

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (!gameOver) {
                    if (e.getKeyCode() == DOWN) figure.drop();
                    if (e.getKeyCode() == UP) figure.rotate();
                    if (e.getKeyCode() == LEFT || e.getKeyCode() == RIGHT) figure.move(e.getKeyCode());
                }
                canvas.repaint();
            }
        });

        add(BorderLayout.CENTER, canvas);
        setVisible(true);
        Arrays.fill(mine[FIELD_HEIGHT], 1); // заполняем "дно", чтобы было куда падать блокам

        while (!gameOver) {
            try {
                Thread.sleep(SHOW_DELAY);
                canvas.repaint();
                if (figure.isTouchGround()) { // коснулась нижней границы
                    figure.leaveOnTheGround();
                    checkFilling(); // проверка на заполненность строк
                    figure = new Figure();
                    gameOver = figure.isCrossGround(); // не пересекается ли вновь возникшая фигура с верхней границей
                } else
                    figure.stepDown();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    void checkFilling() {
        int row = FIELD_HEIGHT - 1;
        int countFillRows = 0;
        while (row > 0) {
            int filled = 1;
            for (int col = 0; col < FIELD_WIDTH; col++)
                filled *= Integer.signum(mine[row][col]);
            if (filled > 0) {
                countFillRows++;
                for (int i = row; i > 0; i--) System.arraycopy(mine[i - 1], 0, mine[i], 0, FIELD_WIDTH);
            } else
                row--;
        }
        if (countFillRows > 0) {
            gameScore += SCORES[countFillRows - 1];
            setTitle(TITLE_OF_PROGRAM + " : " + gameScore);
        }
    }

    class Canvas extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            for (int x = 0; x < FIELD_WIDTH; x++)
                for (int y = 0; y < FIELD_HEIGHT; y++) {
                    if (x < FIELD_WIDTH - 1 && y < FIELD_HEIGHT - 1) {
                        g.setColor(Color.lightGray);
                        g.drawLine((x + 1) * bl.getBlockSize() - 2, (y + 1) * bl.getBlockSize(), (x + 1) * bl.getBlockSize() + 2, (y + 1) * bl.getBlockSize());
                        g.drawLine((x + 1) * bl.getBlockSize(), (y + 1) * bl.getBlockSize() - 2, (x + 1) * bl.getBlockSize(), (y + 1) * bl.getBlockSize() + 2);
                    }
                    if (mine[y][x] > 0) {
                        g.setColor(new Color(mine[y][x]));
                        g.fill3DRect(x * bl.getBlockSize() + 1, y * bl.getBlockSize() + 1, bl.getBlockSize() - 1, bl.getBlockSize() - 1, true);
                    }
                }
            if (gameOver) {
                g.setColor(Color.white);
                for (int y = 0; y < GAME_OVER_MSG.length; y++)
                    for (int x = 0; x < GAME_OVER_MSG[y].length; x++)
                        if (GAME_OVER_MSG[y][x] == 1) g.fill3DRect(x * 11 + 18, y * 11 + 160, 10, 10, true);
            } else
                figure.paint(g);
        }
    }

    public static void main(String[] args) {
            new GameTetris();
    }
}
