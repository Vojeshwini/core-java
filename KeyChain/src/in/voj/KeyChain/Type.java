package in.voj.KeyChain;

public class Type {

        public void run() {
                KeyChain keychain = new KeyChain();

               System.out.println("type:"+keychain.getter());
               keychain.setter("wooden");
               System.out.println("type:"+ keychain.getter());


        }
}
