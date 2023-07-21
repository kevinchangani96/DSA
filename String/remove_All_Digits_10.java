package String;

public class remove_All_Digits_10 {
    public static void main(String[] args) {
        String s="kevin9688";
//        s =s.replaceAll("\\d","");
//        System.out.println(s);

        char[] c=s.toCharArray();
        for (char s1:c){
            if (!Character.isDigit(s1)){
                System.out.println(s1);
            }

        }
    }
}
