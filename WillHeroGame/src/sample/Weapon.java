package sample;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Weapon implements Serializable {
    private int damage;
    private static ArrayList<Weapon> weaponlist;
    private static long serialVersionUID;

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
    public void killOrcc(){}
    public int getLengthOfWeaponList(){
        return weaponlist.size();
    }
    public abstract void Throw();



}
