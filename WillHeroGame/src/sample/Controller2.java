package sample;


import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DialogEvent;
import javafx.scene.control.DialogPane;
import javafx.scene.effect.BoxBlur;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;
import java.util.logging.Logger;


public class Controller2 {
    private Stage stage;
    private Scene scene;
    private Parent root;
    private Button Start;
    @FXML
    private Button closeButton;
    @FXML
    private AnchorPane rootAnchor1;
    @FXML
    private StackPane rootStack;


    public void switchToScene1(ActionEvent event) throws IOException {
        FXMLLoader ld=new FXMLLoader(getClass().getResource("sample.fxml"));
        root=ld.load();
        Controller cont=ld.getController();
        cont.switchToGame(event);
    }
    public void loadnewgame(ActionEvent event){
        savegamevar sgv=new savegamevar();
        try {
            sgv = sgv.derialise();
        }
        catch(Exception e){

        }
        sgv.setLocation(0);
        try{
            sgv.serialise();
            switchToScene1(event);
        }
        catch(Exception e){

        }

    }
    public void loadsavedgame1(ActionEvent event){
        savegamevar sgv=new savegamevar();
        try {
            sgv = sgv.derialise();
        }
        catch(Exception e){

        }
        sgv.setLocation(1);
        try{
            sgv.serialise();
            switchToScene1(event);
        }
        catch(Exception e){

        }
    }
    public void loadsavedgame2(ActionEvent event){
        savegamevar sgv=new savegamevar();
        try {
            sgv = sgv.derialise();
        }
        catch(Exception e){

        }
        sgv.setLocation(2);
        try{
            sgv.serialise();
            switchToScene1(event);
        }
        catch(Exception e){

        }
    }
    public void loadsavedgame3(ActionEvent event){
        savegamevar sgv=new savegamevar();
        try {
            sgv = sgv.derialise();
        }
        catch(Exception e){

        }
        sgv.setLocation(3);
        try{
            sgv.serialise();
            switchToScene1(event);
        }
        catch(Exception e){

        }
    }
    public void saveprogress(ActionEvent event){
        Hero current=new Hero();
        try {
            current = current.derialise();
        }
        catch(Exception e){

        }
        savegamevar sgv=new savegamevar();
        try {
            sgv = sgv.derialise();
        }
        catch (Exception e){

        }

        if(sgv.getChoice()==1){
            try {
                current.serialise1();
            }
            catch (Exception e){

            }
            sgv.setChoice(2);
            try{
                sgv.serialise();

            }
            catch(Exception e){

            }
        }
        else if(sgv.getChoice()==2){
            try{
                current.serialise2();
            }
            catch (Exception e){

            }
            sgv.setChoice(3);
            try{
                sgv.serialise();
            }
            catch(Exception e){

            }
        }
        else if(sgv.getChoice()==3){
            try {
                current.serialise3();
            }
            catch (Exception e){

            }
            sgv.setChoice(1);
            try{
                sgv.serialise();
            }
            catch(Exception e){

            }
        }



    }
    @FXML
    public void handleCloseButtonAction(ActionEvent event) {
        this.stage = (Stage)this.closeButton.getScene().getWindow();
        this.stage.close();
    }

    public void exitToMainMenu(ActionEvent event) throws IOException {
        Hero r=new Hero();
        try {
            r.serialise();
        }
        catch(Exception e){

        }
        Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root,1100,800);
//        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setTitle("Will Hero");
        stage.setScene(scene);
        stage.show();
    }
    public void resumeCurrent(ActionEvent event) throws IOException {
//        FXMLLoader ld=new FXMLLoader(getClass().getResource("sample.fxml"));
//        root=ld.load();
        Controller cont=new Controller();
        cont.switchToGame(event);
    }

    public void OpenCredit(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/CreditScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Will Hero");
        scene = new Scene(root,1100,800);
//        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.show();

    }
    public void GoToExit(ActionEvent event) throws IOException {
        BoxBlur blur=new BoxBlur(3,3,3);
//        DialogPane d=new DialogPane();
//        Button No=new Button("NO");
//        Button Yes =new Button("YES");

//        Stage s=(Stage) rootAnchor1.getScene().getWindow();
//
//        Alert.AlertType type = Alert.AlertType.WARNING;
//        Alert alert =new Alert(type,"");
//        alert.initModality(Modality.APPLICATION_MODAL);
//        alert.initOwner(s);
//        alert.getDialogPane().setContentText("Do you really want to quit?");
//        alert.getDialogPane().setHeaderText("");
//        alert.showAndWait();
//        FadeTransition fadeTransition=new FadeTransition();
//        fadeTransition.setDuration(Duration.millis(1000));
//
//        fadeTransition.setNode(rootAnchor1);
//        fadeTransition.setFromValue(1);
//        fadeTransition.setToValue(0);
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("/sample/exit.fxml"));
        this.stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        this.scene = new Scene(root,1100,800);
//        stage.initStyle(StageStyle.TRANSPARENT);
        this.stage.setScene(this.scene);
//        rootAnchor.setEffect(blur);
        this.stage.show();

    }
    public void handlefading(){
        makefadeout();
    }
    public void makefadeout(){
        FadeTransition fadeTransition=new FadeTransition();
        fadeTransition.setDuration(Duration.millis(1000));

        fadeTransition.setNode(rootStack);
        fadeTransition.setFromValue(1);
        fadeTransition.setToValue(0);
        fadeTransition.setOnFinished((ActionEvent) ->{
            try {
                loadnextscene();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        fadeTransition.play();

    }
    public void loadnextscene() throws IOException {

            Parent secondview=(StackPane)FXMLLoader.load(getClass().getResource("scene2.fxml"));
            Scene newScene =new Scene(secondview);
            Stage curStage=(Stage)rootStack.getScene().getWindow();
            curStage.setScene(newScene);

    }

    public void OpenSavedGame(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/SavedGameWindow.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Will Hero");
        scene = new Scene(root,1100,800);
        stage.setScene(scene);
        stage.show();
    }


}
