package sample;

import javafx.animation.TranslateTransition;
import javafx.util.Duration;

public class Knives extends Weapon{
    @Override
    public void Throw() {
        TranslateTransition t1=new TranslateTransition();
        t1.setNode(this.getImage());
        t1.setByX(150);
        t1.setDuration(Duration.millis(100));
        t1.play();
    }
}
