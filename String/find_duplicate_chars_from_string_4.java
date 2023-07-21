package String;

    public class find_duplicate_chars_from_string_4 {
        public static void main(String[] args) {
            String str = "naman is a naman";
            int arr[] = new int[128];
            int n = str.length();
            for (int i = 0; i < n; i++) {
                int ascii = (int) str.charAt(i);
                if (arr[ascii] == 0) {
                    arr[ascii] = arr[ascii] + 1;
                } else if (arr[ascii] == 1) {
                    arr[ascii] = arr[ascii] + 1;
                    char c = str.charAt(i);
                    System.out.print(c);
                }
            }
        }
    }


