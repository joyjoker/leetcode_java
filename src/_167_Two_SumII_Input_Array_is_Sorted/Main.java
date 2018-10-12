package _167_Two_SumII_Input_Array_is_Sorted;

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers.length < 2) {
            return new int[]{0};
        }
        for (int i = 0, j = numbers.length - 1; i < j; i++) {
            while (i < j && numbers[i] + numbers[j] < target) {
                i++;
            }
            if (numbers[i] + numbers[j] == target) {
                return new int[]{i + 1, j + 1};
            }
            while (i < j && numbers[i] + numbers[j] > target) {
                j--;
            }
            if (numbers[i] + numbers[j] == target) {
                return new int[]{i + 1, j + 1};
            }
        }
        return new int[]{0};
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(numbers, target);
        System.out.println(Arrays.toString(result));
    }
}
