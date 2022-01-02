package sample;

import javafx.scene.Node;

import javax.swing.text.html.ImageView;
import java.io.Serializable;

public class Obstacle implements Serializable {
    private Position pos;
    private Dimension dim;
    private Node img;
    private static long serialVersionUID;

    public Obstacle() {
    }
    public Node getImage(){
        return img;
    }
    public void setImage(Node r){
        img=r;
    }
    public void KillHero(Hero r){
        r.die();
    }
    public boolean touch(Hero r){
        if(this.getImage().getBoundsInParent().intersects(r.getImage().getBoundsInParent())){
            return true;
        }
        return false;
    }
    public int damage(){
        return 10;
    }

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

    public Dimension getDim() {
        return dim;
    }

    public void setDim(Dimension dim) {
        this.dim = dim;
    }


}
