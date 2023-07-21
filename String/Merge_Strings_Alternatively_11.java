package String;

public class Merge_Strings_Alternatively_11 {
    public static void main(String[] args) {
        String s = "kevin";
        String s1 = "changani";
        String s3 = "";
        int n1=s.length();
        int n2=s1.length();
        int max= Math.max(n1,n2);

        for (int i = 0; i < max; i++) {
          if (i<n1){
              s3+=s.charAt(i);
          }
            if (i<n2){
                s3+=s1.charAt(i);
            }

        }
        System.out.println(s3);
//        System.out.println(s3);
    }

}


