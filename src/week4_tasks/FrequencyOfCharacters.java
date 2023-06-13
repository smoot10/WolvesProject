package week4_tasks;
/*1. Frequency of Characters
        Write a return method that can find the frequency of characters
        Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/


public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "AAABBCDD";
        System.out.println(frequencyOfChars(str));
    }

    public static String frequencyOfChars(String str) {
        String result = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
                count++;
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
                result += count;
            }
        }
        return result;
    }


}

