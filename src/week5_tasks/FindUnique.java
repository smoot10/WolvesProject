package week5_tasks;
/*String -- Find the unique
        Write a return method that can find the unique characters from the String
        Ex: unique("AAABBBCCCDEF") ==> "DEF";/
        */


public class  FindUnique {

    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        System.out.println(unique(str));
    }

    public static String unique(String str) {
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int k = 0; k < str.length(); k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    count++;
                }
            }
            if (count == 1) {
                unique += str.charAt(i);
            }
        }
        return unique;
    }


}
