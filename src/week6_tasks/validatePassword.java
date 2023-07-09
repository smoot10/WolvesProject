package week6_tasks;

import java.util.regex.Pattern;

public class validatePassword {

        public static boolean validatePassword(String password) {
            // Check the length and presence of spaces
            if (password.length() < 6 || password.contains(" ")) {
                return false;
            }

            // Check for at least one uppercase letter
            if (!password.matches(".*[A-Z].*")) {
                return false;
            }

            // Check for at least one lowercase letter
            if (!password.matches(".*[a-z].*")) {
                return false;
            }

            // Check for at least one special character
            if (!Pattern.matches(".*[!@#$%^&*(),.?\":{}|<>].*", password)) {
                return false;
            }

            // Check for at least one digit
            if (!password.matches(".*\\d.*")) {
                return false;
            }

            // If all requirements are met, return true
            return true;
        }

        public static void main(String[] args) {
            System.out.println(validatePassword("Abc@123"));     // true
            System.out.println(validatePassword("password"));    // false
            System.out.println(validatePassword("123456"));     // false
            System.out.println(validatePassword("Abcdef"));     // false
            System.out.println(validatePassword("Abc@"));       // false
        }
    }


   /* In this Java implementation, the validatePassword method takes a password string as input and returns true if all the requirements are met, otherwise it returns false. The method uses a combination of string manipulation and regular expressions to validate each requirement individually. The main method demonstrates the usage of the validatePassword method with some example passwords.







    */
