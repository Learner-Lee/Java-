package NewBegin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Dayfifteen {
    public static void main (String[] args) {
        int[] nums = {3,2,4};
        Solution15 s = new Solution15();
        int[] i = s.twoSum(nums , 6);
        System.out.println(i[0]+"    "+i[1]);
    }
}

class Solutionx15 {
    public int[] twoSum(int[] nums, int target) {
        int total;
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
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

class Solution15 {
//    public int[] twoSum(int[] nums, int target) {
//        int len = nums.length;
//        Map<Integer,Integer> hashMap = new HashMap<>(len - 1);
//        hashMap.put(nums[0],0);
//        for (int i = 0; i < len; i++) {
//            int another = target - nums[i];
//            if (hashMap.containsKey(another)) {
//                return new int[]{i,hashMap.get(another)};
//            }
//            hashMap.put(nums[i],i);
//        }
//        throw new IllegalArgumentException("NO two sum solution");
//    }
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>(len - 1);
        for (int i = 0; i < len; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
}