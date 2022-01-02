package sample;

import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Orcs extends Mortals{
    private double power;
    private Island isl;
    private int damage;
    private String color;
    private Node img;
    private int isalive=1;
    @Override
    public boolean collide(ImageView img) {
        return false;
    }

    @Override
    public void jump() {
        TranslateTransition j=new TranslateTransition();
        j.setNode(this.getImage());
        j.setByY(-100);
        j.setDuration(Duration.millis(200));
        j.play();

    }

    @Override
    public void kill(Mortals m) {
        Hero m1=(Hero)m;
        if(m1.getImage().getBoundsInParent().intersects(this.getImage().getBoundsInParent())){
            if(m1.getImage().getBoundsInParent().getMinY()<this.getImage().getBoundsInParent().getMaxY()){
                m1.die();
            }
        }
    }

    @Override
    public void die() {
        isalive=0;
    }
    public Node getImage(){
        return img;
    }
    public void setImage(Node s){
        img=s;
    }
    public void MoveHorizontal(){
        TranslateTransition j=new TranslateTransition();
        j.setNode(this.getImage());
        j.setByY(-100);
        j.setDuration(Duration.millis(200));
        j.play();
    }
    public void comment(){

    }
    public double getPower() {
        return power;
    }

    public void setPower(double d){
        power=d;
    }

    public Island getIsland() {
        return isl;
    }

    public void setIsland(Island isl) {
        this.isl = isl;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int dam) {
        this.damage = dam;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        this.color = c;
    }
}
