package test.epam.sedkov.day3.service;

import by.epam.sedkov.day3.entity.Ball;
import by.epam.sedkov.day3.entity.Basket;
import by.epam.sedkov.day3.entity.ColorEnum;
import by.epam.sedkov.day3.service.BasketService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class BasketServiceTest {

 /*   BasketService basketService;
    Basket basket;
    Ball ballBigBlue;
    Ball ballLittleGreen;
    ArrayList<Ball> arrayList;

    @BeforeClass
    public void setUp() {
        basket = new Basket(35, 1000);
        ballBigBlue = new Ball(20, 400, ColorEnum.BLUE);
        ballLittleGreen = new Ball(15, 250, ColorEnum.GREEN);
        basketService = new BasketService();
    }

    @BeforeMethod
    public void setArrayListBalls() {
        arrayList = basketService.fillUpBasket(basket, ballBigBlue, ballLittleGreen);
    }

    @Test
    public void testFillUpBasket() {
        ArrayList<Ball> expected = new ArrayList<>();
        for (int i = 0; i < 1000 / 40; i++) {
            expected.add(ballBigBlue);
            expected.add(ballLittleGreen);
        }
        Assert.assertEquals(arrayList, expected);
    }

    @Test(dataProvider = "dataWrongCreation")
    public void testWrongFillUpBasket(ArrayList<Ball> expected) {
        Assert.assertNotEquals(arrayList, expected);
    }

    @Test
    public void testCountWeight() {
        double actual = basketService.countWeight(arrayList);
        Assert.assertEquals(actual, 16250.0);
    }

    @Test
    public void testWrongCountWeight() {
        double actual = basketService.countWeight(arrayList);
        Assert.assertNotEquals(actual, 16200.0);
    }

    @Test
    public void testCountQuantityBalls() {
        int actual = basketService.countQuantityBalls(arrayList, ColorEnum.BLUE);
        Assert.assertEquals(actual, 25);
    }

    @Test
    public void testWrongQuantityBalls() {
        int actual = basketService.countQuantityBalls(arrayList, ColorEnum.BLUE);
        Assert.assertNotEquals(actual, 24);
    }

    @DataProvider(name = "dataWrongCreation")
    public Object[][] dataCreating() {

        ArrayList<Ball> arrayListOne = new ArrayList<>();
        for (int i = 0; i < 1000 / 40; i++) {
            arrayListOne.add(ballLittleGreen);
            arrayListOne.add(ballBigBlue);
        }
        ArrayList<Ball> arrayListTwo = new ArrayList<>();
        for (int i = 0; i <= 1000 / 40; i++) {
            arrayListTwo.add(ballBigBlue);
            arrayListTwo.add(ballLittleGreen);
        }
        ArrayList<Ball> arrayListThree = new ArrayList<>();
        for (int i = 0; i < 1000 / 20; i++) {
            arrayListThree.add(ballBigBlue);
            arrayListThree.add(ballLittleGreen);
        }
        return new Object[][]{
                {arrayListOne}, {arrayListTwo}, {arrayListThree}
        };
    }*/
}