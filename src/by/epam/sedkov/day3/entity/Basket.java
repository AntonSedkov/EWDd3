package by.epam.sedkov.day3.entity;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Basket {

    public static final double BASKET_MAX_VOLUME = 500_000;                         //cm3
    public static final double BASKET_MAX_DIAMETER = 500;                           //cm

    private double volume;
    private double diameter;
    private ArrayList<Ball> balls;

    public Basket() {
    }

    public Basket(double volume, double diameter) {
        this.volume = volume;
        this.diameter = diameter;
        balls = new ArrayList<Ball>();
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public ArrayList<Ball> getBalls() {
        return this.balls;
    }

    public void setBalls(ArrayList<Ball> balls) {
        this.balls = balls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Basket that = (Basket) o;

        if (Double.compare(that.volume, this.volume) != 0) {
            return false;
        }
        if (Double.compare(that.diameter, this.diameter) != 0) {
            return false;
        }
        return that.balls != null ? that.balls.equals(this.balls) : that.balls == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(volume);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(diameter);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (balls != null ? balls.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Basket.class.getSimpleName() + "[", "]")
                .add("volume=" + volume)
                .add("diameter=" + diameter)
                .add("balls=" + balls)
                .toString();
    }

    public boolean addBall(Ball ball) {
        volume = volume - ball.getVolume();
        return balls.add(ball);
    }
}
