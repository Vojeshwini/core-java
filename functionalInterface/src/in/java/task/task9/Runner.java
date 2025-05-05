package in.java.task.task9;
public class Runner {

    public static void main(String[] args) {

        String[] strings = {"hello", "world", "java", "programming", "developer"};


        String substring = "java";


        StringFilter filter = new StringFilter() {
            @Override
            public boolean filter(String str, String substring) {
                return str.contains(substring);
            }
        };

        for (String str : strings) {
            if (filter.filter(str, substring)) {
                System.out.println(str);
            }
        }
    }
}

