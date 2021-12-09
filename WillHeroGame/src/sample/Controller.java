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

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLOutput;
import java.sql.Time;
import java.util.ResourceBundle;

public class Controller implements Initializable {

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
    private Button pauseButton;
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

    private Stage stage;
    private Scene scene;
    private Parent root;

    //    public void switchToScene1(ActionEvent event) throws IOException {
//        root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
//        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }
    public void switchToGame(ActionEvent event) throws IOException {
        FXMLLoader ld=new FXMLLoader(getClass().getResource("sample.fxml"));
        root=ld.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Controller cont=ld.getController();
        stage.setTitle("Will Hero");
        scene=new Scene(root,1100,800);
        Camera camera = new PerspectiveCamera();
        scene.setCamera(camera);
        stage.setScene(scene);
        scene.setOnKeyPressed(new EventHandler<javafx.scene.input.KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getText().equals("d")) {
                    hero.setX(hero.getX() + 300);
                    camera.translateXProperty().set(camera.translateXProperty().getValue() + 300);

                }
                if(keyEvent.getText().equals("p")){
                    try{pause(stage);}
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }

        });


        stage.show();
    }
    public void switchToMainMenu(ActionEvent event) throws IOException {

        root = FXMLLoader.load(getClass().getResource("/sample/MainMenu.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root,1100,800);
        stage.setScene(scene);
        stage.show();
    }
    //    Timeline tl=new Timeline(new KeyFrame(Duration.millis(10), new EventHandler<ActionEvent>() {
//        @Override
//        public void handle(ActionEvent actionEvent) {
//            checkCollision(platform1);
//
//
//        }
//    }));
    public void pause(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("pauseDestination.fxml"));
        scene = new Scene(root,1100,800);
        stage.setTitle("Will Hero");
        stage.setScene(scene);
        stage.show();
    }
    public void checkCollision(ImageView platform){
        if(hero.getBoundsInParent().intersects(platform.getBoundsInParent())) {
            TranslateTransition trans=new TranslateTransition();
            Node image=hero;
            trans.setNode(image);
            trans.setDuration(Duration.millis(1000));
            trans.setCycleCount(TranslateTransition.INDEFINITE);
            trans.setByY(-100);
            trans.setAutoReverse(true);
            trans.play();
        }}
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        checkCollision(platform1);
        orcjump(orc1);
        orcjump(orc2);
        orcjump(orc3);
        orcjump(orc4);
        orcjump(orc5);
        orcjump(orc6);
        orcjump(orc7);
        orcjump(orc8);
        orcjump(orc9);
        orcjump(orc10);
        orcjump(orc11);
        orcjump(orc13);
        orcjump(orc14);
        orcjump(orc15);
        orcjump(orc16);
        orcjump(orc17);
        orcjump(orc18);
        orcjump(orc19);
        orcjump(orc20);
        orcjump(orc21);
        orcjump(orc22);


    }
    public void orcjump(ImageView orc){
        TranslateTransition trans=new TranslateTransition();
        Node image=orc;
        trans.setNode(image);
        trans.setDuration(Duration.millis(900));
        trans.setCycleCount(TranslateTransition.INDEFINITE);
        trans.setByY(-90);
        trans.setAutoReverse(true);
        trans.play();
    }
    public void moveright(KeyEvent keyEvent){
//        pauseButton.setX(pauseButton.getX()+96);
       // pauseButton.setLayoutX(pauseButton.getLayoutX()+96);
           // pauseButton.setTranslateX(pauseButton.getTranslateX()+96);
        if(keyEvent.getText().equals("d")) {
            hero.setX(hero.getX() + 300);
        }
    }
}

