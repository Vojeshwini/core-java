package in.voj.KeyChain;

public class KeyChain {
    private String type="doll";
    private int price=20;
    private String material="doll";
    private String mfd_in="India";
    private String mdf_date="april 2";


    public KeyChain(){
        System.out.println("KEY CHAINN....................");

    }

    public void setter(String type){
        this.type=type;
    }

    public String getter(){

        return this.type;

    }


}
