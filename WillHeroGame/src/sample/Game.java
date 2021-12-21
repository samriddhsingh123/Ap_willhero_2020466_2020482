package sample;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Game implements Serializable {
    private Hero WillHero;
    private Boss boss;
    private ArrayList<Island> island_list;
    private ArrayList<Orcs> orc_list;
    private ArrayList<Obstacle> obstacle_list;
    private ArrayList<Chest> chest_list;
    private int currentScore;
    private OutputStream out;
    private InputStream in;
    private int highScore;
    private boolean gameOver;
    private static ArrayList<Game> prevGameList;
    private static long serialVersionUID;

    public void play(int i){}
    public void getInput(){}
    public void pause(){}
    public void save(){}
    public void load(){}
    public void restart(){}
    public void serialise(){}
    public void deserialise(){}
    public int getCurrentScore(){return currentScore;}
    public void setCurrentScore(int c){currentScore=c;}
    public Hero getHero(){return WillHero;}
    public Island getIthIsland(int i){
        return island_list.get(i);

    }
    public Orcs getIthOrc(int i){
        return orc_list.get(i);
    }
    public Boss getBoss(){
        return boss;
    }
    public Chest getIthChest(int i){
        return chest_list.get(i);
    }
    public int getSizeOfChestList(){return chest_list.size();}
    public int getSizeOfOrcList(){return orc_list.size();}
    public int getSizeOfIslandList(){return island_list.size();}
    public void addIsland(Island isl){
        island_list.add(isl);
    }
    public void addOrc(Orcs orc){
        orc_list.add(orc);
    }
    public void addBoss(Boss bos){
        boss=bos;
    }
    public void addChest(Chest chest){
        chest_list.add(chest);
    }
    public void addObstacle(Obstacle obs){
        obstacle_list.add(obs);
    }
    public void reviveHerousingcoins(Coin c){

    }
    public void exitGame(){}
    public void ShowMenu(){}
    public void setHighScore(int s){
        highScore=s;
    }
    public int getHighScore(){
        return highScore;
    }
}
