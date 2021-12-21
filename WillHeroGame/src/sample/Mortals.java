package sample;

import java.io.Serializable;

public abstract class Mortals implements Serializable {
    private Health health;
    private Position pos;
    private Dimension dim;
    private static long serialVersionUID;

    public Health getHealth(){
        return health;
    }
    public void setHealth(Health h){
        health=h;
    }
    public void reduceHealth(int red){
//        health =health-red;
    }
    public Dimension getDimension(){
        return dim;
    }
    public void setDim(Dimension d){
        dim=d;
    }
    public Position getPosition(){
        return pos;
    }
    public void setPosition(Position p){
        pos=p;
    }
    public abstract void collide(Mortals m);

    public abstract void jump();
    public abstract void kill(Mortals m);
    public abstract void die();
}
