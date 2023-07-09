package week6_tasks;
/*Array -- Find Maximum
Write a method that can find the maximum number from an int Array
*/

public class FindMaximum {

    public static int findMaximum(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            // If the current number is greater than max, set max to the current number
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println(findMaximum(numbers));    // 5
    }

}

