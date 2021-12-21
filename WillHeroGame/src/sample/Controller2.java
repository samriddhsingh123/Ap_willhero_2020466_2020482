package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller2 {
    private Stage stage;
    private Scene scene;
    private Parent root;
    private Button Start;
    @FXML
    private Button closeButton;
    public void switchToScene1(ActionEvent event) throws IOException {
        FXMLLoader ld=new FXMLLoader(getClass().getResource("sample.fxml"));
        root=ld.load();
        Controller cont=ld.getController();
        cont.switchToGame(event);
    }
    @FXML
    public void handleCloseButtonAction(ActionEvent event) {
        this.stage = (Stage)this.closeButton.getScene().getWindow();
        this.stage.close();
    }

    public void exitToMainMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root,1100,800);
        stage.setTitle("Will Hero");
        stage.setScene(scene);
        stage.show();
    }
    public void resumeCurrent(ActionEvent event) throws IOException {
        FXMLLoader ld=new FXMLLoader(getClass().getResource("sample.fxml"));
        root=ld.load();
        Controller cont=ld.getController();
        cont.switchToGame(event);
    }

    public void OpenCredit(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/CreditScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Will Hero");
        scene = new Scene(root,1100,800);
        stage.setScene(scene);
        stage.show();
    }
    public void GoToExit(ActionEvent event) throws IOException {
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("/sample/exit.fxml"));
        this.stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        this.scene = new Scene(root,1100,800);
        this.stage.setScene(this.scene);
        this.stage.show();
    }
}
