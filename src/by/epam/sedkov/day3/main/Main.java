package by.epam.sedkov.day3.main;

import by.epam.sedkov.day3.creator.BallBasketCreator;
import by.epam.sedkov.day3.entity.Ball;
import by.epam.sedkov.day3.entity.Basket;
import by.epam.sedkov.day3.entity.ColorEnum;
import by.epam.sedkov.day3.exception.CheckedException;
import by.epam.sedkov.day3.service.BasketService;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws CheckedException {
        Basket basket = new Basket(100_000, 200);
        BallBasketCreator ballBasketCreator = new BallBasketCreator();
        ballBasketCreator.fillUpBasket(basket);
        BasketService basketService = new BasketService();

        ArrayList<Ball> ballsInBasket = basket.getBalls();
        System.out.println(basketService.countWeight(ballsInBasket));
        System.out.println(basketService.countQuantityBalls(ballsInBasket, ColorEnum.BLUE));
    }
}
