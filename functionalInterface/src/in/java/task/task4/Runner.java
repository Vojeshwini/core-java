package in.java.task.task4;
public interface NumberCheckDemo {

    public static void main(String[] args) {

        // Anonymous class implementation
        NumberChecker evenCheckerAnonymous = new NumberChecker() {
            @Override
            public boolean check(int number) {
                return number % 2 == 0;
            }
        };

        System.out.println("Is 4 even? " + evenCheckerAnonymous.check(4)); // true
    }
}