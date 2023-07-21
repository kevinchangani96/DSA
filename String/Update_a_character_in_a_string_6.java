package String;

public class Update_a_character_in_a_string_6 {
    public static void main(String[] args) {
        String s = "kevin";
        char[] c = s.toCharArray();


        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'e') {
                c[i] = 'a';
            }
        }
        s = new String(c);
        System.out.println(s);
    }
}
