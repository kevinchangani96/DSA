package Leetcode;

import java.util.Locale;

public class leetcode_2129_Capitalize_the_Title {
    public static void main(String[] args) {
        String s = "Kevin";

        detectCapitalUse(s);
    }


    public static boolean detectCapitalUse(String word) {
        if (word == word.toUpperCase()) {
            return true;
        }
        return false;

        }

    }




