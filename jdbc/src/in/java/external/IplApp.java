package in.java.external;
import in.java.internal.*;



public class IplApp {
    private Jdbc jdbc;
    public IplApp(Jdbc jdbc){
        this.jdbc=jdbc;
    }

    public void saveTeam(){
        System.out.println("running the saveTeam in IplApp");
        if(this.jdbc!= null){
            this.jdbc.save();
        }else {
            System.err.println("this is null");
        }


    }

}
