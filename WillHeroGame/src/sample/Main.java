package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Camera;
import javafx.scene.Parent;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.text.html.ImageView;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

//        FXMLLoader ld=new FXMLLoader(getClass().getResource("sample.fxml"));
//        Parent root=ld.load();
//        Controller cont=ld.getController();
//        primaryStage.setTitle("Will Hero");
//        Scene scene=new Scene(root,600,600);
//        Camera camera = new PerspectiveCamera();
//        scene.setCamera(camera);
//        primaryStage.setScene(scene);
//        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
//            @Override
//            public void handle(KeyEvent keyEvent) {
//                cont.moveright();
//                camera.translateXProperty().set(camera.translateXProperty().getValue()+70);
//            }
//        });
//
//
//        primaryStage.show();
//    }
        try {
            Hero t=new Hero();
            t.serialise();
            Parent r = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
            Scene scene = new Scene(r,1100,800);
//            scene.getStylesheets().add(String.valueOf(getClass().getResource("application.css")));
            Image im = new Image("/sample/png2jpg/gameIcon.jpg");
            stage.setScene(scene);
           // stage.initStyle(StageStyle.TRANSPARENT);
            stage.getIcons().add(im);
            stage.setTitle("Will Hero");

            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {

        launch(args);

    }
}
