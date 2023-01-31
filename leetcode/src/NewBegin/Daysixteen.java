package NewBegin;

import java.util.Arrays;

public class Daysixteen {
    public static void main (String[] args) {
        int[] nums = {1,1,1,0};
        Solution16 s = new Solution16();
        int i = s.threeSumClosest(nums,-100);
        System.out.println(i);
    }
}


class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        int cha1;
        int cha2;
        int res = 0;
        int sum1 = nums[0]+nums[1]+nums[len - 1];
        cha1 = Math.abs(target - sum1);
        res = sum1;
        for (int i = 0; i < len-2; i++) {
            int left = i+1;
            int right = len - 1;
            while (left < right) {
                int sum = nums[i]+nums[left]+nums[right];
                if (sum == target) {
                    return sum;
                }else if (sum < target) {
                    cha2 = Math.abs(target - sum);
                    if (cha1 > cha2) {
                        cha1 = cha2;
                        res = sum;
                    }
                    left++;
                }else {
                    cha2 = Math.abs(sum - target);
                    if (cha1 > cha2) {
                        cha1 = cha2;
                        res = sum;
                    }
                    right--;
                }
            }
        }
        
        return res;
    }
}