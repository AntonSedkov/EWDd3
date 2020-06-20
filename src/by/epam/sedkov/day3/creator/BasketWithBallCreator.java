package by.epam.sedkov.day3.creator;

import by.epam.sedkov.day3.entity.Ball;
import by.epam.sedkov.day3.entity.Basket;
import by.epam.sedkov.day3.entity.ColorEnum;
import by.epam.sedkov.day3.service.BasketService;

import java.util.ArrayList;

public class BasketWithBallCreator {

    public void ballsInBasket(Basket basket, ArrayList<Ball> ballsForBasket) {
        BasketService bs = new BasketService();
        while (true) {
            int flag = 0;
            for (Ball ball : ballsForBasket) {
                if (bs.addOneBall(basket, ball)) {
                    flag++;
                }
            }
            if (flag == 0) {
                break;
            }
        }
    }

    public ArrayList<Ball> ballsForBasketConstant() {
        ArrayList<Ball> balls = new ArrayList<>();
        balls.add(new Ball(8000, 500, ColorEnum.GREEN));
        balls.add(new Ball(10000, 500, ColorEnum.BLUE));
        balls.add(new Ball(5000, 700, ColorEnum.BLACK));
        balls.add(new Ball(13000, 400, ColorEnum.YELLOW));
        return balls;
    }
}
