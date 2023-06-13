package week4_tasks;
//2. Same letters
//Write a return method that check if a string is build out of the same letters as another string.
//  Ex: same("abc", "cab"); ==> true
//      same("abc", "abb"); ==> false
public class SameLetters {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cab";
        System.out.println(same(str1, str2));
    }

    public static boolean same(String str1, String str2) {
        boolean result = false;
        String temp = "";
        // Finding unique letters in str1
        for (int i = 0; i < str1.length(); i++) {
            if (!temp.contains("" + str1.charAt(i))) {
                temp += str1.charAt(i);
            }
        }
        // Checking if each letter in temp is present in str2
        for (int i = 0; i < temp.length(); i++) {
            if (str2.contains("" + temp.charAt(i))) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

}
