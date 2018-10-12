package _1_Two_Sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length; i++) {
            int cur = target - nums[i];
            if (map.containsKey(cur)) {
                return new int[]{map.get(cur), i};
            }
            map.put(nums[i], i);
        }
        // 代码的鲁棒性
        throw new IllegalArgumentException("no such solution");
    }
}
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        Solution s = new Solution();
        int[] result = s.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
