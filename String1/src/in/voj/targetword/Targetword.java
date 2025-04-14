package in.voj.targetword;
//find the target word is present in the given sentence present or not
public class Targetword {
    public static void main(String[] args){
        String sentence = "Believe in yourself and all that you are. Know that there is something inside you that is greater than any obstacle.";
        String target = "something";

        if (sentence.contains(target)) {
            System.out.println("The word is present in the sentence.");
        } else {
            System.out.println("The word is not present in the sentence.");
        }
    }
}