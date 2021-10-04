package core.basesyntax;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();
        final int RANDOM_FIGURE = 5;
        Random random = new Random();
        int figureSize = random.nextInt(RANDOM_FIGURE);

        Figure[] figures = new Figure[figureSize];
        for (int i = 0; i <figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
    }
}