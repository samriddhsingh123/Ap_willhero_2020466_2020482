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


    public void exitToMainMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root,1100,800);
        stage.setTitle("Will Hero");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void handleCloseButtonAction(ActionEvent event) {
        stage = (Stage) closeButton.getScene().getWindow();

        stage.close();
    }
    public void GoToExit(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("exit.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
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
        Parent root = FXMLLoader.load(getClass().getResource("CreditScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Will Hero");
        scene = new Scene(root,1100,800);
        stage.setScene(scene);
        stage.show();
    }

}
