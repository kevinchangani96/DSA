package String;

public class Print_frequency_characters_in_string_8 {
    public static void main(String[] args) {
        String s = "kevinn";
        s = s.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int c = 0;
            for (int i = 0; i < s.length(); i++) {
                if (ch == s.charAt(i)) {
                    c++;
                    System.out.println(ch + " " + c);
                }

            }
        }
    }


}
