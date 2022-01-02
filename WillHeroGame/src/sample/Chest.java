package sample;

import javafx.scene.Node;
import javafx.scene.image.Image;

import javax.swing.text.Element;
import javax.swing.text.html.ImageView;
import java.io.Serializable;

public abstract class Chest implements Serializable {
    private Position pos;
    private Dimension dim;
    private Node img;
    private static long serialVersionUID;

    public void setImg(Node img){
        this.img=img;
    }
    public Node getImg(){
        return img;
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
    public void OpenChest(){
        Image i=new Image("sample/Images2/ChestOpen.png");
        ImageView v=new ImageView((Element) i);
    }
    public void touch(Hero r){
        if(this.getImg().getBoundsInParent().intersects(r.getImage().getBoundsInParent())){
            OpenChest();
        }
    }
}
