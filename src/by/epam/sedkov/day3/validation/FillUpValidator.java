package by.epam.sedkov.day3.validation;

import by.epam.sedkov.day3.entity.Ball;
import by.epam.sedkov.day3.entity.Basket;

public class FillUpValidator {

    public static boolean isEnoughSpace(Basket basket, Ball ball) {
        return basket.getDiameter() >= ball.getDiameter() && basket.getVolume() >= ball.getVolume();
    }

}
