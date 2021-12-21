package sample;

import java.io.Serializable;

public abstract class Chest implements Serializable {
    private Position pos;
    private Dimension dim;
    private static long serialVersionUID;

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

    public Dimension getDim() {
        return dim;
    }

    public void setDim(Dimension dim) {
        this.dim = dim;
    }
    public void OpenChest(){

    }
    public void touch(){

    }
}
