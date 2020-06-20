package test.epam.sedkov.day3.creator;

import by.epam.sedkov.day3.creator.BasketWithBallCreator;
import by.epam.sedkov.day3.entity.Ball;
import by.epam.sedkov.day3.entity.Basket;
import by.epam.sedkov.day3.entity.ColorEnum;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.assertEquals;

public class BasketWithBallCreatorTest {

    BasketWithBallCreator basketWithBallCreator;
    Basket basket;
    Ball ballOneBlue;
    Ball ballTwoGreen;
    ArrayList<Ball> balls;
    ArrayList<Ball> ballsInBasket;

    @BeforeMethod
    public void setUp() {
        basketWithBallCreator = new BasketWithBallCreator();
        basket = new Basket(30000);
        balls = new ArrayList<>();
        ballsInBasket = new ArrayList<>();
        ballOneBlue = new Ball(14000, 500, ColorEnum.BLUE);
        ballTwoGreen = new Ball(10000, 300, ColorEnum.GREEN);
        balls.add(ballOneBlue);
        balls.add(ballTwoGreen);
        ballsInBasket.add(ballOneBlue);
        ballsInBasket.add(ballTwoGreen);
        ballsInBasket.add(ballOneBlue);
        basket.setBalls(ballsInBasket);
    }

    @Test
    public void testBallsInBasket() {
        Basket basketActual = new Basket(30000);
        basketWithBallCreator.ballsInBasket(basketActual, balls);
        assertEquals(basketActual.getBalls(), basket.getBalls());
    }

}