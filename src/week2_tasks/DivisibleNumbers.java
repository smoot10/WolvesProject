package week2_tasks;
//write a program that can print the numbers 1~100 that can be divisible by 3 or 5 and 15.
//if the number is divisible by 3,5,and 15,then it should only be displayed in the 15'section.
//if the number is divisible by 3 but cannot be divisible by 15 then it should only be displayed in the 3'section.
//if the number is divisible by 5 but cannot be divisible by 15 then it should only be displayed in the 5'section.

public class DivisibleNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // if (i % 15 == 0) {
            //     System.out.println(i + " is divisible by 3, 5 and 15");
            // } else if (i % 3 == 0) {
            //     System.out.println(i + " is divisible by 3");
            // } else if (i % 5 == 0) {
            //     System.out.println(i + " is divisible by 5");
            // }
            if (i % 15 == 0) {
                System.out.println(i + " is divisible by 3, 5 and 15");
            } else if (i % 3 == 0) {
                System.out.println(i + " is divisible by 3");
            } else if (i % 5 == 0) {
                System.out.println(i + " is divisible by 5");
            }
        }



    }
}
