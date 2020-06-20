package by.epam.sedkov.day3.service;

import by.epam.sedkov.day3.entity.Ball;
import by.epam.sedkov.day3.entity.Basket;
import by.epam.sedkov.day3.entity.ColorEnum;
import by.epam.sedkov.day3.exception.ProjectException;
import by.epam.sedkov.day3.validator.VolumeValidator;

import java.util.ArrayList;

public class BasketService {

    public boolean addOneBall(Basket basket, Ball ball) {
        if (ball != null && basket != null && ball.getVolume() <= basket.getVolume()
                && VolumeValidator.hasRemainVolume(basket)) {
            return basket.add(ball);
        } else {
            return false;
        }
    }

    public double countWeight(Basket basket) throws ProjectException {
        if (basket != null && basket.getBalls() != null) {
            ArrayList<Ball> balls = basket.getBalls();
            double sum = 0;
            for (Ball iterator : balls) {
                if (iterator != null) {
                    sum += iterator.getWeight();
                } else {
                    throw new ProjectException("Ball in basket is null");
                }
            }
            return sum;
        } else {
            return -1;
        }
    }

    public int countQuantityBalls(Basket basket, ColorEnum color) throws ProjectException {
        if (basket != null && basket.getBalls() != null) {
            ArrayList<Ball> balls = basket.getBalls();
            int quantity = 0;
            for (Ball iterator : balls) {
                if (iterator != null) {
                    if (iterator.getColor() == color) {
                        quantity++;
                    }
                } else {
                    throw new ProjectException("Ball in basket is null");
                }
            }
            return quantity;
        } else {
            return -1;
        }
    }

}
