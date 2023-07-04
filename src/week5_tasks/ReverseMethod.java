package week5_tasks;
/*String -- Reverse Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA

 */

public class ReverseMethod {

    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println(reverse(str));
    }

    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += "" + str.charAt(i);
        }
        return reverse;
    }
    

}
