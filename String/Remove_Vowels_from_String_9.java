package String;

public class Remove_Vowels_from_String_9 {
    public static void main(String[] args) {
        String s = "kevin";
        String s1= "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                continue;
            }
            s1 = s1 + ch;
        }

            System.out.println(s1);
            }

        }


