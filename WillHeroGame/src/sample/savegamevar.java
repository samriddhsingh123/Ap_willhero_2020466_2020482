package sample;

import java.io.*;

public class savegamevar implements Serializable{
    public int choice=1;
    public int location=0;
    int counter=0;
    savegamevar(){

    }
    public void setCounter(int r){
        counter=r;
    }
    public int getCounter(){
        return counter;
    }
    public void setChoice(int r){
        choice=r;
    }
    public int getChoice(){
        return choice;
    }
    public void setLocation(int r){
        location=r;
    }
    public int getLocation(){
        return location;
    }
    public void serialise() throws IOException {
        FileOutputStream fout=new FileOutputStream("savegamevar.txt");
        ObjectOutputStream Out=new ObjectOutputStream(fout);
        Out.writeObject(this);
        Out.close();
        fout.close();
    }
    public savegamevar derialise() throws IOException,ClassNotFoundException, FileNotFoundException {
        savegamevar r;
        try {

            FileInputStream fileInputStream = new FileInputStream("savegamevar.txt");
            ObjectInputStream in = new ObjectInputStream(fileInputStream);
            r = (savegamevar) in.readObject();

            in.close();
            fileInputStream.close();
        }
        catch (FileNotFoundException e){
            return new savegamevar();
        }
        catch(NullPointerException e){
            return new savegamevar();
        }
        return r;

    }
}
