package by.epam.sedkov.day3.creator;

import by.epam.sedkov.day3.entity.Ball;
import by.epam.sedkov.day3.entity.Basket;
import by.epam.sedkov.day3.entity.ColorEnum;
import by.epam.sedkov.day3.validation.FillUpValidator;

public class BallBasketCreator {

    public void fillUpBasket(Basket basket) {
        Ball ballOne = new Ball(10000, 50, 500, ColorEnum.GREEN);
        Ball ballTwo = new Ball(8000, 80, 600, ColorEnum.BLUE);
        Ball ballThree = new Ball(5000, 35, 700, ColorEnum.BLACK);
        Ball ballFour = new Ball(13000, 56, 400, ColorEnum.YELLOW);
        Ball[] array = new Ball[]{ballOne, ballTwo, ballThree, ballFour};
        int i=10;
        while (i-->0) {
            for (Ball ball : array) {
                if (FillUpValidator.isEnoughSpace(basket, ball)) {
                    basket.addBall(ball);
                }
            }
        }

    }
}
