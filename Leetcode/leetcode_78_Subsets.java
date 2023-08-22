package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_78_Subsets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3}; // Example input array
        leetcode_78_Subsets solution = new leetcode_78_Subsets();
        List<List<Integer>> subsets = solution.subsets(nums);

        // Print the generated subsets
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, new ArrayList<Integer>(), ans);
        return ans;
    }

    void helper(int nums[], int ci, List<Integer> subset, List<List<Integer>> ans) {
        if (ci == nums.length) {
            ans.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[ci]);
        helper(nums, ci + 1, subset, ans);
        subset.remove(subset.size() - 1);
        helper(nums, ci + 1, subset, ans);
        return;
    }
}
