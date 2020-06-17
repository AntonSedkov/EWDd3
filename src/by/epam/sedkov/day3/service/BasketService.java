package by.epam.sedkov.day3.service;

import by.epam.sedkov.day3.entity.Ball;
import by.epam.sedkov.day3.entity.ColorEnum;
import by.epam.sedkov.day3.exception.CheckedException;

import java.util.ArrayList;

public class BasketService {

    public double countWeight(ArrayList<Ball> balls) throws CheckedException {
        double sum = 0;
        for (Ball iterator : balls) {
            if (iterator != null) {
                sum += iterator.getWeight();
            } else {
                throw new CheckedException("Ball is null");
            }
        }
        return sum;
    }

    public int countQuantityBalls(ArrayList<Ball> balls, ColorEnum color) throws CheckedException {
        int quantity = 0;
        for (Ball iterator : balls) {
            if (iterator != null) {
                if (iterator.getColor() == color) {
                    quantity++;
                }
            }
        }
        return quantity;
    }

}
