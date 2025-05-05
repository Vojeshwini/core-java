package in.java.task.task8;
public class Runner {

    public static void convertAndPrint(String[] strings, StringConverter converter) {
        for (String s : strings) {
            System.out.println(converter.convert(s));
        }
    }

    public static void main(String[] args) {
        String[] words = {"hello", "Java", "WORLD"};

        System.out.println("Uppercase:");
        convertAndPrint(words, s -> s.toUpperCase());

        System.out.println("\nLowercase:");
        convertAndPrint(words, s -> s.toLowerCase());

        System.out.println("\nReversed:");
        convertAndPrint(words, s -> new StringBuilder(s).reverse().toString());
    }
}

