package in.vojeshwini.gold;

public class Bangal {
    String name;
    Gold gold;

    public Bangal(String name,Gold gold){
        this.name=name;
      this.gold=gold;

    }

    public void size(

    ){

        System.out.println("the size of bangle");
        System.out.println("name of bangal:"+this.name);
        if(gold!=null){
            gold.carrat();
        }else{
            System.out.println("not null");
        }


    }


}
