package String;

public class Remove_duplicate_chars_from_string {
    public static void main(String[] args) {
        String s = "keviin";
        String s1 = "";
      
        boolean[] arr = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int ascii = (int) ch;
            if (arr[ascii]==false) {
                s1 += ch;
                arr[ascii] = true;
            }
        }
        System.out.println(s1);

        }
    }