package sample;

import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class Axe extends Weapon{
    @Override
    public void Throw() {
        TranslateTransition axe=new TranslateTransition();
        axe.setNode((Node)this.getImage());
        axe.setDuration(Duration.millis(300));
        axe.setByX(150);
        axe.play();

    }
}
