package by.epam.sedkov.day3.entity;

import by.epam.sedkov.day3.exception.ProjectException;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Basket {

    private static final double BASKET_MAX_VOLUME = 500_000;

    private final double volume;
    private ArrayList<Ball> balls;

    public Basket(double volume) {
        if (volume > 0 && volume <= BASKET_MAX_VOLUME) {
            this.volume = volume;
        } else {
            this.volume = -1;
        }
    }

    public double getVolume() {
        return volume;
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public void setBalls(ArrayList<Ball> balls) {
        this.balls = balls;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Basket that = (Basket) o;
        if (Double.compare(that.volume, this.volume) != 0) {
            return false;
        }
        return this.balls != null ? this.balls.equals(that.balls) : that.balls == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(volume);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (balls != null ? balls.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Basket.class.getSimpleName() + " [", "]")
                .add("volume = " + volume + " cm3")
                .add("balls = " + balls)
                .toString();
    }

    public Ball get(int index) throws ProjectException {
        if (index >= 0 && index < balls.size()) {
            return balls.get(index);
        } else {
            throw new ProjectException("Wrong index");
        }
    }

    public boolean add(Ball ball) {
        if (balls == null) {
            balls = new ArrayList<>();
            return balls.add(ball);
        } else {
            return balls.add(ball);
        }
    }

}
