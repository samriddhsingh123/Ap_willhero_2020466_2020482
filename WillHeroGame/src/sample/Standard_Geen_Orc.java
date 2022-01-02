package sample;

public class Standard_Geen_Orc extends Orcs {
    Standard_Geen_Orc(){
        this.setColor("green");
    }
    public Coin getCoinBykill(){
        Coin coin=new Coin();
        coin.setCoinVal(1);
        return coin;
    }
}
