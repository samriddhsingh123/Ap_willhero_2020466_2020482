package sample;

import javax.swing.text.html.ImageView;
import java.awt.*;
import java.io.Serializable;

public class Island implements Serializable {
    private ImageView island_image;
    private int IslandNumber;
    private Position pos;
    private Dimension dim;
    private static long serialVersionUID;
    private static int counter=0;
    private String id="";
    Island(){
        counter++;
        setIslandNumber(counter);
    }
    public void setId(String id){
        id=id;
    }
    public String getId(){
        return id;
    }
    public void setIsland_image(ImageView isl){
        island_image=isl;
    }
    public ImageView getIsland_image(){
        return island_image;
    }
    public int getIslandNumber() {
        return IslandNumber;
    }

    public void setIslandNumber(int islandNumber) {
        IslandNumber = islandNumber;
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
