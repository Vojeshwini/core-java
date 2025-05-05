package in.java.task.task5;
public class IntegerFilter {

    public static void filterIntegers(int[] numbers, IntCondition condition) {
        for (int number : numbers) {
            if (condition.test(number)) {
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        System.out.println("Even numbers:");
        filterIntegers(nums, n -> n % 2 == 0);


        System.out.println("Numbers greater than 5:");
        filterIntegers(nums, n -> n > 5);
    }
}
