package in.java.tank;

public class Tank {
    private String name="water";
    private int ltr=400;
    private int avlbe=200;
    private int height=44;
    private int widht=50;

    public Tank(){
        System.out.println("running nsode the Tank");
    }
    void setName(String name){
        this.name=name;
    }
    void setLtr(int ltr){
        this.ltr=ltr;
    }
    void setAvlbe(int avlbe){
        this.avlbe=avlbe;
    }
    void setHeight(int height){
        this.height=height;
    }
    void setWidht(int widht){
        this.widht=widht;
    }

    public String getName(){
        return this.name;
    }
    public int getLtr(){
        return this.ltr;
    }
    public int getAvlbe(){
        return this.avlbe;
    }
    public int getHeight(){
        return this.height;
    }
    public int getWidht(){
        return this.widht;
    }
}



