package String;

public class count_number_of_words_in_String_3 {
    public static void main(String[] args) {
        String s = "My Name is Kevin";
         int wordcounter=1;
         s=s.trim();
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)==' '){
                wordcounter++;

            }
        }

        System.out.println(wordcounter);

    }
}
