package work;

public class work03 {
    public static void main(String[] args) {
        int target = 9;
        int[] nums = {2,7,11,15};
        Solution01 solution01 = new Solution01();
        int[] arr = solution01.twoSum(nums,target);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

/**
 * 1. 两数之和
 *
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 */
class Solution01 {
    public int[] twoSum(int[] nums, int target) {
        int total;
        int i;
        int j;
        int[] arr = new int[2];
        for (i = 0; i < nums.length; i++) {
            for (j = i+1; j < nums.length; j++) {
                total = nums[i] + nums[j];
                if (total == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}