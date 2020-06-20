package test.epam.sedkov.day3.validator;

import by.epam.sedkov.day3.entity.Ball;
import by.epam.sedkov.day3.entity.Basket;
import by.epam.sedkov.day3.entity.ColorEnum;
import by.epam.sedkov.day3.validator.VolumeValidator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class VolumeValidatorTest {

    Basket basket;
    Ball ballOneBlue;
    ArrayList<Ball> balls;

    @BeforeMethod
    public void setUp() {
        basket = new Basket(40000);
        ballOneBlue = new Ball(14000, 500, ColorEnum.BLUE);
        balls = new ArrayList<>();
        balls.add(ballOneBlue);
        balls.add(ballOneBlue);
    }

    @Test
    public void testHasRemainVolume() {
        boolean actual = VolumeValidator.hasRemainVolume(basket);
        Assert.assertTrue(actual);
    }

    @Test
    public void testSecondHasRemainVolume() {
        basket.setBalls(balls);
        boolean actual = VolumeValidator.hasRemainVolume(basket);
        Assert.assertTrue(actual);
    }

    @Test
    public void testWrongHasRemainVolume() {
        balls.add(ballOneBlue);
        basket.setBalls(balls);
        boolean actual = VolumeValidator.hasRemainVolume(basket);
        Assert.assertFalse(actual);
    }
}