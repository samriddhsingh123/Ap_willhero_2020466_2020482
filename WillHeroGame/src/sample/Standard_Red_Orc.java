package sample;

public class Standard_Red_Orc extends Orcs{
    Standard_Red_Orc(){
        this.setColor("red");
    }
    public Coin getCoinBykill(){
        Coin coin=new Coin();
        coin.setCoinVal(1);
        return coin;
    }
}
