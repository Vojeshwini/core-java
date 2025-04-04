package in.java.Earbuds;

import java.util.Objects;

public class EarDamage {
    public EarDamage(Earbuds earbuds){
        System.out.println("Earbuds cause Ear damage");
        if(Objects.nonNull(earbuds)) {
            earbuds.clean();
        }
        else
        {
            System.out.println("Null values Occur");
        }
    }
    public void damage(){
        System.out.println("Running in Damage ");
    }


}
