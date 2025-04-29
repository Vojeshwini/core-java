public class Main {
    public static void main(String[] args) {
        String input = "RCB will win the match";
        String[] word = input.split(" ");
        for (String words : word) {
            if (words.equals("win") || words.equals("the")) {

                char[] wrd=words.toCharArray();
                for(int i=wrd.length-1;i>=0;i--){
                    System.out.print(wrd[i]);
                }
            }else
            {
                System.out.print(words);
            }
            System.out.print(" ");
        }
    }
}
