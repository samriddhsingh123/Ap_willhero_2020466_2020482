package sample;

import java.io.Serializable;

public class Health implements Serializable {
    private int value;
    private static long serialVersionUID;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
