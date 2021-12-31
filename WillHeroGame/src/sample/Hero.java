package sample;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.io.*;


public class Hero extends Mortals{
    private Coin coin;
    private Weapon w;
    private ImageView hero;
    private int step=0;
    private int w1=0;
    private boolean isalive=true;
    Hero(){
        coin=new Coin();
        coin.setCoinVal(0);
        Position p=new Position();
        p.setX_position(0);
        p.setY_position(-100);
        setPosition(p);

    }
    public void setw1(int r){
        w1=r;
    }
    public int getw1(){
        return w1;
    }
    public void setstep(int r){
        step=r;
    }
    public int getstep(){
        return step;
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
        isalive=false;
    }
    public boolean getisalive(){
        return isalive;
    }
    public void serialise() throws IOException {
        FileOutputStream fout=new FileOutputStream("resume.txt");
        ObjectOutputStream Out=new ObjectOutputStream(fout);
        Out.writeObject(this);
        Out.close();
        fout.close();
    }
    public Hero derialise() throws IOException,ClassNotFoundException, FileNotFoundException {
        Hero r;
        try {

            FileInputStream fileInputStream = new FileInputStream("resume.txt");
            ObjectInputStream in = new ObjectInputStream(fileInputStream);
            r = (Hero) in.readObject();

            in.close();
            fileInputStream.close();
        }
        catch (FileNotFoundException e){
            return new Hero();
        }
        catch(NullPointerException e){
            return new Hero();
        }
       return r;

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
