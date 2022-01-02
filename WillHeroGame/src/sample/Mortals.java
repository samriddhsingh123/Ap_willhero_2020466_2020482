package sample;

import javafx.scene.image.ImageView;

import java.io.Serializable;

public abstract class Mortals implements Serializable {
    private Health health;
    private Position pos;
    private Dimension dim;
    private static long serialVersionUID;

    Mortals(){

    }
    public Health getHealth(){
        return health;
    }
    public void setHealth(Health h){
        health=h;
    }
    public void reduceHealth(int red){
        health.setValue(health.getValue()-red);
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
    public abstract boolean collide(ImageView r);

    public abstract void jump();
    public abstract void kill(Mortals m);
    public abstract void die();

}
