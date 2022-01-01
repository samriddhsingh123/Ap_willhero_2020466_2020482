package sample;

import java.io.*;

public class highscore implements Serializable {
    int highscore=0;
    highscore(){

    }
    public void setHighscore(int r){
        highscore=r;
    }
    public int getHighscore(){
        return highscore;
    }
    public void serialise() throws IOException {
        FileOutputStream fout=new FileOutputStream("highscore.txt");
        ObjectOutputStream Out=new ObjectOutputStream(fout);
        Out.writeObject(this);
        Out.close();
        fout.close();
    }
    public highscore derialise() throws IOException,ClassNotFoundException, FileNotFoundException {
        highscore r;
        try {

            FileInputStream fileInputStream = new FileInputStream("highscore.txt");
            ObjectInputStream in = new ObjectInputStream(fileInputStream);
            r = (highscore) in.readObject();

            in.close();
            fileInputStream.close();
        }
        catch (FileNotFoundException e){
            return new highscore();
        }
        catch(NullPointerException e){
            return new highscore();
        }
        return r;

    }
}
