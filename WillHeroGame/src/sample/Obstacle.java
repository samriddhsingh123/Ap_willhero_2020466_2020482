package sample;

import java.io.Serializable;

public class Obstacle implements Serializable {
    private Position pos;
    private Dimension dim;
    private static long serialVersionUID;

    public Obstacle() {
    }

    public void KillHero(){}
    public  void touch(){

    }
    public int damage(){
        return 10;
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
//    public Island getIsland(){}

}
