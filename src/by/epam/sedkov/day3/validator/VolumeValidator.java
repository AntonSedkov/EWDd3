package by.epam.sedkov.day3.validator;

import by.epam.sedkov.day3.entity.Ball;
import by.epam.sedkov.day3.entity.Basket;

import java.util.ArrayList;

public class VolumeValidator {

    public static boolean hasRemainVolume(Basket basket) {
        if (basket.getBalls() == null) {
            return true;
        } else {
            ArrayList<Ball> balls = basket.getBalls();
            double occupiedVolume = 0;
            for (Ball ball : balls) {
                occupiedVolume += ball.getVolume();
            }
            double remainVolume = basket.getVolume() - occupiedVolume;
            return remainVolume > 0;
        }
    }

}
