package sample;

import java.io.Serializable;

public class Coin implements Serializable {
    private int coin;

    public int getCoinVal() {
        return coin;
    }

    public void setCoinVal(int c) {
        this.coin = c;
    }
}
