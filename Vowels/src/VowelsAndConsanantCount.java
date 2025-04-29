public class VowelsAndConsanantCount {
    public static void main(String[] args) {
        String input = "Today is my day, I will do the Best";

        // Convert string to lowercase for easier comparison
        input = input.toLowerCase();

        int v_count = 0;
        int c_count = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if character is a letter
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    v_count++;
                } else {
                    c_count++;
                }
            }
        }

        System.out.println("Number of vowels: " + v_count);
        System.out.println("Number of consonants: " + c_count);
    }
}

//replace the vowels by their next consonant
//input:you are welcome
//out:ypv btf wflcpmf
//swap two string without using the 3rd variable
// covert the each word 1st letter to upper case(sentence)
//input:hello how are you
//output:HELLO HOW AREYOU


