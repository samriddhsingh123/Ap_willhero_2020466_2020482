package sample;

import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class fallingplatform extends Obstacle{
    public void fall(fallingplatform f){
        TranslateTransition k=new TranslateTransition();
        k.setNode((Node) f.getImage());
        k.setByY(100);
        k.setDuration(Duration.millis(100));
        k.play();
    }


}
