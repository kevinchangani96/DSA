package String;

public class equal_digits_and_chars13 {
    public static void main(String[] args) {
        String s="kevin96388";
        int counter =0;
        s=s.replaceAll("\\d","-");
        char[] arr=s.toCharArray();
        for (int i=0;i<arr.length;i++){
            if (arr[i]=='-'){
                counter++;

            }

        }
        int character=s.length()-counter;
        if (character==counter){
            System.out.println("same");
            return;
        }
        else {
            System.out.println("not same");
            return;
        }
    }
}
