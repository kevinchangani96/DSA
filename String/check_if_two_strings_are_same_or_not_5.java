package String;

public class check_if_two_strings_are_same_or_not_5 {
    public static void main(String[] args) {
        String s = "kevin";
        String s1 = "kevin";
        if (s.length() != s1.length()) {
            System.out.println("not same");
        } else {
            boolean same = true;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != s1.charAt(i)) {
                    same = false;
                    break;
                }
            }
            if (same) {
                System.out.println("same");
            } else {
                System.out.println("not same");
                }
            }
        }
    }



