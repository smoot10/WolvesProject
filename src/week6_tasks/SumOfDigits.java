package week6_tasks;
/*String -- sum of digits in a string
        Write a method that can return the sum of the digits in a string

 */
public class SumOfDigits {

    public static int sumOfDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            // If the current character is a digit, add it to sum
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(str.charAt(i) + "");
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits("a1b2c3"));    // 6
        System.out.println(sumOfDigits("12345"));     // 15
        System.out.println(sumOfDigits("abcd"));      // 0
    }

}

