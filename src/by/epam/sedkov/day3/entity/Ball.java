package by.epam.sedkov.day3.entity;

import java.util.StringJoiner;

public class Ball {

    private static final double BALL_MAX_VOLUME = 15000;
    private static final double BALL_MAX_WEIGHT = 800;

    private final double volume;
    private final double weight;
    private ColorEnum color;

    public Ball(double volume, double weight, ColorEnum color) {
        if (volume > 0 && volume <= BALL_MAX_VOLUME) {
            this.volume = volume;
        } else {
            this.volume = -1;
        }
        if (weight > 0 && weight <= BALL_MAX_WEIGHT) {
            this.weight = weight;
        } else {
            this.weight = -1;
        }
        this.color = color;
    }

    public double getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Ball that = (Ball) o;
        if (Double.compare(that.volume, this.volume) != 0) {
            return false;
        }
        if (Double.compare(that.weight, this.weight) != 0) {
            return false;
        }
        return that.color == this.color;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(volume);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Ball.class.getSimpleName() + " [", "]\n")
                .add("volume = " + volume + " cm3")
                .add("weight = " + weight + " gr")
                .add("color = " + color)
                .toString();
    }

}
