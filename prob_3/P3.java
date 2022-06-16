/**
 * Problem:
 * Mask personal information: create a function that 
 * takes a String as input and returns it partly obfuscated. 
 * The function only recognizes emails and phone numbers, 
 * any other String that doesn’t match these types results in an error.
 */
package prob_3;

import java.util.regex.Pattern;

public class P3 {
    // check for valid email pattern
    public boolean checkEmail(String str) {
        return Pattern
                .compile(
                        "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$")
                .matcher(str)
                .matches();
    }

    // check for valid phone number pattern
    public boolean checkPhone(String str) {
        return Pattern
                .compile(
                        "^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3,4}$")
                .matcher(str)
                .matches();
    }

    // obfuscate email
    public String email(String str) {
        str = str.toLowerCase();
        String[] emailParts = str.split("@");
        int lenLocalPart = emailParts[0].length();
        String ret = emailParts[0].charAt(0) + "*****" + emailParts[0].charAt(lenLocalPart - 1) + "@" + emailParts[1];
        return ret;
    }

    // obfuscate phone number
    public String phone(String str) {
        str = str.replace(" ", "-");
        char[] digits = str.toCharArray();
        int numCount = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == '-' || digits[i] == '+') {
                continue;
            }
            if (numCount < 4) {
                if (Character.isDigit(digits[i])) {
                    numCount++;
                }
            } else {
                // replace all digits except last 4 with '*'
                digits[i] = '*';
            }
        }
        String ret = String.valueOf(digits);
        return ret;
    }

    public String obfuscate(String str) {
        String ret;
        if (checkEmail(str)) {
            ret = email(str);
        } else if (checkPhone(str)) {
            ret = phone(str);
        } else {
            // return error if neither email nor phone number
            ret = "error";
        }
        return ret;
    }

}
