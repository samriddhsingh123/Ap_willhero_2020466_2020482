package sample;

import java.io.Serializable;

public class Dimension implements Serializable {
    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }

    public void setLength(double d) {
        this.length = d;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double d) {
        this.breadth = d;
    }
}
