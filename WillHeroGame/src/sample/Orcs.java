package sample;

public class Orcs extends Mortals{
    private double power;
    private Island isl;
    private int damage;
    private String color;
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
    public void MoveHorizontal(){

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
