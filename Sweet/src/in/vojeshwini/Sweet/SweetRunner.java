package in.vojeshwini.Sweet;

public class SweetRunner {
    public static void main(String[] args){

        Sweet sweet=new Sweet();

        Variety variety=new Variety(sweet);
        variety.barfi();
    }
}
