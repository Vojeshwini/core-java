package in.java.task.task7;
public class StringFilterWithInterface {

    public static void main(String[] args) {
        String[] strings = {"apple", "dog", "banana", "elephant", "cat"};
        int minLength = 5;


        StringCondition condition = s -> s.length() > minLength;


        System.out.println("Strings longer than " + minLength + " characters:");
        for (String s : strings) {
            if (condition.check(s)) {
                System.out.println(s);
            }
        }
    }
}
