package week3_tasks;

//
/*1. Prime Number         is a whole number greater than 1 that cannot be exactly divided by any whole number other than itself and 1 (e.g. 2, 3, 5, 7, 11,..).
        Write a method that can check if a number is prime or not.*/

public class PrimeNumber {

    public static void main(String[] args) {
        int n = 100;
        int count = 0;
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++){
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                count++;
                sum += i;
            }
        }
        System.out.println("There are " + count + " prime numbers from 2 to " + n);
        System.out.println("Sum of all prime numbers from 2 to " + n + " is " + sum);


    }

}

/*
Initialize variables:

n is the upper bound of the range. In this case, it is set to 100.
count keeps track of the number of prime numbers found.
sum holds the sum of all prime numbers found.
Outer loop:

The outer loop starts from 2 and iterates up to n. It considers each number within the range for prime number checking.
Inner loop:

The inner loop is responsible for checking if a number is prime.
It starts from 2 and iterates up to the square root of the current number (i).
For each iteration, it checks if the current number (i) is divisible by the loop variable (j).
If the current number is divisible by any j, it means it is not prime. In that case, the isPrime flag is set to false, and the inner loop is terminated using the break statement.
Prime number check:

After the inner loop, if isPrime is still true, it means the current number is prime.
Increment the count variable to keep track of the number of prime numbers found.
Add the current number (i) to the sum variable to calculate the sum of all prime numbers found.
Output:

After the loops complete, the code prints the count of prime numbers and the sum of all prime numbers within the range.
In this code, the prime numbers from 2 to 100 are calculated. The count variable keeps track of the number of prime numbers found, and the sum variable stores the sum of all prime numbers. Finally, the code prints the count and the sum.The code defines a class called PrimeNumber.
 */
