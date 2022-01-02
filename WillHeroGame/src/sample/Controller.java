//package sample;
//
//
//
//import javafx.animation.KeyFrame;
//import javafx.animation.Timeline;
//import javafx.animation.TranslateTransition;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
//import javafx.scene.Node;
//import javafx.scene.image.ImageView;
//import javafx.util.Duration;
//
//import java.awt.event.KeyEvent;
//import java.net.URL;
//import java.sql.Time;
//import java.util.ResourceBundle;
//
//public class Controller implements Initializable {
//
//    @FXML
//    private ImageView hero;
//    @FXML
//    private ImageView platform1;
//    @FXML
//    private ImageView platform2;
//    @FXML
//    private ImageView platform3;
//    @FXML
//    private ImageView platform4;
//    @FXML
//    private ImageView platform5;
//    @FXML
//    private ImageView platform6;
//    @FXML
//    private ImageView platform7;
//
////    Timeline tl=new Timeline(new KeyFrame(Duration.millis(10), new EventHandler<ActionEvent>() {
////        @Override
////        public void handle(ActionEvent actionEvent) {
////            checkCollision(platform1);
////
////
////        }
////    }));
//    public void checkCollision(ImageView platform){
//        if(hero.getBoundsInParent().intersects(platform.getBoundsInParent())) {
//            TranslateTransition trans=new TranslateTransition();
//            Node image=hero;
//            trans.setNode(image);
//            trans.setDuration(Duration.millis(1000));
//            trans.setCycleCount(TranslateTransition.INDEFINITE);
//            trans.setByY(-100);
//            trans.setAutoReverse(true);
//            trans.play();
//        }}
//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//
//        checkCollision(platform1);
//    }
//    public void moveright(){
//        for(int i=1;i<=5;i++) {
//            hero.setX(hero.getX() + 7);
//        }
//    }
//    public void start(ActionEvent e){
//
//    }
//    public void resume(ActionEvent e){
//
//    }
//    public void exit(ActionEvent e){
//
//    }
//}
package sample;

