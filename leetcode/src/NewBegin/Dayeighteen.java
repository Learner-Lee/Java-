package NewBegin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dayeighteen {
    public static void main (String[] args) {
        int[] nums = {-1000000000,-1000000000,-1000000000,-1000000000};
        Solutionx18 s = new Solutionx18();
        List<List<Integer>> list = s.fourSum(nums,294967296);

        System.out.println("方法一：输出list元素");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(Arrays.toString(list.get(i).toArray()));
        }
    }
}





class Solution18 {
    public List<List<Integer>> fourSum(int[] nums,int target) {
        //结果链表
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        //先进行排序
        Arrays.sort(nums);
        int fleft = 0;
        int fright = len - 1;
        while (fleft+1 < fright-1) {
            int sum = 0;
            int left = fleft+1;
            int right = fright-1;
            //大于0提前结束
            if(nums[fleft] > target){
                break;
            }
            while(left < right){
                sum = nums[fleft]+nums[fright]+nums[left]+nums[right];
                if(sum==target){
                    //数字一样跳过 防止重复
                    res.add(Arrays.asList(nums[fleft],nums[fright],nums[left],nums[right]));
                    while(left<right&&nums[left]==nums[left+1])
                        left++;
                    while(left<right&&nums[right]==nums[right-1])
                        right--;
                    left ++;
                    right --;
                }
                //小 右移
                else if(sum < target){
                    while(left<right&&nums[left]==nums[left+1])
                        left++;
                    left++;
                }
                //大 左移
                else {
                    while(left<right&&nums[right]==nums[right-1])
                        right--;
                    right--;
                }
            }/* while(left < right)*/

            if (left >= right ) {
                if (sum == target) {
                    while(fleft+1 < fright-1&&nums[fleft]==nums[fleft+1])
                        fleft++;
                    while(fleft+1 < fright-1&&nums[fright]==nums[fright-1])
                        fright--;
                    fleft ++;
                    fright --;
                }
                //小 右移
                else if(sum < target){
                    while(fleft+1 < fright-1&&nums[fleft]==nums[fleft+1])
                        fleft++;
                    fleft++;
                }
                //大 左移
                else {
                    while(fleft+1 < fright-1&&nums[fright]==nums[fright-1])
                        fright--;
                    fright--;
                }
            }
        }/*while (fleft+1 < fright-1)*/


        return res;
    }
}


class Solutionx18 {
    public List<List<Integer>> fourSum(int[] nums,int target) {
        //结果链表
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        //先进行排序
        Arrays.sort(nums);
        for (int j = len - 1; j > 2; j--) {
            for(int i = 0;i < len - 3; i ++){
                int left = i+1;
                int right = j-1;
                while(left < right){
                    int sum = nums[i]+nums[j]+nums[left]+nums[right];
                    if (sum == -294967296 || sum == 294967296) {
                            return res;
                    }
                    if(sum==target){
                        //数字一样跳过 防止重复
                        boolean iscontains = res.contains(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        if (!iscontains) {
                            res.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        }
                        while(left<right&&nums[left]==nums[left+1])
                            left++;
                        while(left<right&&nums[right]==nums[right-1])
                            right--;
                        left ++;
                        right --;
                    }
                    //小 右移
                    else if(sum < target){
                        while(left<right&&nums[left]==nums[left+1])
                            left++;
                        left++;
                    }
                    //大 左移
                    else {
                        while(left<right&&nums[right]==nums[right-1])
                            right--;
                        right--;
                    }
                }
            }
        }

        return res;
    }
}

