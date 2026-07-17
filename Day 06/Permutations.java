import java.util.*;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        // ✅ FIRST check null
        if (nums == null || nums.length == 0) return ans;

        Arrays.sort(nums); // then sort

        permutations(nums, 0, ans);
        return ans;
    }  

    private void permutations(int[] nums, int i, List<List<Integer>> ans) {

        if (i == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) temp.add(num);
            ans.add(temp);
            return;
        }

        Set<Integer> set = new HashSet<>(); // ✅ inside loop level

        for (int c = i; c < nums.length; c++) {

            if (set.contains(nums[c])) continue;

            set.add(nums[c]);

            swap(nums, i, c);
            permutations(nums, i + 1, ans);
            swap(nums, i, c); // backtrack
        }
    }

    private void swap(int[] nums, int i, int c) {
        int temp = nums[i];
        nums[i] = nums[c];
        nums[c] = temp;
    }
}