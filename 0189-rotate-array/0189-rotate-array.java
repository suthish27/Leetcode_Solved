import java.util.*;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

        // Rotate the list only once
        Collections.rotate(list, k);

        // Copy rotated list back to the array
        for (int i = 0; i < n; i++) {
            nums[i] = list.get(i);
        }

        System.out.println(list); // Optional: just for debugging
    }
}
