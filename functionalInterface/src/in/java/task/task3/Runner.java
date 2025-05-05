package in.java.task.task3;
public class StringFilter {

    public static void printMatchingStrings(String[] strings, StringChecker checker) {
        for (String s : strings) {
            if (checker.check(s)) {
                System.out.println(s);
            }
        }
    }


    public static void main(String[] args) {
        String[] words = {"apple", "banana", "avocado", "berry", "apricot"};


        printMatchingStrings(words, s -> s.startsWith("a"));


        printMatchingStrings(words, s -> s.contains("e"));
    }
}
