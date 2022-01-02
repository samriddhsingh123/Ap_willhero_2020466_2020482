package sample;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Camera;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

import javax.swing.text.html.HTMLDocument;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Game extends Application implements Serializable {
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
    private Scene scene;
    private Camera camera;
    Game(){
        camera=new PerspectiveCamera();
        Hero h=new Hero();
        Orcs boss=new Boss();
        for(int i=0;i<54;i++){
            island_list.add(new Island());
        }
        for(int i=0;i<14;i++){
            orc_list.add(new Standard_Geen_Orc());
        }
        for(int i=14;i<16;i++){
            orc_list.add(new Standard_Red_Orc());
        }
        for(int i=16;i<23;i++){
            orc_list.add(new Standard_Geen_Orc());
        }
        for(int i=0;i<3;i++){
            obstacle_list.add(new fallingplatform());
        }
        for(int i=0;i<8;i++){
            if(i==0||i==1||i==4||i==5||i==7){
                chest_list.add(new CoinChest());
                continue;
            }
            chest_list.add(new WeaponChest());

        }
    }
    @Override
    public void start(Stage stage){
        FXMLLoader ld=new FXMLLoader(Main.class.getResource("sample.fxml"));
        Controller cd=ld.getController();
        try {
            cd.switchToGame(new ActionEvent());
        }catch(Exception e){

        }
    }
    public Hero getWillHero(){
        return WillHero;
    }
    public void play(){
        FXMLLoader ld=new FXMLLoader(Main.class.getResource("sample.fxml"));
        Controller cd=ld.getController();
        try {
            cd.switchToGame(new ActionEvent());
        }catch(Exception e){

        }
    }
    public void getInput(){
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getText().equals("d")) {

                    TranslateTransition trans = new TranslateTransition();
                    trans.setNode(camera);
                    trans.setDuration(Duration.millis(300));
                    trans.setByX(300);
                    trans.play();


                }
            }

        });
    }
    public void pause(){
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getText().equals("p")) {

                    Controller cd=new Controller();
                    try {
                        cd.pause(null);
                    }
                    catch (Exception e){

                    }


                }
            }

        });
    }
    public void save(){
        try {
            getWillHero().serialise();
        }
        catch (Exception e){

        }
        Game r= new Game();
        r.setHero(getWillHero());
        prevGameList.add(r);
        try {
            r.serialise();
        }
        catch (Exception e){

        }
    }
    public void setHero(Hero r){
        WillHero=r;
    }
    public void load() throws NoSavedGameException{
        if(prevGameList.size()==0){
            throw new NoSavedGameException();
        }
        try {
            getWillHero().derialise();
        }
        catch (Exception e){

        }
        play();
    }
    public void restart(){
        WillHero=new Hero();
        try {
            WillHero.serialise();
        }
        catch(Exception e){}
        play();
    }
    public Island searchislandwithid(String id){
        Iterator it=island_list.iterator();
        while(it.hasNext()){
            Island r=(Island) it.next();
            if(r.getId().equals(id)){
                return r;
            }
        }
        return null;
    }
    public void serialise() throws IOException{
        FileOutputStream fout=new FileOutputStream("game.txt");
        ObjectOutputStream Out=new ObjectOutputStream(fout);
        Out.writeObject(this);
        Out.close();
        fout.close();
    }
    public Game derialise() throws IOException,ClassNotFoundException, FileNotFoundException {
        Game r;
        try {

            FileInputStream fileInputStream = new FileInputStream("game.txt");
            ObjectInputStream in = new ObjectInputStream(fileInputStream);
            r = (Game) in.readObject();

            in.close();
            fileInputStream.close();
        }
        catch (FileNotFoundException e){
            return new Game();
        }
        catch(NullPointerException e){
            return new Game();
        }
        return r;

    }
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
    public void reviveHerousingcoins(Coin c) throws NotSufficientCoinException{
        if(c.getCoinVal()<10){
            throw new NotSufficientCoinException();
        }
        Controller cd=new Controller();
        cd.setyesrevive(null);
    }
    public void exitGame(){
        Controller2 cd=new Controller2();
        try {
            cd.exitToMainMenu(null);
        }
        catch(Exception e){}

    }
    public void ShowMenu(){
        Controller2 cd=new Controller2();
        try {
            cd.exitToMainMenu(null);
        }
        catch(Exception e){

        }
    }
    public void setHighScore(int s){
        highScore=s;
    }
    public int getHighScore(){
        return highScore;
    }
}
