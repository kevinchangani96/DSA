package String;

public class Reverse_Words_in_a_String {
    public static void main(String[] args) {
        String str = "kevin changani";
        str = str.trim();
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = word(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

    }


    public static String word(String str) {
        char[] arr = str.toCharArray();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        str = new String(arr);
        return str;
    }
}


