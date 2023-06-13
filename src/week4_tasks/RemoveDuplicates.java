package week4_tasks;
//3. Remove Duplicates
//Write a return method that can remove the duplicated values from String
//  Ex: removeDup("AAABBBCCC") ==> ABC
public class RemoveDuplicates {

    public static void main(String[] args) {
        String str = "AAABBBCCC";
        System.out.println(removeDup(str));
    }

    public static String removeDup(String str) {
        String result = "";

         // Iterate over each character in the input string

        for (int i = 0; i < str.length(); i++) {
            // Check if the current character is not already present in the result string
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
                // Append the character to the result string
            }
        }
        return result;
    }

}
