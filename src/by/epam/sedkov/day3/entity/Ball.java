package by.epam.sedkov.day3.entity;

import java.util.StringJoiner;

public class Ball {

    public static final double BALL_MAX_VOLUME = 15000;                         //cm3
    public static final double BALL_MAX_DIAMETER = 100;                         //cm
    public static final double BALL_MAX_WEIGHT = 800;                           //gr

    private double volume;
    private double diameter;
    private double weight;
    private ColorEnum color;

    public Ball() {
    }

    public Ball(double volume, double diameter, double weight, ColorEnum color) {
        this.volume = volume;
        this.diameter = diameter;
        this.weight = weight;
        this.color = color;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Ball that = (Ball) o;

        if (Double.compare(that.volume, this.volume) != 0) {
            return false;
        }
        if (Double.compare(that.diameter, this.diameter) != 0) {
            return false;
        }
        if (Double.compare(that.weight, this.weight) != 0) {
            return false;
        }
        return this.color == that.color;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(volume);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(diameter);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Ball.class.getSimpleName() + "[", "]")
                .add("volume=" + volume)
                .add("diameter=" + diameter)
                .add("weight=" + weight)
                .add("color=" + color)
                .toString();
    }

}
