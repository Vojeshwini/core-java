package in.java.countwords;
//count the number of words present in a given sentence
public class CountWords {
    public static void main(String[] args) {
        String sentence = "Hello, everyone today  is a beautiful day";
        String[] words = sentence.split(" ");
        System.out.println("Num of words: " + words.length);
    }
}

