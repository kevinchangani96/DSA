package Array;

public class first {
    public static void main(String[] args) {
        SumOfOddLengthSubarrays solution = new SumOfOddLengthSubarrays();
        int[] arr = {1, 4, 2, 5, 3};
        int result = solution.sumOddLengthSubarrays(arr);
        System.out.println("Output: " + result); // Output: 58
    }
}

class SumOfOddLengthSubarrays {
        public int sumOddLengthSubarrays(int[] arr) {
            int n = arr.length;
            int sum = 0;
            for (int length = 1; length <= n; length += 2) {
                for (int i = 0; i <= n - length; i++) {
                    for (int j = i; j < i + length; j++) {
                        sum += arr[j];
                    }
                }
            }

            return sum;
        }
    }






