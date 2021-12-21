package sample;

public class Hero extends Mortals{
    private Coin coin;
    private Weapon w;
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
