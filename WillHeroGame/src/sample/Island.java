package sample;

import java.io.Serializable;

public class Island implements Serializable {
    private int IslandNumber;
    private Position pos;
    private Dimension dim;
    private static long serialVersionUID;

    public int getIslandNumber() {
        return IslandNumber;
    }

    public void setIslandNumber(int islandNumber) {
        IslandNumber = islandNumber;
    }

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
}
