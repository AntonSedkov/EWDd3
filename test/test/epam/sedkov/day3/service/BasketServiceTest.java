package test.epam.sedkov.day3.service;

import by.epam.sedkov.day3.entity.Ball;
import by.epam.sedkov.day3.entity.Basket;
import by.epam.sedkov.day3.entity.ColorEnum;
import by.epam.sedkov.day3.exception.ProjectException;
import by.epam.sedkov.day3.service.BasketService;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class BasketServiceTest {

    BasketService basketService;
    Basket basket;
    Ball ballOneBlue;
    Ball ballTwoGreen;
    ArrayList<Ball> balls;

    @BeforeMethod
    public void setUp() {
        basketService = new BasketService();
        basket = new Basket(60000);
        balls = new ArrayList<>();
        ballOneBlue = new Ball(14000, 500, ColorEnum.BLUE);
        ballTwoGreen = new Ball(10000, 300, ColorEnum.GREEN);
        balls.add(ballOneBlue);
        balls.add(ballTwoGreen);
        balls.add(ballOneBlue);
        balls.add(ballTwoGreen);
        balls.add(ballOneBlue);
        basket.setBalls(balls);
    }

    @Test
    public void testAddOneBall() {
        Basket basketTest = new Basket(55000);
        boolean actual = basketService.addOneBall(basketTest, ballOneBlue);
        assertTrue(actual);
    }

    @Test(dataProvider = "addOneBallData")
    public void testWrongAddOneBall(Basket basket, Ball ball) {
        boolean actual = basketService.addOneBall(basket, ball);
        assertFalse(actual);
    }

    @DataProvider(name = "addOneBallData")
    public Object[][] addOneBallData() {
        return new Object[][]{
                {null, null},
                {null, ballOneBlue},
                {basket, null},
                {new Basket(1000), new Ball(5000, 500, ColorEnum.WHITE)},
                {basket, ballOneBlue}
        };
    }

    @Test
    public void testCountWeight() {
        try {
            double actual = basketService.countWeight(basket);
            assertEquals(actual, 2100.0);
        } catch (ProjectException e) {
            fail();
        }
    }

    @Test
    public void testWrongCountWeight() {
        try {
            double actual = basketService.countWeight(null);
            assertEquals(actual, -1.0);
        } catch (ProjectException e) {
            fail();
        }
    }

    @Test
    public void testWrongSecondCountWeight() {
        try {
            Basket basketTest = new Basket(1000);
            double actual = basketService.countWeight(basketTest);
            assertEquals(actual, -1.0);
        } catch (ProjectException e) {
            fail();
        }
    }

    @Test(expectedExceptions = ProjectException.class, expectedExceptionsMessageRegExp = "Ball in basket is null")
    public void testExceptionCountWeight() throws ProjectException {
        Basket basketTest = new Basket(1000);
        ArrayList<Ball> ballArrayList = new ArrayList<>();
        ballArrayList.add(ballOneBlue);
        ballArrayList.add(null);
        ballArrayList.add(ballTwoGreen);
        basketTest.setBalls(ballArrayList);
        double actual = basketService.countWeight(basketTest);
    }

    @Test
    public void testCountQuantityBalls() {
        try {
            int actual = basketService.countQuantityBalls(basket, ColorEnum.BLUE);
            assertEquals(actual, 3);
        } catch (ProjectException e) {
            fail();
        }
    }

    @Test
    public void testWrongCountQuantityBalls() {
        try {
            int actual = basketService.countQuantityBalls(null, ColorEnum.GREEN);
            assertEquals(actual, -1);
        } catch (ProjectException e) {
            fail();
        }
    }

    @Test
    public void testWrongSecondCountQuantityBalls() {
        try {
            Basket basketTest = new Basket(1000);
            int actual = basketService.countQuantityBalls(basketTest, ColorEnum.BLACK);
            assertEquals(actual, -1);
        } catch (ProjectException e) {
            fail();
        }
    }

    @Test(expectedExceptions = ProjectException.class, expectedExceptionsMessageRegExp = "Ball in basket is null")
    public void testExceptionCountQuantityBalls() throws ProjectException {
        Basket basketTest = new Basket(1000);
        ArrayList<Ball> ballArrayList = new ArrayList<>();
        ballArrayList.add(ballOneBlue);
        ballArrayList.add(null);
        ballArrayList.add(ballTwoGreen);
        basketTest.setBalls(ballArrayList);
        int actual = basketService.countQuantityBalls(basketTest, ColorEnum.WHITE);
    }

}