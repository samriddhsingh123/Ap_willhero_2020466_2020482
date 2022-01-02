package sample;

import javafx.scene.Node;

import javax.swing.text.html.ImageView;
import java.io.Serializable;
import java.util.ArrayList;

public abstract class Weapon implements Serializable {
    private int damage;
    private static ArrayList<Weapon> weaponlist;
    private static long serialVersionUID;
    private Node img;
    public void setImage(ImageView img){
        img=img;
    }
    public Node getImage(){
        return img;
    }
    public Weapon getIthOfWeaponlist(int i) {
        return weaponlist.get(i);
    }

    public void addWeaponToWeaponlist(Weapon w) {
       weaponlist.add(w);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void killOrcc(Orcs orc){
        orc.die();
    }
    public int getLengthOfWeaponList(){
        return weaponlist.size();
    }
    public abstract void Throw();



}
