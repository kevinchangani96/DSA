package String;

public class reverse_a_String_1 {

        public static void main(String[] args) {
//                String s1 = "abcba";
//                char[] arr = s1.toCharArray();
//                int left = 0, right = s1.length()-1;
//                while (left < right){
//                    char temp = arr[left];
//                    arr[left] = arr[right];
//                    arr[right] = temp;
//                    left++;
//                    right--;
//                }
//                s1 = new String(arr);
//                System.out.println(s1);

            String s = "Hello how are you Contestant"; int  k = 4;
            String[] c = s.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<k; i++){
                sb.append(c[i]);
                sb.append(" ");
            }
            System.out.println(sb.toString());


        }
        }




