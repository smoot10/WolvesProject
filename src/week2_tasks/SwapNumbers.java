package week2_tasks;
//Swap two variable value without using a third variable
public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: a = " + a + " and b = " + b);
        a = a + b; // a = 30
        b = a - b; // b = 10
        a = a - b; // a = 20
        System.out.println("After swapping: a = " + a + " and b = " + b);
    }


}
