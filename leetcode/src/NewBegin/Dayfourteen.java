package NewBegin;

import java.util.*;

public class Dayfourteen {
    public static void main (String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        Solutionx14 s = new Solutionx14();
        List<List<Integer>> list = s.threeSum(nums);

        System.out.println("方法一：输出list元素");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(Arrays.toString(list.get(i).toArray()));
        }

    }
}

class Solution14 {
    public List<List<Integer>> threeSum(int[] nums) {
        int m = 0;
        List<List<Integer>> llist = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        if (nums.length < 3) {
            return llist;
        }
        for (int num : nums) {
                list.add(num);
                m++;
        }
        for (int i = 0; i < m-2; i++) {
            for (int j = i; j < m-1; j++) {
                for (int k = j; k < m; k++) {
                    if (i != j && j != k && i != k) {
                        int res = list.get(i) + list.get(j) + list.get(k);
                        if (res == 0) {
                            int[] a = new int [3];
                            a[0] = list.get(i);
                            a[1] = list.get(j);
                            a[2] = list.get(k);
                            int tmp;
                            int n,l;
                            for (l = 1; l < a.length; l++) {
                                if (a[l] < a[l-1]) {
                                    tmp = a[l];
                                    a[l] = a[l-1];
                                    for (n = l-2; n >= 0 && a[n] > tmp ; n--) {
                                        a[n+1] = a[n];
                                    }
                                    a[n+1] = tmp;
                                }
                            }
                            list2.add(a[0]);
                            list2.add(a[1]);
                            list2.add(a[2]);
                            boolean iscontains = llist.contains(list2);
                            if (!iscontains) {
                                llist.add(new LinkedList<>(list2));
                            }
                            list2.clear();
                        }
                    }
                }
            }
        }

        return llist;

    }
}


/**
 * 编程思路：
 * 运用双指针对程序进行遍历（这会减少所需要是时间）
 * 将得到的数相加，以便于控制指针的运动
 * 大于 0 right移动(使和变小)
 * 小于 0 left移动(使和变大)
 * 等于 0 同时移动(如果单独动其中一个，则绝对不会出现想要的结果)
 */
class Solutionx14 {
    public List<List<Integer>> threeSum(int[] nums) {
        //结果链表
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        //先进行排序
        Arrays.sort(nums);
        for(int i = 0;i < len-2; i ++){
            //大于0提前结束
            if(nums[i] > 0){
                break;
            }
            //去重
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0){
                    //数字一样跳过 防止重复
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left<right&&nums[left]==nums[left+1])
                        left++;
                    while(left<right&&nums[right]==nums[right-1])
                        right--;
                    left ++;
                    right --;
                }
                //小 右移
                else if(sum < 0){
                    left++;
                }
                //大 左移
                else {
                    right--;
                }
            }
        }
        return res;
    }
}