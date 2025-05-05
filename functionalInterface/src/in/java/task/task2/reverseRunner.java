package in.java.task.task2;


public class reverseRunner {
    public static void main(String[] args) {

    ReverseString reverseString=new ReverseString() {
        @Override
        public void string() {
            String input="hello how are you";

            char[] charecters=input.toCharArray();
            for(int i= charecters.length-1;i>=0;i--){
                System.out.print(charecters[i]);
            }


        }

    };

        reverseString.string();
}
}
