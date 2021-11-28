package ru.mirea.task18;

class MyTetris18 {
    final int SHOW_DELAY = 400;
    boolean gameOver = false;
    Figure figure = new Figure();

    void go() {
        while (!gameOver) {
            try {
                Thread.sleep(SHOW_DELAY);
                if (figure.isTouchGround()) { // коснулась нижней границы
                    figure.leaveOnTheGround();
                    checkFilling(); // проверка на заполненность строк
                    figure = new Figure();
                    gameOver = figure.isCrossGround(); // не пересекается ли вновь возникшая фигура с верхней границей
                } else
                    figure.stepDown();
            } catch (Exception e) { e.printStackTrace(); }
        }
    }

    void checkFilling() {
        //
    }

    class Figure {
        boolean isTouchGround() {
            //
            return false;
        }

        boolean isCrossGround() {
            /* */
            return false;
        }

        void leaveOnTheGround() {
            //
        }

        void stepDown() {
            //
        }
    }

    public static void main(String[] args) {
        new MyTetris18().go();
    }
}