import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Bounds;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.effect.Effect;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLOutput;
import java.sql.Time;
import java.util.LinkedList;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class Controller implements Initializable{

    @FXML
    private ImageView axe;
    @FXML
    private ImageView hero;
    @FXML
    private ImageView platform1;
    @FXML
    private ImageView platform2;
    @FXML
    private ImageView platform3;
    @FXML
    private ImageView platform4;
    @FXML
    private ImageView platform5;
    @FXML
    private ImageView platform6;
    @FXML
    private ImageView platform7;
    @FXML
    private ImageView platform8;
    @FXML
    private ImageView platform9;
    @FXML
    private ImageView platform10;
    @FXML
    private ImageView platform11;
    @FXML
    private ImageView platform12;
    @FXML
    private ImageView platform13;
    @FXML
    private ImageView platform14;
    @FXML
    private ImageView platform15;
    @FXML
    private ImageView platform16;

    @FXML
    private ImageView platform17;
    @FXML
    private ImageView platform18;
    @FXML
    private ImageView platform19;
    @FXML
    private ImageView platform20;
    @FXML
    private ImageView platform21;
    @FXML
    private ImageView platform22;
    @FXML
    private ImageView platform23;
    @FXML
    private ImageView platform24;
    @FXML
    private ImageView platform25;
    @FXML
    private ImageView platform26;
    @FXML
    private ImageView platform27;
    @FXML
    private ImageView platform28;
    @FXML
    private ImageView platform29;
    @FXML
    private ImageView platform30;
    @FXML
    private ImageView platform31;
    @FXML
    private ImageView platform32;
    @FXML
    private ImageView platform33;
    @FXML
    private ImageView platform34;
    @FXML
    private ImageView platform35;
    @FXML
    private ImageView platform36;
    @FXML
    private ImageView platform37;
    @FXML
    private ImageView platform38;
    @FXML
    private ImageView platform39;
    @FXML
    private ImageView platform40;
    @FXML
    private ImageView platform41;
    @FXML
    private ImageView platform42;
    @FXML
    private ImageView platform43;
    @FXML
    private ImageView platform44;
    @FXML
    private ImageView platform45;
    @FXML
    private ImageView platform46;
    @FXML
    private ImageView platform47;
    @FXML
    private ImageView platform48;
    @FXML
    private ImageView platform49;
    @FXML
    private ImageView platform50;
    @FXML
    private ImageView platform51;
    @FXML
    private ImageView platform52;
    @FXML
    private ImageView platform53;

    private LinkedList<ImageView> platformlist=new LinkedList<>();
    @FXML
    private ImageView c1;
    @FXML
    private ImageView c2;
    @FXML
    private ImageView c3;
    @FXML
    private ImageView c4;
    @FXML
    private ImageView c5;
    @FXML
    private ImageView c6;
    @FXML
    private ImageView c7;
    @FXML
    private ImageView c8;
    @FXML
    private ImageView c9;
    @FXML
    private ImageView c10;
    @FXML
    private ImageView c11;
    @FXML
    private ImageView c12;
    @FXML
    private ImageView b1;
    @FXML
    private ImageView b2;
    @FXML
    private ImageView b3;
    @FXML
    private ImageView b4;
    @FXML
    private ImageView b5;
    @FXML
    private ImageView b6;
    @FXML
    private ImageView b7;
    @FXML
    private ImageView b8;
    @FXML
    private ImageView b9;
    @FXML
    private ImageView b10;
    @FXML
    private ImageView b11;
    @FXML
    private ImageView b12;
    @FXML
    private ImageView d1;
    @FXML
    private ImageView d2;
    @FXML
    private ImageView d3;
    @FXML
    private ImageView d4;
    @FXML
    private ImageView d5;
    @FXML
    private ImageView d6;
    @FXML
    private ImageView d7;
    @FXML
    private ImageView d8;
    @FXML
    private ImageView d9;
    @FXML
    private ImageView d10;
    @FXML
    private ImageView d11;
    @FXML
    private ImageView d12;
    @FXML
    private ImageView a1;
    @FXML
    private ImageView a2;
    @FXML
    private ImageView a3;
    @FXML
    private ImageView a4;
    @FXML
    private ImageView a5;
    @FXML
    private ImageView a6;
    @FXML
    private ImageView a7;
    @FXML
    private ImageView a8;
    @FXML
    private ImageView a9;
    @FXML
    private ImageView a10;
    @FXML
    private ImageView a11;
    @FXML
    private ImageView a12;
    @FXML
    private Button pauseButton;
    @FXML
    private ImageView boss;
    @FXML
    private ImageView orc1;
    @FXML
    private ImageView orc2;
    @FXML
    private ImageView orc3;
    @FXML
    private ImageView orc4;
    @FXML
    private ImageView orc5;
    @FXML
    private ImageView orc6;
    @FXML
    private ImageView orc7;
    @FXML
    private ImageView orc8;
    @FXML
    private ImageView orc9;
    @FXML
    private ImageView orc10;
    @FXML
    private ImageView orc11;
    @FXML
    private ImageView orc12;
    @FXML
    private ImageView orc13;
    @FXML
    private ImageView orc14;
    @FXML
    private ImageView orc15;
    @FXML
    private ImageView orc16;
    @FXML
    private ImageView orc17;
    @FXML
    private ImageView orc18;
    @FXML
    private ImageView orc19;
    @FXML
    private ImageView orc20;
    @FXML
    private ImageView orc21;
    @FXML
    private ImageView orc22;
    @FXML
    private ImageView sampleorc;
    @FXML
    private ImageView chest1;//coin
    private int check1=0;
    @FXML
    private ImageView chest2;//axe
    @FXML
    private ImageView chest3;//coin
    private int check3=0;
    @FXML
    private ImageView chest4;//axeupgrade
    @FXML
    private ImageView chest5;//coin
    private int check5=0;
    @FXML
    private ImageView chest6;//coin
    private int check6=0;
    @FXML
    private ImageView chest7;//knife
    @FXML
    private ImageView chest8;//coin
    private int check8;
    @FXML
    private ImageView knife1;
    @FXML
    private ImageView knife2;
    @FXML
    private ImageView knife3;
    @FXML
    private Button revivebutton;
    @FXML
    private Label stepcounter;
    @FXML
    private Label coincounter;
    @FXML
    private ImageView movecoin;
    @FXML
    private ImageView coin1;
    @FXML
    private ImageView coin2;
    @FXML
    private ImageView coin3;
    @FXML
    private ImageView coin4;
    @FXML
    private ImageView coin5;
    @FXML
    private ImageView coin6;
    @FXML
    private DialogPane revivepane2;
    @FXML
    private Label saveme;
    @FXML
    private ImageView reviveorc;
    @FXML
    private Button revivenobutton;
    @FXML
    private Button reviveyesbutton;
    @FXML
    private ImageView movecoin1;
    @FXML
    private ImageView background;
    @FXML
    private AnchorPane wonpane;
    @FXML
    private Label toofast;

    @FXML
    private Button mainmenubutton;
    @FXML
    private ImageView openchest1;
    @FXML
    private ImageView openchest2;
    @FXML
    private ImageView openchest3;
    @FXML
    private ImageView openchest4;
    @FXML
    private ImageView openchest5;
    @FXML
    private ImageView openchest6;
    @FXML
    private ImageView openchest7;
    @FXML
    private ImageView openchest8;
    @FXML
    private Label timer;
    @FXML
    private ImageView bigcoin;

    private int time=120;
    private int timeelapsed=0;
    private Thread t;
    private int cameracheck=0;
    private Hero will;
    private int bossisdead=0;
    private int bosslife=30;
    //private int scenecheck=0;
    private Game g;
    private Hero h;
    private int herodead=0;
    private int upgraded;
    private int axefound;
    private LinkedList<Node> plist=new LinkedList<>();
    private Stage stage;
    private Scene scene;
    private Parent root;
    private Camera camera=new PerspectiveCamera();

    public void starttimer(){
        t=new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                try {
                    while(true){
                        will.settimeelapsed(timeelapsed);
                      //  System.out.println(timeelapsed);
                        timeelapsed++;
                        t.sleep(1000);

                    }
                }
                catch(Exception e){

                }
            }
        });
        t.start();
    }
    public void settimelabel(){
        if(timeelapsed>60){
            timer.setStyle("-fx-text-fill: #ffb3b3;");
        }
        if(timeelapsed>90){
            timer.setStyle("-fx-text-fill: #ff6666;");
        }
        if(timeelapsed>120){
            timer.setStyle("-fx-text-fill: #ff0000;");
        }
        int seconds=timeelapsed%60;
        int minutes=timeelapsed/60;
        String text1=Integer.toString(seconds);
        String text2=Integer.toString(minutes);
        if(seconds<10){
            text1="0"+Integer.toString(seconds);
        }

        if(minutes<10){
            text2="0"+Integer.toString(minutes);
        }
        String text=text2+":"+text1;
        timer.setText(text);
    }
    public ImageView getheroimg(){
        return hero;
    }
    public void setcoincounter(int c){
        int num=Integer.parseInt(coincounter.getText());
        coincounter.setText(Integer.toString(c));
    }
    public void changecoincounter(int i){
        int num=Integer.parseInt(coincounter.getText());
        coincounter.setText(Integer.toString(num+i));
       // will.getCoin().setCoinVal(num+i);
    }
    public void incrementstepcounter(){
        int num=Integer.parseInt(stepcounter.getText());
        stepcounter.setText(Integer.toString(num+1));
    }
    public void setstepcounter(int i){
        int num=Integer.parseInt(stepcounter.getText());
        stepcounter.setText(Integer.toString(i));
    }
    public void checkorcalive(ImageView orc){
        if(orc.getBoundsInParent().getCenterY()>800){
            if(orc.getOpacity()==1) {
                orc.setOpacity(0);
                changecoincounter(2);
            }
        }
    }
    public void checkcollisionbosswithweapon(ImageView weapon){
        if(weapon.getOpacity()!=0){
            if(boss.getBoundsInParent().intersects(weapon.getBoundsInParent())){
                bosslife-=1;
            }
        }
    }
    public void checkbossalive(){
        if(bosslife==0){
            if(bossisdead==0){
                bossisdead=1;
                changecoincounter(5);
                boss.setOpacity(0);
            }
        }
    }
    public void checkbosscollision(){
        if(boss.getOpacity()!=0) {
            if (hero.getBoundsInParent().intersects(boss.getBoundsInParent())) {
                double herotop = hero.getBoundsInParent().getMinY();
                double herocentrex = hero.getBoundsInParent().getCenterX();
                double herobottom = hero.getBoundsInParent().getMaxY();
                double heroright = hero.getBoundsInParent().getMaxX();
                double heroleft = hero.getBoundsInParent().getMinX();
                double bossleft = boss.getBoundsInParent().getMinX();
                double bossright = boss.getBoundsInParent().getMaxX();
                double bossdown = boss.getBoundsInParent().getMaxY();
                double bosstop = boss.getBoundsInParent().getMinY();
                if (boss.getOpacity() != 0) {
                    if (hero.getBoundsInParent().intersects(boss.getBoundsInParent())) {
                        if (heroright > bossleft) {

                            if (herotop < bossdown) {
                                if (bossdown < herotop + 10) {
                                    if (herodead == 0) {
                                     //   revivebutton.fire();

                                        herodead=1;
                                        will.die();
                                        try{
                                            will.serialise();
                                        }
                                        catch(Exception e){

                                        }
                                        showrevivescene();

                                    }
                                }
                            }

                            if (bossleft + 20 >= heroright) {
                                TranslateTransition trans = new TranslateTransition();
                                trans.setNode(boss);
                                trans.setDuration(Duration.millis(100));
                                trans.setByX(200);
                                trans.setOnFinished(e -> finished1(boss));
                                trans.play();

                            }

                        }
                        if (herobottom >= bosstop) {
                            if (bosstop + 20 >= herobottom) {
                                TranslateTransition k1 = new TranslateTransition();
                                k1.setNode(knife1);
                                k1.setDuration(Duration.millis(100));
                                k1.setByY(-100);
                                k1.play();
                                TranslateTransition k2 = new TranslateTransition();
                                k2.setNode(knife2);
                                k2.setDuration(Duration.millis(100));
                                k2.setByY(-100);
                                k2.play();
                                TranslateTransition k3 = new TranslateTransition();
                                k3.setNode(knife3);
                                k3.setDuration(Duration.millis(100));
                                k3.setByY(-100);
                                k3.play();
                                TranslateTransition trans = new TranslateTransition();
                                trans.setNode(hero);
                                trans.setDuration(Duration.millis(100));
                                trans.setByY(-100);
                                trans.setOnFinished(e -> finished());
                                TranslateTransition ax = new TranslateTransition();
                                ax.setNode(axe);
                                ax.setDuration(Duration.millis(100));
                                ax.setByY(-100);
                                ax.play();
                                trans.play();


                            }
                        }
                    }
                }
            }
        }
    }
    public void checkbosscollisionwithplatform(ImageView platform){
        double bossleft=boss.getBoundsInParent().getMinX();
        double bossright=boss.getBoundsInParent().getMaxX();
        double bossdown=boss.getBoundsInParent().getMaxY();
        double bosstop=boss.getBoundsInParent().getMinY();
        double ptop=platform.getBoundsInParent().getMinY();
        double pbottom=platform.getBoundsInParent().getMaxY();
        double pright=platform.getBoundsInParent().getMaxX();
        double pleft=platform.getBoundsInParent().getMinX();

        if(boss.getBoundsInParent().intersects(platform.getBoundsInParent())) {

            if (bossdown >= ptop) {
                if(ptop+60>=bossdown) {
                    TranslateTransition trans = new TranslateTransition();
                    Node image = boss;
                    trans.setNode(image);
                    trans.setDuration(Duration.millis(300));
                    trans.setByY(-150);
                    trans.setOnFinished(e -> finished1(boss));
                    trans.play();
                }
                if(bossdown>ptop+60){
                    if(bossright>=pleft){
                        TranslateTransition trans = new TranslateTransition();
                        Node image = boss;
                        trans.setNode(image);
                        trans.setDuration(Duration.millis(500));

                        trans.setByX(-50);

                        trans.setOnFinished(e -> finished1(boss));
                        trans.play();

                    }
                }


            }


        }}

    AnimationTimer herowithorc=new AnimationTimer() {
        @Override
        public void handle(long l) {
            checkbossalive();
            checkcollisionbosswithweapon(knife1);
            checkcollisionbosswithweapon(knife2);
            checkcollisionbosswithweapon(knife3);
            checkcollisionbosswithweapon(axe);

            checkbosscollisionwithplatform(d1);
            checkbosscollisionwithplatform(d2);
            checkbosscollisionwithplatform(d3);
            checkbosscollisionwithplatform(d4);
            checkbosscollisionwithplatform(d5);
            checkbosscollisionwithplatform(d6);
            checkbosscollisionwithplatform(d7);
            checkbosscollisionwithplatform(d8);
            checkbosscollisionwithplatform(d9);
            checkbosscollisionwithplatform(d10);
            checkbosscollisionwithplatform(d11);
            checkbosscollisionwithplatform(d12);
            checkbosscollisionwithplatform(platform49);
            checkbosscollisionwithplatform(platform50);
            checkbosscollisionwithplatform(platform51);
            checkbosscollisionwithplatform(platform52);
            checkbosscollisionwithplatform(platform53);





            checkCollisionorcwithHero(orc1);
            checkCollisionorcwithHero(orc2);
            checkCollisionorcwithHero(orc3);
            checkCollisionorcwithHero(orc4);
            checkCollisionorcwithHero(orc5);
            checkCollisionorcwithHero(orc6);
            checkCollisionorcwithHero(orc7);
            checkCollisionorcwithHero(orc8);
            checkCollisionorcwithHero(orc9);
            checkCollisionorcwithHero(orc11);
            checkCollisionorcwithHero(orc12);
            checkCollisionorcwithHero(orc13);
            checkCollisionorcwithHero(orc14);
            checkCollisionorcwithHero(orc15);
            checkCollisionorcwithHero(orc16);
            checkCollisionorcwithHero(orc17);
            checkCollisionorcwithHero(orc18);
            checkCollisionorcwithHero(orc19);
            checkCollisionorcwithHero(orc20);
            checkCollisionorcwithHero(orc21);
            checkCollisionorcwithHero(orc22);
            checkorcalive(orc1);
            checkorcalive(orc2);
            checkorcalive(orc3);
            checkorcalive(orc4);
            checkorcalive(orc5);
            checkorcalive(orc6);
            checkorcalive(orc7);
            checkorcalive(orc8);
            checkorcalive(orc9);
            checkorcalive(orc11);
            checkorcalive(orc12);
            checkorcalive(orc13);
            checkorcalive(orc14);
            checkorcalive(orc15);
            checkorcalive(orc16);
            checkorcalive(orc17);
            checkorcalive(orc18);
            checkorcalive(orc19);
            checkorcalive(orc20);
            checkorcalive(orc21);
            checkorcalive(orc22);

        }
    };
    AnimationTimer herowithchest=new AnimationTimer() {
        @Override
        public void handle(long l) {
            settimelabel();
            checkherowon();
            checkbossalive();
            checkbosscollision();
            checkherodead();
            checkcoincollision();
            checkcollisioherowithchest(chest1);
            checkcollisioherowithchest(chest2);
            checkcollisioherowithchest(chest3);
            checkcollisioherowithchest(chest4);
            checkcollisioherowithchest(chest5);
            checkcollisioherowithchest(chest6);
            checkcollisioherowithchest(chest7);
            checkcollisioherowithchest(chest8);


        }
    };
    public void checkcollisioherowithchest(ImageView chest){
        if(chest.getBoundsInParent().intersects(hero.getBoundsInParent())){
            if(chest.getId().equals("chest1")){
                if(check1==0){
                    check1=1;
                    changecoincounter(3);
                    openchest1.setOpacity(1);
                    chest1.setOpacity(0);
                }
            }
            if(chest.getId().equals("chest2")){
                axe.setOpacity(1);
                axefound=1;
                openchest2.setOpacity(1);
                chest2.setOpacity(0);
            }
            if(chest.getId().equals("chest3")){
                if(check3==0){
                    check3=1;
                    changecoincounter(3);
                    openchest3.setOpacity(1);
                    chest3.setOpacity(0);
                }
            }
            if(chest.getId().equals("chest4")){
                if(upgraded==0) {
                    if(axe.getOpacity()!=0) {
                        upgraded = 1;
                        axe.setFitHeight(axe.getFitHeight() + 15);
                        axe.setFitWidth(axe.getFitHeight() + 7.5);
                        openchest4.setOpacity(1);
                        chest4.setOpacity(0);
                    }
                    else{
                        axe.setOpacity(1);
                    }
                }
            }
            if(chest.getId().equals("chest5")){
                if(check5==0){
                    check5=1;
                    changecoincounter(3);
                    openchest5.setOpacity(1);
                    chest5.setOpacity(0);
                }
            }
            if(chest.getId().equals("chest6")){
                if(check6==0){
                    check6=1;
                    changecoincounter(3);
                    openchest6.setOpacity(1);
                    chest6.setOpacity(0);
                }
            }
            if(chest.getId().equals("chest7")){
                axe.setOpacity(0);
                knife1.setOpacity(1);
                knife2.setOpacity(1);
                knife3.setOpacity(1);
                openchest7.setOpacity(1);
                chest7.setOpacity(0);
            }
            if(chest.getId().equals("chest8")){
                if(check8==0){
                    check8=1;
                    changecoincounter(3);
                    openchest8.setOpacity(1);
                    chest8.setOpacity(0);
                }
            }
        }
    }
    public void orccollisionwithknife(ImageView knife,ImageView orc){
        if(knife.getBoundsInParent().intersects(orc.getBoundsInParent())){
            if(knife.getOpacity()==1) {
                if(orc.getOpacity()==1) {
                    orc.setOpacity(0);
                    changecoincounter(1);
                }

            }
        }
    }
    AnimationTimer orcwithknife=new AnimationTimer() {
        @Override
        public void handle(long l) {
            orccollisionwithknife(knife1,orc1);
            orccollisionwithknife(knife1,orc2);
            orccollisionwithknife(knife1,orc3);
            orccollisionwithknife(knife1,orc4);
            orccollisionwithknife(knife1,orc5);
            orccollisionwithknife(knife1,orc6);
            orccollisionwithknife(knife1,orc7);
            orccollisionwithknife(knife1,orc8);
            orccollisionwithknife(knife1,orc9);
            orccollisionwithknife(knife1,orc10);
            orccollisionwithknife(knife1,orc11);
            orccollisionwithknife(knife1,orc12);
            orccollisionwithknife(knife1,orc13);
            orccollisionwithknife(knife1,orc14);
            orccollisionwithknife(knife1,orc15);
            orccollisionwithknife(knife1,orc16);
            orccollisionwithknife(knife1,orc17);
            orccollisionwithknife(knife1,orc18);
            orccollisionwithknife(knife1,orc19);
            orccollisionwithknife(knife1,orc20);
            orccollisionwithknife(knife1,orc21);
            orccollisionwithknife(knife1,orc22);
            orccollisionwithknife(knife2,orc1);
            orccollisionwithknife(knife2,orc2);
            orccollisionwithknife(knife2,orc3);
            orccollisionwithknife(knife2,orc4);
            orccollisionwithknife(knife2,orc5);
            orccollisionwithknife(knife2,orc6);
            orccollisionwithknife(knife2,orc7);
            orccollisionwithknife(knife2,orc8);
            orccollisionwithknife(knife2,orc9);
            orccollisionwithknife(knife2,orc10);
            orccollisionwithknife(knife2,orc11);
            orccollisionwithknife(knife2,orc12);
            orccollisionwithknife(knife2,orc13);
            orccollisionwithknife(knife2,orc14);
            orccollisionwithknife(knife2,orc15);
            orccollisionwithknife(knife2,orc16);
            orccollisionwithknife(knife2,orc17);
            orccollisionwithknife(knife2,orc18);
            orccollisionwithknife(knife2,orc19);
            orccollisionwithknife(knife2,orc20);
            orccollisionwithknife(knife2,orc21);
            orccollisionwithknife(knife2,orc22);
            orccollisionwithknife(knife3,orc1);
            orccollisionwithknife(knife3,orc2);
            orccollisionwithknife(knife3,orc3);
            orccollisionwithknife(knife3,orc4);
            orccollisionwithknife(knife3,orc5);
            orccollisionwithknife(knife3,orc6);
            orccollisionwithknife(knife3,orc7);
            orccollisionwithknife(knife3,orc8);
            orccollisionwithknife(knife3,orc9);
            orccollisionwithknife(knife3,orc10);
            orccollisionwithknife(knife3,orc11);
            orccollisionwithknife(knife3,orc12);
            orccollisionwithknife(knife3,orc13);
            orccollisionwithknife(knife3,orc14);
            orccollisionwithknife(knife3,orc15);
            orccollisionwithknife(knife3,orc16);
            orccollisionwithknife(knife3,orc17);
            orccollisionwithknife(knife3,orc18);
            orccollisionwithknife(knife3,orc19);
            orccollisionwithknife(knife3,orc20);
            orccollisionwithknife(knife3,orc21);
            orccollisionwithknife(knife3,orc22);


        }
    };
    AnimationTimer orc1withplatform=new AnimationTimer() {
        @Override
        public void handle(long l) {
            orcCollisionwithplatform(orc1,platform1);
            orcCollisionwithplatform(orc1,platform2);
            orcCollisionwithplatform(orc1,platform3);
            orcCollisionwithplatform(orc1,platform4);
            orcCollisionwithplatform(orc1,platform5);
            orcCollisionwithplatform(orc1,platform6);
            orcCollisionwithplatform(orc1,platform7);
            orcCollisionwithplatform(orc1,platform8);
            orcCollisionwithplatform(orc1,platform9);
            orcCollisionwithplatform(orc1,platform10);
            orcCollisionwithplatform(orc1,platform11);
            orcCollisionwithplatform(orc1,platform12);
            orcCollisionwithplatform(orc1,platform13);
            orcCollisionwithplatform(orc1,platform14);
            orcCollisionwithplatform(orc1,platform15);
            orcCollisionwithplatform(orc1,platform16);
            orcCollisionwithplatform(orc1,platform17);
            orcCollisionwithplatform(orc1,platform18);
            orcCollisionwithplatform(orc1,platform19);
            orcCollisionwithplatform(orc1,platform20);
            orcCollisionwithplatform(orc1,platform21);
            orcCollisionwithplatform(orc1,platform22);
            orcCollisionwithplatform(orc1,platform23);
            orcCollisionwithplatform(orc1,platform24);
            orcCollisionwithplatform(orc1,platform25);
            orcCollisionwithplatform(orc1,platform26);
            orcCollisionwithplatform(orc1,platform27);
            orcCollisionwithplatform(orc1,platform28);
            orcCollisionwithplatform(orc1,platform29);
            orcCollisionwithplatform(orc1,platform30);
            orcCollisionwithplatform(orc1,platform31);
            orcCollisionwithplatform(orc1,platform32);
            orcCollisionwithplatform(orc1,platform33);
            orcCollisionwithplatform(orc1,platform34);
            orcCollisionwithplatform(orc1,platform35);
            orcCollisionwithplatform(orc1,platform36);
            orcCollisionwithplatform(orc1,platform37);
            orcCollisionwithplatform(orc1,platform38);
            orcCollisionwithplatform(orc1,platform39);
            orcCollisionwithplatform(orc1,platform40);
            orcCollisionwithplatform(orc1,platform41);
            orcCollisionwithplatform(orc1,platform42);
            orcCollisionwithplatform(orc1,platform43);
            orcCollisionwithplatform(orc1,platform44);
            orcCollisionwithplatform(orc1,platform45);
            orcCollisionwithplatform(orc1,platform46);
            orcCollisionwithplatform(orc1,platform47);
            orcCollisionwithplatform(orc1,platform48);
            orcCollisionwithplatform(orc1,platform49);
            orcCollisionwithplatform(orc1,platform50);
            orcCollisionwithplatform(orc1,platform51);
            orcCollisionwithplatform(orc1,platform52);
            orcCollisionwithplatform(orc1,platform53);


        }
    };
    AnimationTimer orc2withplatform=new AnimationTimer() {
        @Override
        public void handle(long l) {
            orcCollisionwithplatform(orc2,platform1);
            orcCollisionwithplatform(orc2,platform2);
            orcCollisionwithplatform(orc2,platform3);
            orcCollisionwithplatform(orc2,platform4);
            orcCollisionwithplatform(orc2,platform5);
            orcCollisionwithplatform(orc2,platform6);
            orcCollisionwithplatform(orc2,platform7);
            orcCollisionwithplatform(orc2,platform8);
            orcCollisionwithplatform(orc2,platform9);
            orcCollisionwithplatform(orc2,platform10);
            orcCollisionwithplatform(orc2,platform11);
            orcCollisionwithplatform(orc2,platform12);
            orcCollisionwithplatform(orc2,platform13);
            orcCollisionwithplatform(orc2,platform14);
            orcCollisionwithplatform(orc2,platform15);
            orcCollisionwithplatform(orc2,platform16);
            orcCollisionwithplatform(orc2,platform17);
            orcCollisionwithplatform(orc2,platform18);
            orcCollisionwithplatform(orc2,platform19);
            orcCollisionwithplatform(orc2,platform20);
            orcCollisionwithplatform(orc2,platform21);
            orcCollisionwithplatform(orc2,platform22);
            orcCollisionwithplatform(orc2,platform23);
            orcCollisionwithplatform(orc2,platform24);
            orcCollisionwithplatform(orc2,platform25);
            orcCollisionwithplatform(orc2,platform26);
            orcCollisionwithplatform(orc2,platform27);
            orcCollisionwithplatform(orc2,platform28);
            orcCollisionwithplatform(orc2,platform29);
            orcCollisionwithplatform(orc2,platform30);
            orcCollisionwithplatform(orc2,platform31);
            orcCollisionwithplatform(orc2,platform32);
            orcCollisionwithplatform(orc2,platform33);
            orcCollisionwithplatform(orc2,platform34);
            orcCollisionwithplatform(orc2,platform35);
            orcCollisionwithplatform(orc2,platform36);
            orcCollisionwithplatform(orc2,platform37);
            orcCollisionwithplatform(orc2,platform38);
            orcCollisionwithplatform(orc2,platform39);
            orcCollisionwithplatform(orc2,platform40);
            orcCollisionwithplatform(orc2,platform41);
            orcCollisionwithplatform(orc2,platform42);
            orcCollisionwithplatform(orc2,platform43);
            orcCollisionwithplatform(orc2,platform44);
            orcCollisionwithplatform(orc2,platform45);
            orcCollisionwithplatform(orc2,platform46);
            orcCollisionwithplatform(orc2,platform47);
            orcCollisionwithplatform(orc2,platform48);
            orcCollisionwithplatform(orc2,platform49);
            orcCollisionwithplatform(orc2,platform50);
            orcCollisionwithplatform(orc2,platform51);
            orcCollisionwithplatform(orc2,platform52);
            orcCollisionwithplatform(orc2,platform53);


        }
    };
    AnimationTimer orc3withplatform=new AnimationTimer() {
        @Override
        public void handle(long l) {
            orcCollisionwithplatform(orc3,platform1);
            orcCollisionwithplatform(orc3,platform2);
            orcCollisionwithplatform(orc3,platform3);
            orcCollisionwithplatform(orc3,platform4);
            orcCollisionwithplatform(orc3,platform5);
            orcCollisionwithplatform(orc3,platform6);
            orcCollisionwithplatform(orc3,platform7);
            orcCollisionwithplatform(orc3,platform8);
            orcCollisionwithplatform(orc3,platform9);
            orcCollisionwithplatform(orc3,platform10);
            orcCollisionwithplatform(orc3,platform11);
            orcCollisionwithplatform(orc3,platform12);
            orcCollisionwithplatform(orc3,platform13);
            orcCollisionwithplatform(orc3,platform14);
            orcCollisionwithplatform(orc3,platform15);
            orcCollisionwithplatform(orc3,platform16);
            orcCollisionwithplatform(orc3,platform17);
            orcCollisionwithplatform(orc3,platform18);
            orcCollisionwithplatform(orc3,platform19);
            orcCollisionwithplatform(orc3,platform20);
            orcCollisionwithplatform(orc3,platform21);
            orcCollisionwithplatform(orc3,platform22);
            orcCollisionwithplatform(orc3,platform23);
            orcCollisionwithplatform(orc3,platform24);
            orcCollisionwithplatform(orc3,platform25);
            orcCollisionwithplatform(orc3,platform26);
            orcCollisionwithplatform(orc3,platform27);
            orcCollisionwithplatform(orc3,platform28);
            orcCollisionwithplatform(orc3,platform29);
            orcCollisionwithplatform(orc3,platform30);
            orcCollisionwithplatform(orc3,platform31);
            orcCollisionwithplatform(orc3,platform32);
            orcCollisionwithplatform(orc3,platform33);
            orcCollisionwithplatform(orc3,platform34);
            orcCollisionwithplatform(orc3,platform35);
            orcCollisionwithplatform(orc3,platform36);
            orcCollisionwithplatform(orc3,platform37);
            orcCollisionwithplatform(orc3,platform38);
            orcCollisionwithplatform(orc3,platform39);
            orcCollisionwithplatform(orc3,platform40);
            orcCollisionwithplatform(orc3,platform41);
            orcCollisionwithplatform(orc3,platform42);
            orcCollisionwithplatform(orc3,platform43);
            orcCollisionwithplatform(orc3,platform44);
            orcCollisionwithplatform(orc3,platform45);
            orcCollisionwithplatform(orc3,platform46);
            orcCollisionwithplatform(orc3,platform47);
            orcCollisionwithplatform(orc3,platform48);
            orcCollisionwithplatform(orc3,platform49);
            orcCollisionwithplatform(orc3,platform50);
            orcCollisionwithplatform(orc3,platform51);
            orcCollisionwithplatform(orc3,platform52);
            orcCollisionwithplatform(orc3,platform53);


        }
    };
    AnimationTimer orc4withplatform=new AnimationTimer() {
        @Override
        public void handle(long l) {
            orcCollisionwithplatform(orc4,platform1);
            orcCollisionwithplatform(orc4,platform2);
            orcCollisionwithplatform(orc4,platform3);
            orcCollisionwithplatform(orc4,platform4);
            orcCollisionwithplatform(orc4,platform5);
            orcCollisionwithplatform(orc4,platform6);
            orcCollisionwithplatform(orc4,platform7);
            orcCollisionwithplatform(orc4,platform8);
            orcCollisionwithplatform(orc4,platform9);
            orcCollisionwithplatform(orc4,platform10);
            orcCollisionwithplatform(orc4,platform11);
            orcCollisionwithplatform(orc4,platform12);
            orcCollisionwithplatform(orc4,platform13);
            orcCollisionwithplatform(orc4,platform14);
            orcCollisionwithplatform(orc4,platform15);
            orcCollisionwithplatform(orc4,platform16);
            orcCollisionwithplatform(orc4,platform17);
            orcCollisionwithplatform(orc4,platform18);
            orcCollisionwithplatform(orc4,platform19);
            orcCollisionwithplatform(orc4,platform20);
            orcCollisionwithplatform(orc4,platform21);
            orcCollisionwithplatform(orc4,platform22);
            orcCollisionwithplatform(orc4,platform23);
            orcCollisionwithplatform(orc4,platform24);
            orcCollisionwithplatform(orc4,platform25);
            orcCollisionwithplatform(orc4,platform26);
            orcCollisionwithplatform(orc4,platform27);
            orcCollisionwithplatform(orc4,platform28);
            orcCollisionwithplatform(orc4,platform29);
            orcCollisionwithplatform(orc4,platform30);
            orcCollisionwithplatform(orc4,platform31);
            orcCollisionwithplatform(orc4,platform32);
            orcCollisionwithplatform(orc4,platform33);
            orcCollisionwithplatform(orc4,platform34);
            orcCollisionwithplatform(orc4,platform35);
            orcCollisionwithplatform(orc4,platform36);
            orcCollisionwithplatform(orc4,platform37);
            orcCollisionwithplatform(orc4,platform38);
            orcCollisionwithplatform(orc4,platform39);
            orcCollisionwithplatform(orc4,platform40);
            orcCollisionwithplatform(orc4,platform41);
            orcCollisionwithplatform(orc4,platform42);
            orcCollisionwithplatform(orc4,platform43);
            orcCollisionwithplatform(orc4,platform44);
            orcCollisionwithplatform(orc4,platform45);
            orcCollisionwithplatform(orc4,platform46);
            orcCollisionwithplatform(orc4,platform47);
            orcCollisionwithplatform(orc4,platform48);
            orcCollisionwithplatform(orc4,platform49);
            orcCollisionwithplatform(orc4,platform50);
            orcCollisionwithplatform(orc4,platform51);
            orcCollisionwithplatform(orc4,platform52);
            orcCollisionwithplatform(orc4,platform53);
        }
    };
    AnimationTimer orc5withplatform=new AnimationTimer() {
        @Override
        public void handle(long l) {
            orcCollisionwithplatform(orc5,platform1);
            orcCollisionwithplatform(orc5,platform2);
            orcCollisionwithplatform(orc5,platform3);
            orcCollisionwithplatform(orc5,platform4);
            orcCollisionwithplatform(orc5,platform5);
            orcCollisionwithplatform(orc5,platform6);
            orcCollisionwithplatform(orc5,platform7);
            orcCollisionwithplatform(orc5,platform8);
            orcCollisionwithplatform(orc5,platform9);
            orcCollisionwithplatform(orc5,platform10);
            orcCollisionwithplatform(orc5,platform11);
            orcCollisionwithplatform(orc5,platform12);
            orcCollisionwithplatform(orc5,platform13);
            orcCollisionwithplatform(orc5,platform14);
            orcCollisionwithplatform(orc5,platform15);
            orcCollisionwithplatform(orc5,platform16);
            orcCollisionwithplatform(orc5,platform17);
            orcCollisionwithplatform(orc5,platform18);
            orcCollisionwithplatform(orc5,platform19);
            orcCollisionwithplatform(orc5,platform20);
            orcCollisionwithplatform(orc5,platform21);
            orcCollisionwithplatform(orc5,platform22);
            orcCollisionwithplatform(orc5,platform23);
            orcCollisionwithplatform(orc5,platform24);
            orcCollisionwithplatform(orc5,platform25);
            orcCollisionwithplatform(orc5,platform26);
            orcCollisionwithplatform(orc5,platform27);
            orcCollisionwithplatform(orc5,platform28);
            orcCollisionwithplatform(orc5,platform29);
            orcCollisionwithplatform(orc5,platform30);
            orcCollisionwithplatform(orc5,platform31);
            orcCollisionwithplatform(orc5,platform32);
            orcCollisionwithplatform(orc5,platform33);
            orcCollisionwithplatform(orc5,platform34);
            orcCollisionwithplatform(orc5,platform35);
            orcCollisionwithplatform(orc5,platform36);
            orcCollisionwithplatform(orc5,platform37);
            orcCollisionwithplatform(orc5,platform38);
            orcCollisionwithplatform(orc5,platform39);
            orcCollisionwithplatform(orc5,platform40);
            orcCollisionwithplatform(orc5,platform41);
            orcCollisionwithplatform(orc5,platform42);
            orcCollisionwithplatform(orc5,platform43);
            orcCollisionwithplatform(orc5,platform44);
            orcCollisionwithplatform(orc5,platform45);
            orcCollisionwithplatform(orc5,platform46);
            orcCollisionwithplatform(orc5,platform47);
            orcCollisionwithplatform(orc5,platform48);
            orcCollisionwithplatform(orc5,platform49);
            orcCollisionwithplatform(orc5,platform50);
            orcCollisionwithplatform(orc5,platform51);
            orcCollisionwithplatform(orc5,platform52);
            orcCollisionwithplatform(orc5,platform53);
        }
    };
    AnimationTimer orc6withplatform=new AnimationTimer() {
        @Override
        public void handle(long l) {
            orcCollisionwithplatform(orc6,platform1);
            orcCollisionwithplatform(orc6,platform2);
            orcCollisionwithplatform(orc6,platform3);
            orcCollisionwithplatform(orc6,platform4);
            orcCollisionwithplatform(orc6,platform5);
            orcCollisionwithplatform(orc6,platform6);
            orcCollisionwithplatform(orc6,platform7);
            orcCollisionwithplatform(orc6,platform8);
            orcCollisionwithplatform(orc6,platform9);
            orcCollisionwithplatform(orc6,platform10);
            orcCollisionwithplatform(orc6,platform11);
            orcCollisionwithplatform(orc6,platform12);
            orcCollisionwithplatform(orc6,platform13);
            orcCollisionwithplatform(orc6,platform14);
            orcCollisionwithplatform(orc6,platform15);
            orcCollisionwithplatform(orc6,platform16);
            orcCollisionwithplatform(orc6,platform17);
            orcCollisionwithplatform(orc6,platform18);
            orcCollisionwithplatform(orc6,platform19);
            orcCollisionwithplatform(orc6,platform20);
            orcCollisionwithplatform(orc6,platform21);
            orcCollisionwithplatform(orc6,platform22);
            orcCollisionwithplatform(orc6,platform23);
            orcCollisionwithplatform(orc6,platform24);
            orcCollisionwithplatform(orc6,platform25);
            orcCollisionwithplatform(orc6,platform26);
            orcCollisionwithplatform(orc6,platform27);
            orcCollisionwithplatform(orc6,platform28);
            orcCollisionwithplatform(orc6,platform29);
            orcCollisionwithplatform(orc6,platform30);
            orcCollisionwithplatform(orc6,platform31);
            orcCollisionwithplatform(orc6,platform32);
            orcCollisionwithplatform(orc6,platform33);
            orcCollisionwithplatform(orc6,platform34);
            orcCollisionwithplatform(orc6,platform35);
            orcCollisionwithplatform(orc6,platform36);
            orcCollisionwithplatform(orc6,platform37);
            orcCollisionwithplatform(orc6,platform38);
            orcCollisionwithplatform(orc6,platform39);
            orcCollisionwithplatform(orc6,platform40);
            orcCollisionwithplatform(orc6,platform41);
            orcCollisionwithplatform(orc6,platform42);
            orcCollisionwithplatform(orc6,platform43);
            orcCollisionwithplatform(orc6,platform44);
            orcCollisionwithplatform(orc6,platform45);
            orcCollisionwithplatform(orc6,platform46);
            orcCollisionwithplatform(orc6,platform47);
            orcCollisionwithplatform(orc6,platform48);
            orcCollisionwithplatform(orc6,platform49);
            orcCollisionwithplatform(orc6,platform50);
            orcCollisionwithplatform(orc6,platform51);
            orcCollisionwithplatform(orc6,platform52);
            orcCollisionwithplatform(orc6,platform53);
        }
    };
    AnimationTimer orc7withplatform=new AnimationTimer() {
        @Override
        public void handle(long l) {
            orcCollisionwithplatform(orc7,platform1);
            orcCollisionwithplatform(orc7,platform2);
            orcCollisionwithplatform(orc7,platform3);
            orcCollisionwithplatform(orc7,platform4);
            orcCollisionwithplatform(orc7,platform5);
            orcCollisionwithplatform(orc7,platform6);
            orcCollisionwithplatform(orc7,platform7);
            orcCollisionwithplatform(orc7,platform8);
            orcCollisionwithplatform(orc7,platform9);
            orcCollisionwithplatform(orc7,platform10);
            orcCollisionwithplatform(orc7,platform11);
            orcCollisionwithplatform(orc7,platform12);
            orcCollisionwithplatform(orc7,platform13);
            orcCollisionwithplatform(orc7,platform14);
            orcCollisionwithplatform(orc7,platform15);
            orcCollisionwithplatform(orc7,platform16);
            orcCollisionwithplatform(orc7,platform17);
            orcCollisionwithplatform(orc7,platform18);
            orcCollisionwithplatform(orc7,platform19);
            orcCollisionwithplatform(orc7,platform20);
            orcCollisionwithplatform(orc7,platform21);
            orcCollisionwithplatform(orc7,platform22);
            orcCollisionwithplatform(orc7,platform23);
            orcCollisionwithplatform(orc7,platform24);
            orcCollisionwithplatform(orc7,platform25);
            orcCollisionwithplatform(orc7,platform26);
            orcCollisionwithplatform(orc7,platform27);
            orcCollisionwithplatform(orc7,platform28);
            orcCollisionwithplatform(orc7,platform29);
            orcCollisionwithplatform(orc7,platform30);
            orcCollisionwithplatform(orc7,platform31);
            orcCollisionwithplatform(orc7,platform32);
            orcCollisionwithplatform(orc7,platform33);
            orcCollisionwithplatform(orc7,platform34);
            orcCollisionwithplatform(orc7,platform35);
            orcCollisionwithplatform(orc7,platform36);
            orcCollisionwithplatform(orc7,platform37);
            orcCollisionwithplatform(orc7,platform38);
            orcCollisionwithplatform(orc7,platform39);
            orcCollisionwithplatform(orc7,platform40);
            orcCollisionwithplatform(orc7,platform41);
            orcCollisionwithplatform(orc7,platform42);
            orcCollisionwithplatform(orc7,platform43);
            orcCollisionwithplatform(orc7,platform44);
            orcCollisionwithplatform(orc7,platform45);
            orcCollisionwithplatform(orc7,platform46);
            orcCollisionwithplatform(orc7,platform47);
            orcCollisionwithplatform(orc7,platform48);
            orcCollisionwithplatform(orc7,platform49);
            orcCollisionwithplatform(orc7,platform50);
            orcCollisionwithplatform(orc7,platform51);
            orcCollisionwithplatform(orc7,platform52);
            orcCollisionwithplatform(orc7,platform53);
        }
    };
    AnimationTimer orc8withplatform=new AnimationTimer() {
        @Override
        public void handle(long l) {
            orcCollisionwithplatform(orc8,platform1);
            orcCollisionwithplatform(orc8,platform2);
            orcCollisionwithplatform(orc8,platform3);
            orcCollisionwithplatform(orc8,platform4);
            orcCollisionwithplatform(orc8,platform5);
            orcCollisionwithplatform(orc8,platform6);
            orcCollisionwithplatform(orc8,platform7);
            orcCollisionwithplatform(orc8,platform8);
            orcCollisionwithplatform(orc8,platform9);
            orcCollisionwithplatform(orc8,platform10);
            orcCollisionwithplatform(orc8,platform11);
            orcCollisionwithplatform(orc8,platform12);
            orcCollisionwithplatform(orc8,platform13);
            orcCollisionwithplatform(orc8,platform14);
            orcCollisionwithplatform(orc8,platform15);
            orcCollisionwithplatform(orc8,platform16);
            orcCollisionwithplatform(orc8,platform17);
            orcCollisionwithplatform(orc8,platform18);
            orcCollisionwithplatform(orc8,platform19);
            orcCollisionwithplatform(orc8,platform20);
            orcCollisionwithplatform(orc8,platform21);
            orcCollisionwithplatform(orc8,platform22);
            orcCollisionwithplatform(orc8,platform23);
            orcCollisionwithplatform(orc8,platform24);
            orcCollisionwithplatform(orc8,platform25);
            orcCollisionwithplatform(orc8,platform26);
            orcCollisionwithplatform(orc8,platform27);
            orcCollisionwithplatform(orc8,platform28);
            orcCollisionwithplatform(orc8,platform29);
            orcCollisionwithplatform(orc8,platform30);
            orcCollisionwithplatform(orc8,platform31);
            orcCollisionwithplatform(orc8,platform32);
            orcCollisionwithplatform(orc8,platform33);
            orcCollisionwithplatform(orc8,platform34);
            orcCollisionwithplatform(orc8,platform35);
            orcCollisionwithplatform(orc8,platform36);
            orcCollisionwithplatform(orc8,platform37);
            orcCollisionwithplatform(orc8,platform38);
            orcCollisionwithplatform(orc8,platform39);
            orcCollisionwithplatform(orc8,platform40);
            orcCollisionwithplatform(orc8,platform41);
            orcCollisionwithplatform(orc8,platform42);
            orcCollisionwithplatform(orc8,platform43);
            orcCollisionwithplatform(orc8,platform44);
            orcCollisionwithplatform(orc8,platform45);
            orcCollisionwithplatform(orc8,platform46);
            orcCollisionwithplatform(orc8,platform47);
            orcCollisionwithplatform(orc8,platform48);
            orcCollisionwithplatform(orc8,platform49);
            orcCollisionwithplatform(orc8,platform50);
            orcCollisionwithplatform(orc8,platform51);
            orcCollisionwithplatform(orc8,platform52);
            orcCollisionwithplatform(orc8,platform53);
            orcCollisionwithplatform(orc8,b1);
            orcCollisionwithplatform(orc8,b2);
            orcCollisionwithplatform(orc8,b3);
            orcCollisionwithplatform(orc8,b4);
            orcCollisionwithplatform(orc8,b5);
            orcCollisionwithplatform(orc8,b6);
            orcCollisionwithplatform(orc8,b7);
            orcCollisionwithplatform(orc8,b8);
            orcCollisionwithplatform(orc8,b9);
            orcCollisionwithplatform(orc8,b10);
            orcCollisionwithplatform(orc8,b11);
            orcCollisionwithplatform(orc8,b12);

        }
    };
    AnimationTimer orc9withplatform=new AnimationTimer() {
        @Override
        public void handle(long l) {
            orcCollisionwithplatform(orc9,platform1);
            orcCollisionwithplatform(orc9,platform2);
            orcCollisionwithplatform(orc9,platform3);
            orcCollisionwithplatform(orc9,platform4);
            orcCollisionwithplatform(orc9,platform5);
            orcCollisionwithplatform(orc9,platform6);
            orcCollisionwithplatform(orc9,platform7);
            orcCollisionwithplatform(orc9,platform8);
            orcCollisionwithplatform(orc9,platform9);
            orcCollisionwithplatform(orc9,platform10);
            orcCollisionwithplatform(orc9,platform11);
            orcCollisionwithplatform(orc9,platform12);
            orcCollisionwithplatform(orc9,platform13);
            orcCollisionwithplatform(orc9,platform14);
            orcCollisionwithplatform(orc9,platform15);
            orcCollisionwithplatform(orc9,platform16);
            orcCollisionwithplatform(orc9,platform17);
            orcCollisionwithplatform(orc9,platform18);
            orcCollisionwithplatform(orc9,platform19);
            orcCollisionwithplatform(orc9,platform20);
            orcCollisionwithplatform(orc9,platform21);
            orcCollisionwithplatform(orc9,platform22);
            orcCollisionwithplatform(orc9,platform23);
            orcCollisionwithplatform(orc9,platform24);
            orcCollisionwithplatform(orc9,platform25);
            orcCollisionwithplatform(orc9,platform26);
            orcCollisionwithplatform(orc9,platform27);
            orcCollisionwithplatform(orc9,platform28);
            orcCollisionwithplatform(orc9,platform29);
            orcCollisionwithplatform(orc9,platform30);
            orcCollisionwithplatform(orc9,platform31);
            orcCollisionwithplatform(orc9,platform32);
            orcCollisionwithplatform(orc9,platform33);
            orcCollisionwithplatform(orc9,platform34);
            orcCollisionwithplatform(orc9,platform35);
            orcCollisionwithplatform(orc9,platform36);
            orcCollisionwithplatform(orc9,platform37);
            orcCollisionwithplatform(orc9,platform38);
            orcCollisionwithplatform(orc9,platform39);
            orcCollisionwithplatform(orc9,platform40);
            orcCollisionwithplatform(orc9,platform41);
            orcCollisionwithplatform(orc9,platform42);
            orcCollisionwithplatform(orc9,platform43);
            orcCollisionwithplatform(orc9,platform44);
            orcCollisionwithplatform(orc9,platform45);
            orcCollisionwithplatform(orc9,platform46);
            orcCollisionwithplatform(orc9,platform47);
            orcCollisionwithplatform(orc9,platform48);
            orcCollisionwithplatform(orc9,platform49);
            orcCollisionwithplatform(orc9,platform50);
            orcCollisionwithplatform(orc9,platform51);
            orcCollisionwithplatform(orc9,platform52);
            orcCollisionwithplatform(orc9,platform53);
        }
    };
    AnimationTimer orc10withplatform=new AnimationTimer() {
        @Override
        public void handle(long l) {
            orcCollisionwithplatform(orc10,platform1);
            orcCollisionwithplatform(orc10,platform2);
            orcCollisionwithplatform(orc10,platform3);
            orcCollisionwithplatform(orc10,platform4);
            orcCollisionwithplatform(orc10,platform5);
            orcCollisionwithplatform(orc10,platform6);
            orcCollisionwithplatform(orc10,platform7);
            orcCollisionwithplatform(orc10,platform8);
            orcCollisionwithplatform(orc10,platform9);
            orcCollisionwithplatform(orc10,platform10);
            orcCollisionwithplatform(orc10,platform11);
            orcCollisionwithplatform(orc10,platform12);
            orcCollisionwithplatform(orc10,platform13);
            orcCollisionwithplatform(orc10,platform14);
            orcCollisionwithplatform(orc10,platform15);
            orcCollisionwithplatform(orc10,platform16);
            orcCollisionwithplatform(orc10,platform17);
            orcCollisionwithplatform(orc10,platform18);
            orcCollisionwithplatform(orc10,platform19);
            orcCollisionwithplatform(orc10,platform20);
            orcCollisionwithplatform(orc10,platform21);
            orcCollisionwithplatform(orc10,platform22);
            orcCollisionwithplatform(orc10,platform23);
            orcCollisionwithplatform(orc10,platform24);
            orcCollisionwithplatform(orc10,platform25);
            orcCollisionwithplatform(orc10,platform26);
            orcCollisionwithplatform(orc10,platform27);
            orcCollisionwithplatform(orc10,platform28);
            orcCollisionwithplatform(orc10,platform29);
            orcCollisionwithplatform(orc10,platform30);
            orcCollisionwithplatform(orc10,platform31);
            orcCollisionwithplatform(orc10,platform32);
            orcCollisionwithplatform(orc10,platform33);
            orcCollisionwithplatform(orc10,platform34);
            orcCollisionwithplatform(orc10,platform35);
            orcCollisionwithplatform(orc10,platform36);
            orcCollisionwithplatform(orc10,platform37);
            orcCollisionwithplatform(orc10,platform38);
            orcCollisionwithplatform(orc10,platform39);
            orcCollisionwithplatform(orc10,platform40);
            orcCollisionwithplatform(orc10,platform41);
            orcCollisionwithplatform(orc10,platform42);
            orcCollisionwithplatform(orc10,platform43);
            orcCollisionwithplatform(orc10,platform44);
            orcCollisionwithplatform(orc10,platform45);
            orcCollisionwithplatform(orc10,platform46);
            orcCollisionwithplatform(orc10,platform47);
            orcCollisionwithplatform(orc10,platform48);
            orcCollisionwithplatform(orc10,platform49);
            orcCollisionwithplatform(orc10,platform50);
            orcCollisionwithplatform(orc10,platform51);
            orcCollisionwithplatform(orc10,platform52);
            orcCollisionwithplatform(orc10,platform53);
        }
    };
    AnimationTimer orc11withplatform=new AnimationTimer() {
        @Override
        public void handle(long l) {
            orcCollisionwithplatform(orc11,platform1);
            orcCollisionwithplatform(orc11,platform2);
            orcCollisionwithplatform(orc11,platform3);
            orcCollisionwithplatform(orc11,platform4);
            orcCollisionwithplatform(orc11,platform5);
            orcCollisionwithplatform(orc11,platform6);
            orcCollisionwithplatform(orc11,platform7);
            orcCollisionwithplatform(orc11,platform8);
            orcCollisionwithplatform(orc11,platform9);
            orcCollisionwithplatform(orc11,platform10);
            orcCollisionwithplatform(orc11,platform11);
            orcCollisionwithplatform(orc11,platform12);
            orcCollisionwithplatform(orc11,platform13);
            orcCollisionwithplatform(orc11,platform14);
            orcCollisionwithplatform(orc11,platform15);
            orcCollisionwithplatform(orc11,platform16);
            orcCollisionwithplatform(orc11,platform17);
            orcCollisionwithplatform(orc11,platform18);
            orcCollisionwithplatform(orc11,platform19);
            orcCollisionwithplatform(orc11,platform20);
            orcCollisionwithplatform(orc11,platform21);
            orcCollisionwithplatform(orc11,platform22);
            orcCollisionwithplatform(orc11,platform23);
            orcCollisionwithplatform(orc11,platform24);
            orcCollisionwithplatform(orc11,platform25);
            orcCollisionwithplatform(orc11,platform26);
            orcCollisionwithplatform(orc11,platform27);
            orcCollisionwithplatform(orc11,platform28);
            orcCollisionwithplatform(orc11,platform29);
            orcCollisionwithplatform(orc11,platform30);
            orcCollisionwithplatform(orc11,platform31);
            orcCollisionwithplatform(orc11,platform32);
            orcCollisionwithplatform(orc11,platform33);
            orcCollisionwithplatform(orc11,platform34);
            orcCollisionwithplatform(orc11,platform35);
            orcCollisionwithplatform(orc11,platform36);
            orcCollisionwithplatform(orc11,platform37);
            orcCollisionwithplatform(orc11,platform38);
            orcCollisionwithplatform(orc11,platform39);
            orcCollisionwithplatform(orc11,platform40);
            orcCollisionwithplatform(orc11,platform41);
            orcCollisionwithplatform(orc11,platform42);
            orcCollisionwithplatform(orc11,platform43);
            orcCollisionwithplatform(orc11,platform44);
            orcCollisionwithplatform(orc11,platform45);
            orcCollisionwithplatform(orc11,platform46);
            orcCollisionwithplatform(orc11,platform47);
            orcCollisionwithplatform(orc11,platform48);
            orcCollisionwithplatform(orc11,platform49);
            orcCollisionwithplatform(orc11,platform50);
            orcCollisionwithplatform(orc11,platform51);
            orcCollisionwithplatform(orc11,platform52);
            orcCollisionwithplatform(orc11,platform53);
        }
    };
    AnimationTimer orc12withplatform=new AnimationTimer() {
        @Override
        public void handle(long l) {
            orcCollisionwithplatform(orc12,platform1);
            orcCollisionwithplatform(orc12,platform2);
            orcCollisionwithplatform(orc12,platform3);
            orcCollisionwithplatform(orc12,platform4);
            orcCollisionwithplatform(orc12,platform5);
            orcCollisionwithplatform(orc12,platform6);
            orcCollisionwithplatform(orc12,platform7);
            orcCollisionwithplatform(orc12,platform8);
            orcCollisionwithplatform(orc12,platform9);
            orcCollisionwithplatform(orc12,platform10);
            orcCollisionwithplatform(orc12,platform11);
            orcCollisionwithplatform(orc12,platform12);
            orcCollisionwithplatform(orc12,platform13);
            orcCollisionwithplatform(orc12,platform14);
            orcCollisionwithplatform(orc12,platform15);
            orcCollisionwithplatform(orc12,platform16);
            orcCollisionwithplatform(orc12,platform17);
            orcCollisionwithplatform(orc12,platform18);
            orcCollisionwithplatform(orc12,platform19);
            orcCollisionwithplatform(orc12,platform20);
            orcCollisionwithplatform(orc12,platform21);
            orcCollisionwithplatform(orc12,platform22);
            orcCollisionwithplatform(orc12,platform23);
            orcCollisionwithplatform(orc12,platform24);
            orcCollisionwithplatform(orc12,platform25);
            orcCollisionwithplatform(orc12,platform26);
            orcCollisionwithplatform(orc12,platform27);
            orcCollisionwithplatform(orc12,platform28);
            orcCollisionwithplatform(orc12,platform29);
            orcCollisionwithplatform(orc12,platform30);
            orcCollisionwithplatform(orc12,platform31);
            orcCollisionwithplatform(orc12,platform32);
            orcCollisionwithplatform(orc12,platform33);
            orcCollisionwithplatform(orc12,platform34);
            orcCollisionwithplatform(orc12,platform35);
            orcCollisionwithplatform(orc12,platform36);
            orcCollisionwithplatform(orc12,platform37);
            orcCollisionwithplatform(orc12,platform38);
            orcCollisionwithplatform(orc12,platform39);
            orcCollisionwithplatform(orc12,platform40);
            orcCollisionwithplatform(orc12,platform41);
            orcCollisionwithplatform(orc12,platform42);
            orcCollisionwithplatform(orc12,platform43);
            orcCollisionwithplatform(orc12,platform44);
            orcCollisionwithplatform(orc12,platform45);
            orcCollisionwithplatform(orc12,platform46);
            orcCollisionwithplatform(orc12,platform47);
            orcCollisionwithplatform(orc12,platform48);
            orcCollisionwithplatform(orc12,platform49);
            orcCollisionwithplatform(orc12,platform50);
            orcCollisionwithplatform(orc12,platform51);
            orcCollisionwithplatform(orc12,platform52);
            orcCollisionwithplatform(orc12,platform53);
        }
    };
    AnimationTimer orc13withplatform=new AnimationTimer() {
        @Override
        public void handle(long l) {
            orcCollisionwithplatform(orc13,platform1);
            orcCollisionwithplatform(orc13,platform2);
            orcCollisionwithplatform(orc13,platform3);
            orcCollisionwithplatform(orc13,platform4);
            orcCollisionwithplatform(orc13,platform5);
            orcCollisionwithplatform(orc13,platform6);
            orcCollisionwithplatform(orc13,platform7);
            orcCollisionwithplatform(orc13,platform8);
            orcCollisionwithplatform(orc13,platform9);
            orcCollisionwithplatform(orc13,platform10);
            orcCollisionwithplatform(orc13,platform11);
            orcCollisionwithplatform(orc13,platform12);
            orcCollisionwithplatform(orc13,platform13);
            orcCollisionwithplatform(orc13,platform14);
            orcCollisionwithplatform(orc13,platform15);
            orcCollisionwithplatform(orc13,platform16);
            orcCollisionwithplatform(orc13,platform17);
            orcCollisionwithplatform(orc13,platform18);
            orcCollisionwithplatform(orc13,platform19);
            orcCollisionwithplatform(orc13,platform20);
            orcCollisionwithplatform(orc13,platform21);
            orcCollisionwithplatform(orc13,platform22);
            orcCollisionwithplatform(orc13,platform23);
            orcCollisionwithplatform(orc13,platform24);
            orcCollisionwithplatform(orc13,platform25);
            orcCollisionwithplatform(orc13,platform26);
            orcCollisionwithplatform(orc13,platform27);
            orcCollisionwithplatform(orc13,platform28);
            orcCollisionwithplatform(orc13,platform29);
            orcCollisionwithplatform(orc13,platform30);
            orcCollisionwithplatform(orc13,platform31);
            orcCollisionwithplatform(orc13,platform32);
            orcCollisionwithplatform(orc13,platform33);
            orcCollisionwithplatform(orc13,platform34);
            orcCollisionwithplatform(orc13,platform35);
            orcCollisionwithplatform(orc13,platform36);
            orcCollisionwithplatform(orc13,platform37);
            orcCollisionwithplatform(orc13,platform38);
            orcCollisionwithplatform(orc13,platform39);
            orcCollisionwithplatform(orc13,platform40);
            orcCollisionwithplatform(orc13,platform41);
            orcCollisionwithplatform(orc13,platform42);
            orcCollisionwithplatform(orc13,platform43);
            orcCollisionwithplatform(orc13,platform44);
            orcCollisionwithplatform(orc13,platform45);
            orcCollisionwithplatform(orc13,platform46);
            orcCollisionwithplatform(orc13,platform47);
            orcCollisionwithplatform(orc13,platform48);
            orcCollisionwithplatform(orc13,platform49);
            orcCollisionwithplatform(orc13,platform50);
            orcCollisionwithplatform(orc13,platform51);
            orcCollisionwithplatform(orc13,platform52);
            orcCollisionwithplatform(orc13,platform53);
        }
    };
    AnimationTimer orc14withplatform=new AnimationTimer() {
        @Override
        public void handle(long l) {
            orcCollisionwithplatform(orc14,platform1);
            orcCollisionwithplatform(orc14,platform2);
            orcCollisionwithplatform(orc14,platform3);
            orcCollisionwithplatform(orc14,platform4);
            orcCollisionwithplatform(orc14,platform5);
            orcCollisionwithplatform(orc14,platform6);
            orcCollisionwithplatform(orc14,platform7);
            orcCollisionwithplatform(orc14,platform8);
            orcCollisionwithplatform(orc14,platform9);
            orcCollisionwithplatform(orc14,platform10);
            orcCollisionwithplatform(orc14,platform11);
            orcCollisionwithplatform(orc14,platform12);
            orcCollisionwithplatform(orc14,platform13);
            orcCollisionwithplatform(orc14,platform14);
            orcCollisionwithplatform(orc14,platform15);
            orcCollisionwithplatform(orc14,platform16);
            orcCollisionwithplatform(orc14,platform17);
            orcCollisionwithplatform(orc14,platform18);
            orcCollisionwithplatform(orc14,platform19);
            orcCollisionwithplatform(orc14,platform20);
            orcCollisionwithplatform(orc14,platform21);
            orcCollisionwithplatform(orc14,platform22);
            orcCollisionwithplatform(orc14,platform23);
            orcCollisionwithplatform(orc14,platform24);
            orcCollisionwithplatform(orc14,platform25);
            orcCollisionwithplatform(orc14,platform26);
            orcCollisionwithplatform(orc14,platform27);
            orcCollisionwithplatform(orc14,platform28);
            orcCollisionwithplatform(orc14,platform29);
            orcCollisionwithplatform(orc14,platform30);
            orcCollisionwithplatform(orc14,platform31);
            orcCollisionwithplatform(orc14,platform32);
            orcCollisionwithplatform(orc14,platform33);
            orcCollisionwithplatform(orc14,platform34);
            orcCollisionwithplatform(orc14,platform35);
            orcCollisionwithplatform(orc14,platform36);
            orcCollisionwithplatform(orc14,platform37);
            orcCollisionwithplatform(orc14,platform38);
            orcCollisionwithplatform(orc14,platform39);
            orcCollisionwithplatform(orc14,platform40);
            orcCollisionwithplatform(orc14,platform41);
            orcCollisionwithplatform(orc14,platform42);
            orcCollisionwithplatform(orc14,platform43);
            orcCollisionwithplatform(orc14,platform44);
            orcCollisionwithplatform(orc14,platform45);
            orcCollisionwithplatform(orc14,platform46);
            orcCollisionwithplatform(orc14,platform47);
            orcCollisionwithplatform(orc14,platform48);
            orcCollisionwithplatform(orc14,platform49);
            orcCollisionwithplatform(orc14,platform50);
            orcCollisionwithplatform(orc14,platform51);
            orcCollisionwithplatform(orc14,platform52);
            orcCollisionwithplatform(orc14,platform53);
        }
    };
    AnimationTimer orc15withplatform=new AnimationTimer() {
        @Override
        public void handle(long l) {
            orcCollisionwithplatform(orc15,platform1);
            orcCollisionwithplatform(orc15,platform2);
            orcCollisionwithplatform(orc15,platform3);
            orcCollisionwithplatform(orc15,platform4);
            orcCollisionwithplatform(orc15,platform5);
            orcCollisionwithplatform(orc15,platform6);
            orcCollisionwithplatform(orc15,platform7);
            orcCollisionwithplatform(orc15,platform8);
            orcCollisionwithplatform(orc15,platform9);
            orcCollisionwithplatform(orc15,platform10);
            orcCollisionwithplatform(orc15,platform11);
            orcCollisionwithplatform(orc15,platform12);
            orcCollisionwithplatform(orc15,platform13);
            orcCollisionwithplatform(orc15,platform14);
            orcCollisionwithplatform(orc15,platform15);
            orcCollisionwithplatform(orc15,platform16);
            orcCollisionwithplatform(orc15,platform17);
            orcCollisionwithplatform(orc15,platform18);
            orcCollisionwithplatform(orc15,platform19);
            orcCollisionwithplatform(orc15,platform20);
            orcCollisionwithplatform(orc15,platform21);
            orcCollisionwithplatform(orc15,platform22);
            orcCollisionwithplatform(orc15,platform23);
            orcCollisionwithplatform(orc15,platform24);
            orcCollisionwithplatform(orc15,platform25);
            orcCollisionwithplatform(orc15,platform26);
            orcCollisionwithplatform(orc15,platform27);
            orcCollisionwithplatform(orc15,platform28);
            orcCollisionwithplatform(orc15,platform29);
            orcCollisionwithplatform(orc15,platform30);
            orcCollisionwithplatform(orc15,platform31);
            orcCollisionwithplatform(orc15,platform32);
            orcCollisionwithplatform(orc15,platform33);
            orcCollisionwithplatform(orc15,platform34);
            orcCollisionwithplatform(orc15,platform35);
            orcCollisionwithplatform(orc15,platform36);
            orcCollisionwithplatform(orc15,platform37);
            orcCollisionwithplatform(orc15,platform38);
            orcCollisionwithplatform(orc15,platform39);
            orcCollisionwithplatform(orc15,platform40);
            orcCollisionwithplatform(orc15,platform41);
            orcCollisionwithplatform(orc15,platform42);
            orcCollisionwithplatform(orc15,platform43);
            orcCollisionwithplatform(orc15,platform44);
            orcCollisionwithplatform(orc15,platform45);
            orcCollisionwithplatform(orc15,platform46);
            orcCollisionwithplatform(orc15,platform47);
            orcCollisionwithplatform(orc15,platform48);
            orcCollisionwithplatform(orc15,platform49);
            orcCollisionwithplatform(orc15,platform50);
            orcCollisionwithplatform(orc15,platform51);
            orcCollisionwithplatform(orc15,platform52);
            orcCollisionwithplatform(orc15,platform53);
        }
    };
    AnimationTimer orc16withplatform=new AnimationTimer() {
        @Override
        public void handle(long l) {


            orcCollisionwithplatform(orc16,platform1);
            orcCollisionwithplatform(orc16,platform2);
            orcCollisionwithplatform(orc16,platform3);
            orcCollisionwithplatform(orc16,platform4);
            orcCollisionwithplatform(orc16,platform5);
            orcCollisionwithplatform(orc16,platform6);
            orcCollisionwithplatform(orc16,platform7);
            orcCollisionwithplatform(orc16,platform8);
            orcCollisionwithplatform(orc16,platform9);
            orcCollisionwithplatform(orc16,platform10);
            orcCollisionwithplatform(orc16,platform11);
            orcCollisionwithplatform(orc16,platform12);
            orcCollisionwithplatform(orc16,platform13);
            orcCollisionwithplatform(orc16,platform14);
            orcCollisionwithplatform(orc16,platform15);
            orcCollisionwithplatform(orc16,platform16);
            orcCollisionwithplatform(orc16,platform17);
            orcCollisionwithplatform(orc16,platform18);
            orcCollisionwithplatform(orc16,platform19);
            orcCollisionwithplatform(orc16,platform20);
            orcCollisionwithplatform(orc16,platform21);
            orcCollisionwithplatform(orc16,platform22);
            orcCollisionwithplatform(orc16,platform23);
            orcCollisionwithplatform(orc16,platform24);
            orcCollisionwithplatform(orc16,platform25);
            orcCollisionwithplatform(orc16,platform26);
            orcCollisionwithplatform(orc16,platform27);
            orcCollisionwithplatform(orc16,platform28);
            orcCollisionwithplatform(orc16,platform29);
            orcCollisionwithplatform(orc16,platform30);
            orcCollisionwithplatform(orc16,platform31);
            orcCollisionwithplatform(orc16,platform32);
            orcCollisionwithplatform(orc16,platform33);
            orcCollisionwithplatform(orc16,platform34);
            orcCollisionwithplatform(orc16,platform35);
            orcCollisionwithplatform(orc16,platform36);
            orcCollisionwithplatform(orc16,platform37);
            orcCollisionwithplatform(orc16,platform38);
            orcCollisionwithplatform(orc16,platform39);
            orcCollisionwithplatform(orc16,platform40);
            orcCollisionwithplatform(orc16,platform41);
            orcCollisionwithplatform(orc16,platform42);
            orcCollisionwithplatform(orc16,platform43);
            orcCollisionwithplatform(orc16,platform44);
            orcCollisionwithplatform(orc16,platform45);
            orcCollisionwithplatform(orc16,platform46);
            orcCollisionwithplatform(orc16,platform47);
            orcCollisionwithplatform(orc16,platform48);
            orcCollisionwithplatform(orc16,platform49);
            orcCollisionwithplatform(orc16,platform50);
            orcCollisionwithplatform(orc16,platform51);
            orcCollisionwithplatform(orc16,platform52);
            orcCollisionwithplatform(orc16,platform53);
        }
    };
    AnimationTimer orc17withplatform=new AnimationTimer() {
        @Override
        public void handle(long l) {
            orcCollisionwithplatform(orc17,platform1);
            orcCollisionwithplatform(orc17,platform2);
            orcCollisionwithplatform(orc17,platform3);
            orcCollisionwithplatform(orc17,platform4);
            orcCollisionwithplatform(orc17,platform5);
            orcCollisionwithplatform(orc17,platform6);
            orcCollisionwithplatform(orc17,platform7);
            orcCollisionwithplatform(orc17,platform8);
            orcCollisionwithplatform(orc17,platform9);
            orcCollisionwithplatform(orc17,platform10);
            orcCollisionwithplatform(orc17,platform11);
            orcCollisionwithplatform(orc17,platform12);
            orcCollisionwithplatform(orc17,platform13);
            orcCollisionwithplatform(orc17,platform14);
            orcCollisionwithplatform(orc17,platform15);
            orcCollisionwithplatform(orc17,platform16);
            orcCollisionwithplatform(orc17,platform17);
            orcCollisionwithplatform(orc17,platform18);
            orcCollisionwithplatform(orc17,platform19);
            orcCollisionwithplatform(orc17,platform20);
            orcCollisionwithplatform(orc17,platform21);
            orcCollisionwithplatform(orc17,platform22);
            orcCollisionwithplatform(orc17,platform23);
            orcCollisionwithplatform(orc17,platform24);
            orcCollisionwithplatform(orc17,platform25);
            orcCollisionwithplatform(orc17,platform26);
            orcCollisionwithplatform(orc17,platform27);
            orcCollisionwithplatform(orc17,platform28);
            orcCollisionwithplatform(orc17,platform29);
            orcCollisionwithplatform(orc17,platform30);
            orcCollisionwithplatform(orc17,platform31);
            orcCollisionwithplatform(orc17,platform32);
            orcCollisionwithplatform(orc17,platform33);
            orcCollisionwithplatform(orc17,platform34);
            orcCollisionwithplatform(orc17,platform35);
            orcCollisionwithplatform(orc17,platform36);
            orcCollisionwithplatform(orc17,platform37);
            orcCollisionwithplatform(orc17,platform38);
            orcCollisionwithplatform(orc17,platform39);
            orcCollisionwithplatform(orc17,platform40);
            orcCollisionwithplatform(orc17,platform41);
            orcCollisionwithplatform(orc17,platform42);
            orcCollisionwithplatform(orc17,platform43);
            orcCollisionwithplatform(orc17,platform44);
            orcCollisionwithplatform(orc17,platform45);
            orcCollisionwithplatform(orc17,platform46);
            orcCollisionwithplatform(orc17,platform47);
            orcCollisionwithplatform(orc17,platform48);
            orcCollisionwithplatform(orc17,platform49);
            orcCollisionwithplatform(orc17,platform50);
            orcCollisionwithplatform(orc17,platform51);
            orcCollisionwithplatform(orc17,platform52);
            orcCollisionwithplatform(orc17,platform53);
        }
    };
    AnimationTimer orc18withplatform=new AnimationTimer() {
        @Override
        public void handle(long l) {
            orcCollisionwithplatform(orc18,platform1);
            orcCollisionwithplatform(orc18,platform2);
            orcCollisionwithplatform(orc18,platform3);
            orcCollisionwithplatform(orc18,platform4);
            orcCollisionwithplatform(orc18,platform5);
            orcCollisionwithplatform(orc18,platform6);
            orcCollisionwithplatform(orc18,platform7);
            orcCollisionwithplatform(orc18,platform8);
            orcCollisionwithplatform(orc18,platform9);
            orcCollisionwithplatform(orc18,platform10);
            orcCollisionwithplatform(orc18,platform11);
            orcCollisionwithplatform(orc18,platform12);
            orcCollisionwithplatform(orc18,platform13);
            orcCollisionwithplatform(orc18,platform14);
            orcCollisionwithplatform(orc18,platform15);
            orcCollisionwithplatform(orc18,platform16);
            orcCollisionwithplatform(orc18,platform17);
            orcCollisionwithplatform(orc18,platform18);
            orcCollisionwithplatform(orc18,platform19);
            orcCollisionwithplatform(orc18,platform20);
            orcCollisionwithplatform(orc18,platform21);
            orcCollisionwithplatform(orc18,platform22);
            orcCollisionwithplatform(orc18,platform23);
            orcCollisionwithplatform(orc18,platform24);
            orcCollisionwithplatform(orc18,platform25);
            orcCollisionwithplatform(orc18,platform26);
            orcCollisionwithplatform(orc18,platform27);
            orcCollisionwithplatform(orc18,platform28);
            orcCollisionwithplatform(orc18,platform29);
            orcCollisionwithplatform(orc18,platform30);
            orcCollisionwithplatform(orc18,platform31);
            orcCollisionwithplatform(orc18,platform32);
            orcCollisionwithplatform(orc18,platform33);
            orcCollisionwithplatform(orc18,platform34);
            orcCollisionwithplatform(orc18,platform35);
            orcCollisionwithplatform(orc18,platform36);
            orcCollisionwithplatform(orc18,platform37);
            orcCollisionwithplatform(orc18,platform38);
            orcCollisionwithplatform(orc18,platform39);
            orcCollisionwithplatform(orc18,platform40);
            orcCollisionwithplatform(orc18,platform41);
            orcCollisionwithplatform(orc18,platform42);
            orcCollisionwithplatform(orc18,platform43);
            orcCollisionwithplatform(orc18,platform44);
            orcCollisionwithplatform(orc18,platform45);
            orcCollisionwithplatform(orc18,platform46);
            orcCollisionwithplatform(orc18,platform47);
            orcCollisionwithplatform(orc18,platform48);
            orcCollisionwithplatform(orc18,platform49);
            orcCollisionwithplatform(orc18,platform50);
            orcCollisionwithplatform(orc18,platform51);
            orcCollisionwithplatform(orc18,platform52);
            orcCollisionwithplatform(orc18,platform53);
        }
    };
    AnimationTimer orc19withplatform=new AnimationTimer() {
        @Override
        public void handle(long l) {
            orcCollisionwithplatform(orc19,platform1);
            orcCollisionwithplatform(orc19,platform2);
            orcCollisionwithplatform(orc19,platform3);
            orcCollisionwithplatform(orc19,platform4);
            orcCollisionwithplatform(orc19,platform5);
            orcCollisionwithplatform(orc19,platform6);
            orcCollisionwithplatform(orc19,platform7);
            orcCollisionwithplatform(orc19,platform8);
            orcCollisionwithplatform(orc19,platform9);
            orcCollisionwithplatform(orc19,platform10);
            orcCollisionwithplatform(orc19,platform11);
            orcCollisionwithplatform(orc19,platform12);
            orcCollisionwithplatform(orc19,platform13);
            orcCollisionwithplatform(orc19,platform14);
            orcCollisionwithplatform(orc19,platform15);
            orcCollisionwithplatform(orc19,platform16);
            orcCollisionwithplatform(orc19,platform17);
            orcCollisionwithplatform(orc19,platform18);
            orcCollisionwithplatform(orc19,platform19);
            orcCollisionwithplatform(orc19,platform20);
            orcCollisionwithplatform(orc19,platform21);
            orcCollisionwithplatform(orc19,platform22);
            orcCollisionwithplatform(orc19,platform23);
            orcCollisionwithplatform(orc19,platform24);
            orcCollisionwithplatform(orc19,platform25);
            orcCollisionwithplatform(orc19,platform26);
            orcCollisionwithplatform(orc19,platform27);
            orcCollisionwithplatform(orc19,platform28);
            orcCollisionwithplatform(orc19,platform29);
            orcCollisionwithplatform(orc19,platform30);
            orcCollisionwithplatform(orc19,platform31);
            orcCollisionwithplatform(orc19,platform32);
            orcCollisionwithplatform(orc19,platform33);
            orcCollisionwithplatform(orc19,platform34);
            orcCollisionwithplatform(orc19,platform35);
            orcCollisionwithplatform(orc19,platform36);
            orcCollisionwithplatform(orc19,platform37);
            orcCollisionwithplatform(orc19,platform38);
            orcCollisionwithplatform(orc19,platform39);
            orcCollisionwithplatform(orc19,platform40);
            orcCollisionwithplatform(orc19,platform41);
            orcCollisionwithplatform(orc19,platform42);
            orcCollisionwithplatform(orc19,platform43);
            orcCollisionwithplatform(orc19,platform44);
            orcCollisionwithplatform(orc19,platform45);
            orcCollisionwithplatform(orc19,platform46);
            orcCollisionwithplatform(orc19,platform47);
            orcCollisionwithplatform(orc19,platform48);
            orcCollisionwithplatform(orc19,platform49);
            orcCollisionwithplatform(orc19,platform50);
            orcCollisionwithplatform(orc19,platform51);
            orcCollisionwithplatform(orc19,platform52);
            orcCollisionwithplatform(orc19,platform53);
        }
    };
    AnimationTimer orc20withplatform=new AnimationTimer() {
        @Override
        public void handle(long l) {
            orcCollisionwithplatform(orc20,platform1);
            orcCollisionwithplatform(orc20,platform2);
            orcCollisionwithplatform(orc20,platform3);
            orcCollisionwithplatform(orc20,platform4);
            orcCollisionwithplatform(orc20,platform5);
            orcCollisionwithplatform(orc20,platform6);
            orcCollisionwithplatform(orc20,platform7);
            orcCollisionwithplatform(orc20,platform8);
            orcCollisionwithplatform(orc20,platform9);
            orcCollisionwithplatform(orc20,platform10);
            orcCollisionwithplatform(orc20,platform11);
            orcCollisionwithplatform(orc20,platform12);
            orcCollisionwithplatform(orc20,platform13);
            orcCollisionwithplatform(orc20,platform14);
            orcCollisionwithplatform(orc20,platform15);
            orcCollisionwithplatform(orc20,platform16);
            orcCollisionwithplatform(orc20,platform17);
            orcCollisionwithplatform(orc20,platform18);
            orcCollisionwithplatform(orc20,platform19);
            orcCollisionwithplatform(orc20,platform20);
            orcCollisionwithplatform(orc20,platform21);
            orcCollisionwithplatform(orc20,platform22);
            orcCollisionwithplatform(orc20,platform23);
            orcCollisionwithplatform(orc20,platform24);
            orcCollisionwithplatform(orc20,platform25);
            orcCollisionwithplatform(orc20,platform26);
            orcCollisionwithplatform(orc20,platform27);
            orcCollisionwithplatform(orc20,platform28);
            orcCollisionwithplatform(orc20,platform29);
            orcCollisionwithplatform(orc20,platform30);
            orcCollisionwithplatform(orc20,platform31);
            orcCollisionwithplatform(orc20,platform32);
            orcCollisionwithplatform(orc20,platform33);
            orcCollisionwithplatform(orc20,platform34);
            orcCollisionwithplatform(orc20,platform35);
            orcCollisionwithplatform(orc20,platform36);
            orcCollisionwithplatform(orc20,platform37);
            orcCollisionwithplatform(orc20,platform38);
            orcCollisionwithplatform(orc20,platform39);
            orcCollisionwithplatform(orc20,platform40);
            orcCollisionwithplatform(orc20,platform41);
            orcCollisionwithplatform(orc20,platform42);
            orcCollisionwithplatform(orc20,platform43);
            orcCollisionwithplatform(orc20,platform44);
            orcCollisionwithplatform(orc20,platform45);
            orcCollisionwithplatform(orc20,platform46);
            orcCollisionwithplatform(orc20,platform47);
            orcCollisionwithplatform(orc20,platform48);
            orcCollisionwithplatform(orc20,platform49);
            orcCollisionwithplatform(orc20,platform50);
            orcCollisionwithplatform(orc20,platform51);
            orcCollisionwithplatform(orc20,platform52);
            orcCollisionwithplatform(orc20,platform53);
        }
    };
    AnimationTimer orc21withplatform=new AnimationTimer() {
        @Override
        public void handle(long l) {
            orcCollisionwithplatform(orc21,platform1);
            orcCollisionwithplatform(orc21,platform2);
            orcCollisionwithplatform(orc21,platform3);
            orcCollisionwithplatform(orc21,platform4);
            orcCollisionwithplatform(orc21,platform5);
            orcCollisionwithplatform(orc21,platform6);
            orcCollisionwithplatform(orc21,platform7);
            orcCollisionwithplatform(orc21,platform8);
            orcCollisionwithplatform(orc21,platform9);
            orcCollisionwithplatform(orc21,platform10);
            orcCollisionwithplatform(orc21,platform11);
            orcCollisionwithplatform(orc21,platform12);
            orcCollisionwithplatform(orc21,platform13);
            orcCollisionwithplatform(orc21,platform14);
            orcCollisionwithplatform(orc21,platform15);
            orcCollisionwithplatform(orc21,platform16);
            orcCollisionwithplatform(orc21,platform17);
            orcCollisionwithplatform(orc21,platform18);
            orcCollisionwithplatform(orc21,platform19);
            orcCollisionwithplatform(orc21,platform20);
            orcCollisionwithplatform(orc21,platform21);
            orcCollisionwithplatform(orc21,platform22);
            orcCollisionwithplatform(orc21,platform23);
            orcCollisionwithplatform(orc21,platform24);
            orcCollisionwithplatform(orc21,platform25);
            orcCollisionwithplatform(orc21,platform26);
            orcCollisionwithplatform(orc21,platform27);
            orcCollisionwithplatform(orc21,platform28);
            orcCollisionwithplatform(orc21,platform29);
            orcCollisionwithplatform(orc21,platform30);
            orcCollisionwithplatform(orc21,platform31);
            orcCollisionwithplatform(orc21,platform32);
            orcCollisionwithplatform(orc21,platform33);
            orcCollisionwithplatform(orc21,platform34);
            orcCollisionwithplatform(orc21,platform35);
            orcCollisionwithplatform(orc21,platform36);
            orcCollisionwithplatform(orc21,platform37);
            orcCollisionwithplatform(orc21,platform38);
            orcCollisionwithplatform(orc21,platform39);
            orcCollisionwithplatform(orc21,platform40);
            orcCollisionwithplatform(orc21,platform41);
            orcCollisionwithplatform(orc21,platform42);
            orcCollisionwithplatform(orc21,platform43);
            orcCollisionwithplatform(orc21,platform44);
            orcCollisionwithplatform(orc21,platform45);
            orcCollisionwithplatform(orc21,platform46);
            orcCollisionwithplatform(orc21,platform47);
            orcCollisionwithplatform(orc21,platform48);
            orcCollisionwithplatform(orc21,platform49);
            orcCollisionwithplatform(orc21,platform50);
            orcCollisionwithplatform(orc21,platform51);
            orcCollisionwithplatform(orc21,platform52);
            orcCollisionwithplatform(orc21,platform53);
        }
    };
    AnimationTimer orc22withplatform=new AnimationTimer() {
        @Override
        public void handle(long l) {
            orcCollisionwithplatform(orc22,platform1);
            orcCollisionwithplatform(orc22,platform2);
            orcCollisionwithplatform(orc22,platform3);
            orcCollisionwithplatform(orc22,platform4);
            orcCollisionwithplatform(orc22,platform5);
            orcCollisionwithplatform(orc22,platform6);
            orcCollisionwithplatform(orc22,platform7);
            orcCollisionwithplatform(orc22,platform8);
            orcCollisionwithplatform(orc22,platform9);
            orcCollisionwithplatform(orc22,platform10);
            orcCollisionwithplatform(orc22,platform11);
            orcCollisionwithplatform(orc22,platform12);
            orcCollisionwithplatform(orc22,platform13);
            orcCollisionwithplatform(orc22,platform14);
            orcCollisionwithplatform(orc22,platform15);
            orcCollisionwithplatform(orc22,platform16);
            orcCollisionwithplatform(orc22,platform17);
            orcCollisionwithplatform(orc22,platform18);
            orcCollisionwithplatform(orc22,platform19);
            orcCollisionwithplatform(orc22,platform20);
            orcCollisionwithplatform(orc22,platform21);
            orcCollisionwithplatform(orc22,platform22);
            orcCollisionwithplatform(orc22,platform23);
            orcCollisionwithplatform(orc22,platform24);
            orcCollisionwithplatform(orc22,platform25);
            orcCollisionwithplatform(orc22,platform26);
            orcCollisionwithplatform(orc22,platform27);
            orcCollisionwithplatform(orc22,platform28);
            orcCollisionwithplatform(orc22,platform29);
            orcCollisionwithplatform(orc22,platform30);
            orcCollisionwithplatform(orc22,platform31);
            orcCollisionwithplatform(orc22,platform32);
            orcCollisionwithplatform(orc22,platform33);
            orcCollisionwithplatform(orc22,platform34);
            orcCollisionwithplatform(orc22,platform35);
            orcCollisionwithplatform(orc22,platform36);
            orcCollisionwithplatform(orc22,platform37);
            orcCollisionwithplatform(orc22,platform38);
            orcCollisionwithplatform(orc22,platform39);
            orcCollisionwithplatform(orc22,platform40);
            orcCollisionwithplatform(orc22,platform41);
            orcCollisionwithplatform(orc22,platform42);
            orcCollisionwithplatform(orc22,platform43);
            orcCollisionwithplatform(orc22,platform44);
            orcCollisionwithplatform(orc22,platform45);
            orcCollisionwithplatform(orc22,platform46);
            orcCollisionwithplatform(orc22,platform47);
            orcCollisionwithplatform(orc22,platform48);
            orcCollisionwithplatform(orc22,platform49);
            orcCollisionwithplatform(orc22,platform50);
            orcCollisionwithplatform(orc22,platform51);
            orcCollisionwithplatform(orc22,platform52);
            orcCollisionwithplatform(orc22,platform53);
        }
    };
    AnimationTimer axecollision=new AnimationTimer() {
        @Override
        public void handle(long l) {
            axecollissionwithorc(orc1);
            axecollissionwithorc(orc2);
            axecollissionwithorc(orc3);
            axecollissionwithorc(orc4);
            axecollissionwithorc(orc5);
            axecollissionwithorc(orc6);
            axecollissionwithorc(orc7);
            axecollissionwithorc(orc8);
            axecollissionwithorc(orc9);
            axecollissionwithorc(orc10);
            axecollissionwithorc(orc11);
            axecollissionwithorc(orc12);
            axecollissionwithorc(orc13);
            axecollissionwithorc(orc14);
            axecollissionwithorc(orc15);
            axecollissionwithorc(orc16);
            axecollissionwithorc(orc17);
            axecollissionwithorc(orc18);
            axecollissionwithorc(orc19);
            axecollissionwithorc(orc20);
            axecollissionwithorc(orc21);
            axecollissionwithorc(orc22);

        }
    };
    AnimationTimer collisionfps =new AnimationTimer() {
        @Override
        public void handle(long l) {
            checkCollision(platform1);
            checkCollision(platform2);
            checkCollision(platform3);
            checkCollision(platform4);
            checkCollision(platform5);
            checkCollision(platform6);
            checkCollision(platform7);
            checkCollision(platform8);
            checkCollision(platform9);
            checkCollision(platform10);
            checkCollision(platform11);
            checkCollision(platform12);
            checkCollision(platform13);
            checkCollision(platform14);
            checkCollision(platform15);
            checkCollision(platform16);
            checkCollision(platform17);
            checkCollision(platform18);
            checkCollision(platform19);
            checkCollision(platform20);
            checkCollision(platform21);
            checkCollision(platform22);
            checkCollision(platform23);
            checkCollision(platform24);
            checkCollision(platform25);
            checkCollision(platform26);
            checkCollision(platform27);
            checkCollision(platform28);
            checkCollision(platform29);
            checkCollision(platform30);
            checkCollision(platform31);
            checkCollision(platform32);
            checkCollision(platform33);
            checkCollision(platform34);
            checkCollision(platform35);
            checkCollision(platform36);
            checkCollision(platform37);
            checkCollision(platform38);
            checkCollision(platform39);
            checkCollision(platform40);
            checkCollision(platform41);
            checkCollision(platform42);
            checkCollision(platform43);
            checkCollision(platform44);
            checkCollision(platform45);
            checkCollision(platform46);
            checkCollision(platform47);
            checkCollision(platform48);
            checkCollision(platform49);
            checkCollision(platform50);
            checkCollision(platform51);
            checkCollision(platform52);
            checkCollision(platform53);
            checkCollision(a1);
            checkCollision(a2);
            checkCollision(a3);
            checkCollision(a4);
            checkCollision(a5);
            checkCollision(a6);
            checkCollision(a7);
            checkCollision(a8);
            checkCollision(a9);
            checkCollision(a10);
            checkCollision(a11);
            checkCollision(a12);
            checkCollision(c1);
            checkCollision(c2);
            checkCollision(c3);
            checkCollision(c4);
            checkCollision(c5);
            checkCollision(c6);
            checkCollision(c7);
            checkCollision(c8);
            checkCollision(c9);
            checkCollision(c10);
            checkCollision(c11);
            checkCollision(c12);
            checkCollision(b1);
            checkCollision(b2);
            checkCollision(b3);
            checkCollision(b4);
            checkCollision(b5);
            checkCollision(b6);
            checkCollision(b7);
            checkCollision(b8);
            checkCollision(b9);
            checkCollision(b10);
            checkCollision(b11);
            checkCollision(b12);
            checkCollision(d1);
            checkCollision(d2);
            checkCollision(d3);
            checkCollision(d4);
            checkCollision(d5);
            checkCollision(d6);
            checkCollision(d7);
            checkCollision(d8);
            checkCollision(d9);
            checkCollision(d10);
            checkCollision(d11);
            checkCollision(d12);

        }
    };
    public void checkcoincollision(){
       if(hero.getBoundsInParent().intersects(coin1.getBoundsInParent())){
           if(coin1.getOpacity()==1) {
               coin1.setOpacity(0);
               changecoincounter(1);
           }

       }
        if(hero.getBoundsInParent().intersects(bigcoin.getBoundsInParent())){
            if(bigcoin.getOpacity()==1) {
                bigcoin.setOpacity(0);
                changecoincounter(5);
            }

        }
        if(hero.getBoundsInParent().intersects(coin2.getBoundsInParent())){
            if(coin2.getOpacity()==1) {
                coin2.setOpacity(0);
                changecoincounter(1);
            }

        }if(hero.getBoundsInParent().intersects(coin3.getBoundsInParent())){
            if(coin3.getOpacity()==1) {
                coin3.setOpacity(0);
                changecoincounter(1);
            }

        }if(hero.getBoundsInParent().intersects(coin4.getBoundsInParent())){
            if(coin4.getOpacity()==1) {
                coin4.setOpacity(0);
                changecoincounter(1);
            }

        }if(hero.getBoundsInParent().intersects(coin5.getBoundsInParent())){
            if(coin5.getOpacity()==1) {
                coin5.setOpacity(0);
                changecoincounter(1);
            }

        }if(hero.getBoundsInParent().intersects(coin6.getBoundsInParent())){
            if(coin6.getOpacity()==1) {
                coin6.setOpacity(0);
                changecoincounter(1);
            }
        }
    }
    public void timer(int seconds){


    }
    public void setyesrevive(ActionEvent actionEvent) {

        if (Integer.parseInt(coincounter.getText()) >= 10) {
            changecoincounter(-10);
            will.getCoin().setCoinVal(Integer.parseInt(coincounter.getText()));
            try{
                will.serialise();
            }
            catch(Exception e){

            }
            Controller2 cd = new Controller2();
            try {
                cd.loadnewgame(actionEvent);
            } catch (Exception e) {

            }
        }
    }




    public void checkherodead(){
        if(hero.getBoundsInParent().getCenterY()>900){
            if(herodead==0) {
                herodead = 1;

                showrevivescene();
            }
        }
    }
    public void axecollissionwithorc(ImageView orc){
        if(axe.getBoundsInParent().intersects(orc.getBoundsInParent())){
            if(axe.getOpacity()==1) {
                if(orc.getOpacity()==1) {
                    orc.setOpacity(0);
                    changecoincounter(1);
                }
//
            }
        }
    }
    public void ReviveUsingCoins(ActionEvent event) throws IOException {

    }
    public void Revive(Stage stage) throws IOException {

    }
    public void switchToGame(ActionEvent event) throws IOException {

        FXMLLoader ld=new FXMLLoader(getClass().getResource("sample.fxml"));
        root=ld.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Controller cont=ld.getController();
        stage.setTitle("Will Hero");
        scene=new Scene(root,1100,800);
        //camera=new PerspectiveCamera();
        scene.setCamera(camera);
        stage.setScene(scene);
        plist.add(platform1);
        scene.setOnKeyPressed(new EventHandler<javafx.scene.input.KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getText().equals("d")) {

                            TranslateTransition trans = new TranslateTransition();
                            trans.setNode(camera);
                            trans.setDuration(Duration.millis(300));
                            trans.setByX(300);
                            trans.play();


                }
                if(keyEvent.getText().equals("p")){
                    try{
                        pause(stage);}
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }
                if(keyEvent.getText().equals("r")){
                    try{Revive(stage);}
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }

        });

        stage.show();

    }

    public void movecamera(){

        TranslateTransition trans=new TranslateTransition();
        trans.setNode(camera);
        trans.setDuration(Duration.millis(300));
        trans.setByX(300);
        trans.play();
    }
    public void moveloadedcamera(){
        if(cameracheck==0) {
            if(camera.getTranslateX()!=hero.getTranslateX()) {
                cameracheck = 1;
                camera.setTranslateX(hero.getTranslateX());
            }
        }
    }
    public void switchToMainMenu(ActionEvent event) throws IOException {
        Hero r=new Hero();
        r.serialise();
        root = FXMLLoader.load(getClass().getResource("/sample/MainMenu.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root,1100,800);
        stage.setScene(scene);
        stage.show();
    }

    public void pause(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("pauseDestination.fxml"));
        scene = new Scene(root,1100,800);
        stage.setTitle("Will Hero");
        stage.setScene(scene);
        stage.show();
    }
    public void checkCollisionorcwithHero(ImageView orc){
        double herotop=hero.getBoundsInParent().getMinY();
        double herocentrex=hero.getBoundsInParent().getCenterX();
        double herobottom=hero.getBoundsInParent().getMaxY();
        double heroright=hero.getBoundsInParent().getMaxX();
        double heroleft=hero.getBoundsInParent().getMinX();
        double orcleft=orc.getBoundsInParent().getMinX();
        double orcright=orc.getBoundsInParent().getMaxX();
        double orcdown=orc.getBoundsInParent().getMaxY();
        double orctop=orc.getBoundsInParent().getMinY();
        if(orc.getOpacity()!=0) {
            if (hero.getBoundsInParent().intersects(orc.getBoundsInParent())) {
                if (heroright > orcleft) {

                    if (herotop < orcdown) {
                        if (orcdown < herotop + 10) {
                            if(herodead==0) {
                                herodead=1;
                                showrevivescene();
                                will.die();
                                try{
                                    will.serialise();
                                }
                                catch(Exception e){

                                }
                            }
                        }
                    }

                    if (orcleft + 20 >= heroright) {
                        TranslateTransition trans = new TranslateTransition();
                        trans.setNode(orc);
                        trans.setDuration(Duration.millis(150));
                        trans.setByX(500);
                        trans.setOnFinished(e -> finished1(orc));
                        trans.play();

                    }

                }
                if (herobottom >= orctop) {
                    if (orctop + 20 >= herobottom) {
                        TranslateTransition k1 = new TranslateTransition();
                        k1.setNode(knife1);
                        k1.setDuration(Duration.millis(100));
                        k1.setByY(-100);
                        k1.play();
                        TranslateTransition k2 = new TranslateTransition();
                        k2.setNode(knife2);
                        k2.setDuration(Duration.millis(100));
                        k2.setByY(-100);
                        k2.play();
                        TranslateTransition k3 = new TranslateTransition();
                        k3.setNode(knife3);
                        k3.setDuration(Duration.millis(100));
                        k3.setByY(-100);
                        k3.play();
                        TranslateTransition trans = new TranslateTransition();
                        trans.setNode(hero);
                        trans.setDuration(Duration.millis(100));
                        trans.setByY(-100);
                        trans.setOnFinished(e -> finished());
                        TranslateTransition ax = new TranslateTransition();
                        ax.setNode(axe);
                        ax.setDuration(Duration.millis(100));
                        ax.setByY(-100);
                        ax.play();
                        trans.play();


                    }
                }
            }
        }
    }
    public void moveaxe(ImageView axe){
        TranslateTransition ax=new TranslateTransition();
        Node im=axe;
        ax.setNode(im);
        ax.setDuration(Duration.millis(300));
        ax.setByX(300);
        ax.play();

    }
    public void showrevivescene(){
        movecoin1.setOpacity(1);
        reviveorc.setOpacity(1);
        revivenobutton.setOpacity(1);
        reviveyesbutton.setOpacity(1);
        revivepane2.setOpacity(1);
        saveme.setOpacity(1);
        double r=will.getPosition().getX_position();

    }
    public void orcCollisionwithplatform(ImageView orc,ImageView platform){
        double orctop=orc.getBoundsInParent().getMinY();
        double orcbottom=orc.getBoundsInParent().getMaxY();
        double orcright=orc.getBoundsInParent().getMaxX();
        double orcleft=orc.getBoundsInParent().getMinX();
        double ptop=platform.getBoundsInParent().getMinY();
        double pbottom=platform.getBoundsInParent().getMaxY();
        double pright=platform.getBoundsInParent().getMaxX();
        double pleft=platform.getBoundsInParent().getMinX();

        if(orc.getBoundsInParent().intersects(platform.getBoundsInParent())) {

            if (orcbottom >= ptop) {
                if(ptop+60>=orcbottom) {
                    TranslateTransition trans = new TranslateTransition();
                    Node image = orc;
                    trans.setNode(image);
                    trans.setDuration(Duration.millis(300));

                    trans.setByY(-150);

                    trans.setOnFinished(e -> finished1(orc));
                    trans.play();
                }
                if(orcbottom>ptop+60){
                    if(orcright>=pleft){
                            TranslateTransition trans = new TranslateTransition();
                            Node image = orc;
                            trans.setNode(image);
                            trans.setDuration(Duration.millis(500));

                            trans.setByX(-50);

                            trans.setOnFinished(e -> finished1(orc));
                            trans.play();

                    }
                }


            }


        }}
    public void finished1(ImageView orc){
        TranslateTransition trans2=new TranslateTransition();
        trans2.setNode(orc);
        trans2.setDuration(Duration.millis(10));
        trans2.play();
        TranslateTransition trans1=new TranslateTransition();
        Node image1=orc;
        trans1.setNode(image1);
        trans1.setDuration(Duration.millis((800-orc.getY())*3));

        trans1.setByY(800-orc.getY());

        trans1.play();
    }
    public void checkCollision(ImageView platform){
        double herotop = hero.getBoundsInParent().getMinY();
        double herocentrex = hero.getBoundsInParent().getCenterX();
        double herobottom = hero.getBoundsInParent().getMaxY();
        double heroright = hero.getBoundsInParent().getMaxX();
        double heroleft = hero.getBoundsInParent().getMinX();
        double ptop = platform.getBoundsInParent().getMinY();
        double pbottom = platform.getBoundsInParent().getMaxY();
        double pright = platform.getBoundsInParent().getMaxX();
        double pleft = platform.getBoundsInParent().getMinX();

        if (hero.getBoundsInParent().intersects(platform.getBoundsInParent())) {

            if ((int) herobottom >= (int) ptop) {
                if ((int) ptop + 15 >= (int) herobottom) {

                    if(herodead==0) {
                        if((int)hero.getTranslateX()!=0){
                        int num=Integer.parseInt(coincounter.getText());
                        will.getCoin().setCoinVal(num);
                        int step=Integer.parseInt(stepcounter.getText());
                        will.setstep(step);
                        if(axe.getOpacity()==1){
                            will.setw1(1);
                        }
                        if(knife1.getOpacity()==1){
                            will.setw1(2);
                        }
                        will.getPosition().setX_position(hero.getTranslateX());

                        try {

                            will.serialise();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }}
                    TranslateTransition k1=new TranslateTransition();
                    k1.setNode(knife1);
                    k1.setDuration(Duration.millis(300));
                    k1.setByY(-100);
                    k1.play();
                    TranslateTransition k2=new TranslateTransition();
                    k2.setNode(knife2);
                    k2.setDuration(Duration.millis(300));
                    k2.setByY(-100);
                    k2.play();
                    TranslateTransition k3=new TranslateTransition();
                    k3.setNode(knife3);
                    k3.setDuration(Duration.millis(300));
                    k3.setByY(-100);
                    k3.play();
                    TranslateTransition ax=new TranslateTransition();
                    ax.setNode(axe);
                    ax.setDuration(Duration.millis(300));
                    ax.setByY(-100);
                    ax.play();
                    TranslateTransition trans = new TranslateTransition();
                    Node image = hero;
                    trans.setNode(image);
                    trans.setDuration(Duration.millis(300));
                    trans.setByY(-100);
                    trans.setOnFinished(e -> finished());
                    trans.play();
                }


            }
            if ((int) herobottom > (int) ptop + 7) {
                if (heroright >= pleft) {
                    //game over

                }
            }
            if(platform.getId().equals("a1")||platform.getId().equals("a2")||platform.getId().equals("a3")||platform.getId().equals("a4")||platform.getId().equals("a5")||platform.getId().equals("a6")||platform.getId().equals("a7")||platform.getId().equals("a8")||platform.getId().equals("a9")||platform.getId().equals("a10")||platform.getId().equals("a11")||platform.getId().equals("a12")){
                int r=375;
                TranslateTransition t1 = new TranslateTransition();
                    t1.setNode(a1);
                    t1.setDuration(Duration.millis(r));
                    t1.setOnFinished(e -> finishedfall(a1));
                    t1.play();

                    TranslateTransition t2 = new TranslateTransition();
                    t2.setNode(a2);
                    t2.setDuration(Duration.millis(2*r));
                    t2.setOnFinished(e -> finishedfall(a2));
                    t2.play();

                    TranslateTransition t3 = new TranslateTransition();
                    t3.setNode(a3);
                    t3.setDuration(Duration.millis(3*r));
                t3.setOnFinished(e -> finishedfall(a3));
                    t3.play();

                    TranslateTransition t4 = new TranslateTransition();
                    t4.setNode(a4);
                    t4.setDuration(Duration.millis(4*r));
                t4.setOnFinished(e -> finishedfall(a4));
                    t4.play();

                    TranslateTransition t5 = new TranslateTransition();
                    t5.setNode(a5);
                    t5.setDuration(Duration.millis(5*r));
                t5.setOnFinished(e -> finishedfall(a5));
                    t5.play();

                    TranslateTransition t6 = new TranslateTransition();
                    t6.setNode(a6);
                    t6.setDuration(Duration.millis(6*r));
                t6.setOnFinished(e -> finishedfall(a6));
                    t6.play();

                    TranslateTransition t7 = new TranslateTransition();
                    t7.setNode(a7);
                    t7.setDuration(Duration.millis(7*r));
                t7.setOnFinished(e -> finishedfall(a7));
                    t7.play();

                    TranslateTransition t8 = new TranslateTransition();
                    t8.setNode(a8);
                    t8.setDuration(Duration.millis(8*r));
                t8.setOnFinished(e -> finishedfall(a8));
                    t8.play();

                    TranslateTransition t9 = new TranslateTransition();
                    t9.setNode(a9);
                    t9.setDuration(Duration.millis(9*r));
                t9.setOnFinished(e -> finishedfall(a9));
                    t9.play();

                    TranslateTransition t10 = new TranslateTransition();
                    t10.setNode(a10);
                    t10.setDuration(Duration.millis(10*r));
                t10.setOnFinished(e -> finishedfall(a10));
                    t10.play();

                    TranslateTransition t11 = new TranslateTransition();
                    t11.setNode(a11);
                    t11.setDuration(Duration.millis(11*r));
                t11.setOnFinished(e -> finishedfall(a11));
                    t11.play();

                    TranslateTransition t12 = new TranslateTransition();
                    t12.setNode(a12);
                    t12.setDuration(Duration.millis(12*r));
                t12.setOnFinished(e -> finishedfall(a12));
                    t12.play();




        }
            if(platform.getId().equals("b1")||platform.getId().equals("b2")||platform.getId().equals("b3")||platform.getId().equals("b4")||platform.getId().equals("b5")||platform.getId().equals("b6")||platform.getId().equals("b7")||platform.getId().equals("b8")||platform.getId().equals("b9")||platform.getId().equals("b10")||platform.getId().equals("b11")||platform.getId().equals("b12")){
                int r=375;
                TranslateTransition t1 = new TranslateTransition();
                t1.setNode(b1);
                t1.setDuration(Duration.millis(r));
                t1.setOnFinished(e -> finishedfall(b1));
                t1.play();

                TranslateTransition t2 = new TranslateTransition();
                t2.setNode(b2);
                t2.setDuration(Duration.millis(2*r));
                t2.setOnFinished(e -> finishedfall(b2));
                t2.play();

                TranslateTransition t3 = new TranslateTransition();
                t3.setNode(b3);
                t3.setDuration(Duration.millis(3*r));
                t3.setOnFinished(e -> finishedfall(b3));
                t3.play();

                TranslateTransition t4 = new TranslateTransition();
                t4.setNode(b4);
                t4.setDuration(Duration.millis(4*r));
                t4.setOnFinished(e -> finishedfall(b4));
                t4.play();

                TranslateTransition t5 = new TranslateTransition();
                t5.setNode(b5);
                t5.setDuration(Duration.millis(5*r));
                t5.setOnFinished(e -> finishedfall(b5));
                t5.play();

                TranslateTransition t6 = new TranslateTransition();
                t6.setNode(b6);
                t6.setDuration(Duration.millis(6*r));
                t6.setOnFinished(e -> finishedfall(b6));
                t6.play();

                TranslateTransition t7 = new TranslateTransition();
                t7.setNode(b7);
                t7.setDuration(Duration.millis(7*r));
                t7.setOnFinished(e -> finishedfall(b7));
                t7.play();

                TranslateTransition t8 = new TranslateTransition();
                t8.setNode(b8);
                t8.setDuration(Duration.millis(8*r));
                t8.setOnFinished(e -> finishedfall(b8));
                t8.play();

                TranslateTransition t9 = new TranslateTransition();
                t9.setNode(b9);
                t9.setDuration(Duration.millis(9*r));
                t9.setOnFinished(e -> finishedfall(b9));
                t9.play();

                TranslateTransition t10 = new TranslateTransition();
                t10.setNode(b10);
                t10.setDuration(Duration.millis(10*r));
                t10.setOnFinished(e -> finishedfall(b10));
                t10.play();

                TranslateTransition t11 = new TranslateTransition();
                t11.setNode(b11);
                t11.setDuration(Duration.millis(11*r));
                t11.setOnFinished(e -> finishedfall(b11));
                t11.play();

                TranslateTransition t12 = new TranslateTransition();
                t12.setNode(b12);
                t12.setDuration(Duration.millis(12*r));
                t12.setOnFinished(e -> finishedfall(b12));
                t12.play();




            }
            if(platform.getId().equals("c1")||platform.getId().equals("c2")||platform.getId().equals("c3")||platform.getId().equals("c4")||platform.getId().equals("c5")||platform.getId().equals("c6")||platform.getId().equals("c7")||platform.getId().equals("c8")||platform.getId().equals("c9")||platform.getId().equals("c10")||platform.getId().equals("c11")||platform.getId().equals("c12")){
                int r=375;
                TranslateTransition t1 = new TranslateTransition();
                t1.setNode(c1);
                t1.setDuration(Duration.millis(r));
                t1.setOnFinished(e -> finishedfall(c1));
                t1.play();

                TranslateTransition t2 = new TranslateTransition();
                t2.setNode(c2);
                t2.setDuration(Duration.millis(2*r));
                t2.setOnFinished(e -> finishedfall(c2));
                t2.play();

                TranslateTransition t3 = new TranslateTransition();
                t3.setNode(c3);
                t3.setDuration(Duration.millis(3*r));
                t3.setOnFinished(e -> finishedfall(c3));
                t3.play();

                TranslateTransition t4 = new TranslateTransition();
                t4.setNode(c4);
                t4.setDuration(Duration.millis(4*r));
                t4.setOnFinished(e -> finishedfall(c4));
                t4.play();

                TranslateTransition t5 = new TranslateTransition();
                t5.setNode(c5);
                t5.setDuration(Duration.millis(5*r));
                t5.setOnFinished(e -> finishedfall(c5));
                t5.play();

                TranslateTransition t6 = new TranslateTransition();
                t6.setNode(c6);
                t6.setDuration(Duration.millis(6*r));
                t6.setOnFinished(e -> finishedfall(c6));
                t6.play();

                TranslateTransition t7 = new TranslateTransition();
                t7.setNode(c7);
                t7.setDuration(Duration.millis(7*r));
                t7.setOnFinished(e -> finishedfall(c7));
                t7.play();

                TranslateTransition t8 = new TranslateTransition();
                t8.setNode(c8);
                t8.setDuration(Duration.millis(8*r));
                t8.setOnFinished(e -> finishedfall(c8));
                t8.play();

                TranslateTransition t9 = new TranslateTransition();
                t9.setNode(c9);
                t9.setDuration(Duration.millis(9*r));
                t9.setOnFinished(e -> finishedfall(c9));
                t9.play();

                TranslateTransition t10 = new TranslateTransition();
                t10.setNode(c10);
                t10.setDuration(Duration.millis(10*r));
                t10.setOnFinished(e -> finishedfall(c10));
                t10.play();

                TranslateTransition t11 = new TranslateTransition();
                t11.setNode(c11);
                t11.setDuration(Duration.millis(11*r));
                t11.setOnFinished(e -> finishedfall(c11));
                t11.play();

                TranslateTransition t12 = new TranslateTransition();
                t12.setNode(c12);
                t12.setDuration(Duration.millis(12*r));
                t12.setOnFinished(e -> finishedfall(c12));
                t12.play();




            }
            if(platform.getId().equals("d1")||platform.getId().equals("d2")||platform.getId().equals("d3")||platform.getId().equals("d4")||platform.getId().equals("d5")||platform.getId().equals("d6")||platform.getId().equals("d7")||platform.getId().equals("d8")||platform.getId().equals("d9")||platform.getId().equals("d10")||platform.getId().equals("d11")||platform.getId().equals("d12")){
                int r=375;
                TranslateTransition t1 = new TranslateTransition();
                t1.setNode(d1);
                t1.setDuration(Duration.millis(r));
                t1.setOnFinished(e -> finishedfall(d1));
                t1.play();

                TranslateTransition t2 = new TranslateTransition();
                t2.setNode(d2);
                t2.setDuration(Duration.millis(2*r));
                t2.setOnFinished(e -> finishedfall(d2));
                t2.play();

                TranslateTransition t3 = new TranslateTransition();
                t3.setNode(d3);
                t3.setDuration(Duration.millis(3*r));
                t3.setOnFinished(e -> finishedfall(d3));
                t3.play();

                TranslateTransition t4 = new TranslateTransition();
                t4.setNode(d4);
                t4.setDuration(Duration.millis(4*r));
                t4.setOnFinished(e -> finishedfall(d4));
                t4.play();

                TranslateTransition t5 = new TranslateTransition();
                t5.setNode(d5);
                t5.setDuration(Duration.millis(5*r));
                t5.setOnFinished(e -> finishedfall(d5));
                t5.play();

                TranslateTransition t6 = new TranslateTransition();
                t6.setNode(d6);
                t6.setDuration(Duration.millis(6*r));
                t6.setOnFinished(e -> finishedfall(d6));
                t6.play();

                TranslateTransition t7 = new TranslateTransition();
                t7.setNode(d7);
                t7.setDuration(Duration.millis(7*r));
                t7.setOnFinished(e -> finishedfall(d7));
                t7.play();

                TranslateTransition t8 = new TranslateTransition();
                t8.setNode(d8);
                t8.setDuration(Duration.millis(8*r));
                t8.setOnFinished(e -> finishedfall(d8));
                t8.play();

                TranslateTransition t9 = new TranslateTransition();
                t9.setNode(d9);
                t9.setDuration(Duration.millis(9*r));
                t9.setOnFinished(e -> finishedfall(d9));
                t9.play();

                TranslateTransition t10 = new TranslateTransition();
                t10.setNode(d10);
                t10.setDuration(Duration.millis(10*r));
                t10.setOnFinished(e -> finishedfall(d10));
                t10.play();

                TranslateTransition t11 = new TranslateTransition();
                t11.setNode(d11);
                t11.setDuration(Duration.millis(11*r));
                t11.setOnFinished(e -> finishedfall(d11));
                t11.play();

                TranslateTransition t12 = new TranslateTransition();
                t12.setNode(d12);
                t12.setDuration(Duration.millis(12*r));
                t12.setOnFinished(e -> finishedfall(d12));
                t12.play();




            }
    }}
    public void finishedfall(ImageView a) {
        TranslateTransition t = new TranslateTransition();
        t.setNode(a);
        t.setDuration(Duration.millis(1000));
        t.setByY(1000);
        t.play();
    }
    public void finished(){
        TranslateTransition k1=new TranslateTransition();
        k1.setNode(knife1);
        k1.setDuration(Duration.millis((900-hero.getY())*3.5));
        k1.setByY(900-hero.getY());
        k1.play();
        TranslateTransition k2=new TranslateTransition();
        k2.setNode(knife2);
        k2.setDuration(Duration.millis((900-hero.getY())*3.5));
        k2.setByY(900-hero.getY());
        k2.play();
        TranslateTransition k3=new TranslateTransition();
        k3.setNode(knife3);
        k3.setDuration(Duration.millis((900-hero.getY())*3.5));
        k3.setByY(900-hero.getY());
        k3.play();
        TranslateTransition ax=new TranslateTransition();
        ax.setNode(axe);
        ax.setDuration(Duration.millis((900-hero.getY())*3.5));
        ax.setByY(900-hero.getY());
        ax.play();
        TranslateTransition trans1=new TranslateTransition();
        Node image1=hero;
        trans1.setNode(image1);
        trans1.setDuration(Duration.millis((900-hero.getY())*3.5));
        trans1.setByY(900-hero.getY());
        trans1.play();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        savegamevar sgv=new savegamevar();
        try {
            sgv = sgv.derialise();
        }
        catch(Exception e){

        }
        Hero k=new Hero();
        if(sgv.getLocation()==0){
            try {
                will = k.derialise();
            } catch (Exception e) {

            }
        }
        if(sgv.getLocation()==1) {
            try {
                will = k.derialise1();
            } catch (Exception e) {

            }
        }
        if(sgv.getLocation()==2){
            try {
                will = k.derialise2();
            } catch (Exception e) {

            }
        }
        if(sgv.getLocation()==3){
            try {
                will = k.derialise3();
            } catch (Exception e) {

            }
        }
        if(sgv.getCounter()==1){
            sgv.setCounter(0);
            sgv.setLocation(0);
            try {

                sgv.serialise();
            } catch (Exception e) {

            }
            starttimer();
        }
        else if(sgv.getCounter()==0) {
            sgv.setCounter(1);
            try {

                sgv.serialise();
            } catch (Exception e) {

            }

        }
        hero.setOpacity(1);

        double x=will.getPosition().getX_position();
        timer.setTranslateX(x);
        timeelapsed=will.gettimeelapsed();
        stepcounter.setTranslateX(x);
        coincounter.setTranslateX(x);
        movecoin.setTranslateX(x);
        hero.setTranslateX(x);
        camera.setTranslateX(x);
        axe.setTranslateX(x);
        setcoincounter(will.getCoin().getCoinVal());
        setstepcounter(will.getstep());
        axe.setOpacity(0);
        knife1.setOpacity(0);
        knife2.setOpacity(0);
        knife3.setOpacity(0);
        if(will.getw1()==1){
            axe.setOpacity(1);
        }
        if(will.getw1()==2){
            knife1.setOpacity(1);
            knife2.setOpacity(1);
            knife3.setOpacity(1);
        }
        knife1.setTranslateX(x);
        knife2.setTranslateX(x);
        knife3.setTranslateX(x);
        revivepane2.setTranslateX(x);
        background.setTranslateX(x);
        hero.setTranslateY(-300);
        axe.setTranslateY(-300);
        knife1.setTranslateY(-300);
        knife2.setTranslateY(-300);
        knife3.setTranslateY(-300);

        herowithchest.start();
        axecollision.start();
        collisionfps.start();
        herowithorc.start();
        orc1withplatform.start();
        orc2withplatform.start();
        orc3withplatform.start();
        orc4withplatform.start();
        orc5withplatform.start();
        orc6withplatform.start();
        orc7withplatform.start();
        orc8withplatform.start();
        orc9withplatform.start();
        orc10withplatform.start();
        orc11withplatform.start();
        orc12withplatform.start();
        orc13withplatform.start();
        orc14withplatform.start();
        orc15withplatform.start();
        orc16withplatform.start();
        orc17withplatform.start();
        orc18withplatform.start();
        orc19withplatform.start();
        orc20withplatform.start();
        orc21withplatform.start();
        orc22withplatform.start();
        orcwithknife.start();
        moveisland(250,platform28);
        moveisland(-250,platform29);
        moveisland(350,platform30);
        moveisland(-550,platform31);
        moveisland(150,platform32);
        moveisland(250,platform33);
        moveisland(-225,platform34);

        finished();
        saveme.setOpacity(0);
        movecoin1.setOpacity(0);
        reviveorc.setOpacity(0);
        revivenobutton.setOpacity(0);
        reviveyesbutton.setOpacity(0);
        revivepane2.setOpacity(0);
        openchest1.setOpacity(0);
        openchest2.setOpacity(0);
        openchest3.setOpacity(0);
        openchest4.setOpacity(0);
        openchest5.setOpacity(0);
        openchest6.setOpacity(0);
        openchest7.setOpacity(0);
        openchest8.setOpacity(0);
        wonpane.setOpacity(0);
        toofast.setOpacity(0);
        rotatebigcoin();
//
    }
    public void rotatebigcoin(){
        RotateTransition rt=new RotateTransition();
        rt.setNode(bigcoin);
        rt.setByAngle(360);
        rt.setCycleCount(TranslateTransition.INDEFINITE);
        rt.setDuration(Duration.millis(4000));
        rt.play();
    }
    public void checkherowon(){
        if(hero.getBoundsInParent().getCenterX()>41500){
            highscore h=new highscore();
            try {
                h = h.derialise();
            }
            catch(Exception e){

            }
            String youwon="                                 YOU WON!!!!!\n\n";

            String fast="YOU WERE TOO FAST, YOUR SCORE GETS DOUBLED\n\n";
            String yourscore="YOUR SCORE:   ";
            String yourscoreint=Integer.toString(will.getScore());
            String highscore="HIGH SCORE:   ";
            String highscoreint=Integer.toString(h.getHighscore());
            String fullscorelabel=yourscore+yourscoreint+"       "+highscore+highscoreint+"\n";
            String total=youwon+fast;
            if(timeelapsed<=120) {
                will.setScore(2*(8 * will.getCoin().getCoinVal() + will.getstep()));

                toofast.setText(youwon+fast+fullscorelabel);

                toofast.setOpacity(1);
                wonpane.setOpacity(1);

            }
            else{
                will.setScore(2*(8 * will.getCoin().getCoinVal() + will.getstep()));
                toofast.setText(youwon+fullscorelabel);
                toofast.setOpacity(1);
                wonpane.setOpacity(1);

            }

            if(will.getScore()>h.getHighscore()){
                h.setHighscore(will.getScore());
            }
            try{
                h.serialise();
            }
            catch(Exception e){

            }

            wonpane.setOpacity(1);

        }
    }
    public void orcjump(ImageView orc){
        TranslateTransition trans1=new TranslateTransition();
        Node image1=orc;
        trans1.setNode(image1);
        trans1.setDuration(Duration.millis((800-orc.getY())*3.5));
        // trans.setCycleCount(2);
        trans1.setByY(800-orc.getY());
        //trans.setAutoReverse(true);
        trans1.play();
    }
    public void moverevive(Node s){
        TranslateTransition mc=new TranslateTransition();
        mc.setNode(s);
        mc.setDuration(Duration.millis(300));
        mc.setByX(299.5);
        mc.play();
    }
    public void moveright(KeyEvent keyEvent){
        if(keyEvent.getText().equals("d")){
            moverevive(revivepane2);
            moverevive(background);
            moverevive(saveme);
            moverevive(timer);


            TranslateTransition mc=new TranslateTransition();
            mc.setNode(movecoin);
            mc.setDuration(Duration.millis(300));
            mc.setByX(300);
            mc.play();

            TranslateTransition cc=new TranslateTransition();
            cc.setNode(coincounter);
            cc.setDuration(Duration.millis(300));
            cc.setByX(300);
            cc.play();
            TranslateTransition sc=new TranslateTransition();
            sc.setNode(stepcounter);
            sc.setDuration(Duration.millis(300));
            sc.setByX(300);
            sc.play();
            if(herodead==0) {
                incrementstepcounter();
                TranslateTransition trans = new TranslateTransition();
                Node image = hero;
                trans.setNode(image);
                trans.setDuration(Duration.millis(300));
                trans.setByX(300);
                trans.play();

                RotateTransition rax = new RotateTransition();
                rax.setNode(axe);
                rax.setDuration(Duration.millis(300));
                rax.setCycleCount(2);
                rax.setByAngle(360);
                rax.play();
//
                TranslateTransition k1 = new TranslateTransition();
                k1.setNode(knife1);
                k1.setDuration(Duration.millis(300));
                k1.setByX(450);
                k1.setOnFinished(e -> kfinish(knife1));
                k1.play();
                TranslateTransition k2 = new TranslateTransition();
                k2.setNode(knife2);
                k2.setDuration(Duration.millis(100));
                k2.setByX(100);
                k2.setOnFinished(e -> knife2finished());
                k2.play();
                TranslateTransition k3 = new TranslateTransition();
                k3.setNode(knife3);
                k3.setDuration(Duration.millis(200));
                k3.setByX(200);
                k3.setOnFinished(e -> knife3finished());
                k3.play();

                TranslateTransition ax = new TranslateTransition();
                ax.setNode(axe);
                ax.setDuration(Duration.millis(300));
                ax.setByX(450);
                ax.setOnFinished(e -> axreturn());
                ax.play();

                SequentialTransition sq = new SequentialTransition(ax);
            }

    }}
    public void moveright(){
            moverevive(revivepane2);

            TranslateTransition mc=new TranslateTransition();
            mc.setNode(movecoin);
            mc.setDuration(Duration.millis(300));
            mc.setByX(300);
            mc.play();

            TranslateTransition cc=new TranslateTransition();
            cc.setNode(coincounter);
            cc.setDuration(Duration.millis(300));
            cc.setByX(300);
            cc.play();
            TranslateTransition sc=new TranslateTransition();
            sc.setNode(stepcounter);
            sc.setDuration(Duration.millis(300));
            sc.setByX(300);
            sc.play();
            if(herodead==0) {
                incrementstepcounter();
                TranslateTransition trans = new TranslateTransition();
                Node image = hero;
                trans.setNode(image);
                trans.setDuration(Duration.millis(300));
                trans.setByX(300);
                trans.play();

                RotateTransition rax = new RotateTransition();
                rax.setNode(axe);
                rax.setDuration(Duration.millis(300));
                rax.setCycleCount(2);
                rax.setByAngle(360);
                rax.play();

                TranslateTransition k1 = new TranslateTransition();
                k1.setNode(knife1);
                k1.setDuration(Duration.millis(300));
                k1.setByX(450);
                k1.setOnFinished(e -> kfinish(knife1));
                k1.play();
                TranslateTransition k2 = new TranslateTransition();
                k2.setNode(knife2);
                k2.setDuration(Duration.millis(100));
                k2.setByX(100);
                k2.setOnFinished(e -> knife2finished());
                k2.play();
                TranslateTransition k3 = new TranslateTransition();
                k3.setNode(knife3);
                k3.setDuration(Duration.millis(200));
                k3.setByX(200);
                k3.setOnFinished(e -> knife3finished());
                k3.play();

                TranslateTransition ax = new TranslateTransition();
                ax.setNode(axe);
                ax.setDuration(Duration.millis(300));
                ax.setByX(450);
                ax.setOnFinished(e -> axreturn());
                ax.play();

                SequentialTransition sq = new SequentialTransition(ax);
            }

    }
    public void kfinish(ImageView knife){
        double r=hero.getBoundsInParent().getCenterX();
        knife.setTranslateX(r-255);
    }
    public void knife2finished(){
        TranslateTransition k1=new TranslateTransition();
        k1.setNode(knife2);
        k1.setDuration(Duration.millis(300));
        k1.setByX(450);
        k1.setOnFinished(e->kfinish(knife2));
        k1.play();
    }
    public void knife3finished(){
        TranslateTransition k1=new TranslateTransition();
        k1.setNode(knife3);
        k1.setDuration(Duration.millis(300));
        k1.setByX(450);
        k1.setOnFinished(e->kfinish(knife3));
        k1.play();
    }
    public void axreturn(){

        double r=hero.getBoundsInParent().getCenterX();

        axe.setTranslateX(r-255);


    }
    public void moveisland(int r,ImageView img){
        TranslateTransition t1=new TranslateTransition();
        t1.setNode(img);
        t1.setByY(r);
        t1.setAutoReverse(true);
        if(r<0){
            r=r*(-1);
        }
        t1.setDuration(Duration.millis(50*r));
        t1.setCycleCount(TranslateTransition.INDEFINITE);
        t1.play();

    }

    public void checkheroposition(Scene node){


    }


}

