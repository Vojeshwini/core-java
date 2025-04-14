package com.in.duplicate;
//display the frequency of the each word
public class words {
    public static void main(String[] args) {
        String sentence = "Believe in yourself and all that you are. Know that there is something inside you that is greater than any obstacle";
        String[] words = sentence.split(" ");


        for (int i = 0; i < words.length; i++) {
            int count = 1;


            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "";
                }
            }


            if (!words[i].equals("")) {
                System.out.println(words[i] + ": " + count);
            }
        }
    }
}
