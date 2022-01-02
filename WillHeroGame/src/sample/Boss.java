package sample;

import javafx.animation.TranslateTransition;
import javafx.util.Duration;

public class Boss extends Orcs{
    public void collide(Hero r){
        if(this.getImage().getBoundsInParent().intersects(r.getImage().getBoundsInParent())){
            super.MoveHorizontal();
        }
    }
    @Override
    public void jump(){
        TranslateTransition t1=new TranslateTransition();
        t1.setNode(this.getImage());
        t1.setByY(100);
        t1.setDuration(Duration.millis(150));
        t1.play();
    }

}
