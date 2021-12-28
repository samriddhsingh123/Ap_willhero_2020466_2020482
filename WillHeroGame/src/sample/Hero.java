package sample;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.util.Duration;


public class Hero extends Mortals{
    private Coin coin;
    private Weapon w;
    private ImageView hero;
    Hero(ImageView img){
       hero=img;
    }

    public void moveright(){
        TranslateTransition trans=new TranslateTransition();
        Node image=hero;
        trans.setNode(image);
        trans.setDuration(Duration.millis(300));
        trans.setByX(300);
        trans.play();
    }
    @Override
    public void collide(Mortals m) {

    }

    @Override
    public void jump() {

    }

    @Override
    public void kill(Mortals m) {

    }
    @Override
    public void die() {

    }
    public void MoveAhead(){

    }
    public void UseWeapon(){

    }
    public Weapon getWeapon(){
        return w;
    }
    public void setWeapon(Weapon weap){
        w=weap;
    }
    public void setCoin(Coin c){
      coin=c;
    }
    public Coin getCoin(){
        return coin;
    }
    public void dieOutOfScreen(){

    }


}
