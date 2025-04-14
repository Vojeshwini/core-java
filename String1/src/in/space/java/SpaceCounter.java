package in.space.java;
public class SpaceCounter {
    public static void main(String[] args) {
        String sentence = "Believe in yourself and all that you are. Know that there is something inside you that is greater than any obstacle.";
        int spaceCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        System.out.println("total spaces: " + spaceCount);
    }
}
