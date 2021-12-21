package sample;

import java.io.Serializable;

public class Position implements Serializable {
    private static long serialVersionUID;
    private double x_position;
    private double y_position;

    public Position() {
    }

    public double getX_position() {
        return x_position;
    }

    public void setX_position(double x_position) {
        this.x_position = x_position;
    }

    public double getY_position() {
        return y_position;
    }

    public void setY_position(double y_position) {
        this.y_position = y_position;
    }
}
