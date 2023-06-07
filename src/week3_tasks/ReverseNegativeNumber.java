package week3_tasks;

/*Reverse negative number
 Write a return method that can reverse negative number and return it as int.
 For example, N = -215:
 OutPut: -512
```

*/
public class ReverseNegativeNumber {
    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(-215));
    }
    public static int reverseNegativeNumber(int number){
        int reverse = 0;
        while (number != 0){
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
    }

}
/*
The code defines a class called ReverseNegativeNumber.

In the main method, it calls the reverseNegativeNumber method and passes -215 as an argument. It then prints the result.

The reverseNegativeNumber method takes an integer number as input and returns an integer as the result.

Inside the method, a variable reverse is initialized to 0. This variable will store the reversed number.

The method uses a while loop to reverse the number. The loop continues until the number becomes 0.

Inside the loop, the current last digit of the number is obtained using the expression number % 10. This digit is then appended to the reverse variable by multiplying it by 10 and adding it.

The number is then divided by 10 using the expression number /= 10. This removes the last digit from the number, and the loop continues with the remaining digits.

Once the loop completes and the number becomes 0, the method returns the reverse variable, which contains the reversed number.

In this code, the method reverses the number -215. It extracts the digits one by one, starting from the last digit, and constructs the reversed number by appending the digits. The method then returns the reversed number, which is printed in the main method.
 */

