import java.util.*;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        int[] result = new int[duplicates.size()];
        int i = 0;
        for (int num : duplicates) {
            result[i++] = num;
        }

        return result;
    }
}
