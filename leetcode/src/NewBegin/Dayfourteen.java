package NewBegin;

import java.util.*;

public class Dayfourteen {
    public static void main (String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        Solution14 s = new Solution14();
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



class Solutionx14 {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        // 枚举 a
        for (int first = 0; first < n; ++first) {
            // 需要和上一次枚举的数不相同
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            // c 对应的指针初始指向数组的最右端
            int third = n - 1;
            int target = -nums[first];
            // 枚举 b
            for (int second = first + 1; second < n; ++second) {
                // 需要和上一次枚举的数不相同
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }
                // 需要保证 b 的指针在 c 的指针的左侧
                while (second < third && nums[second] + nums[third] > target) {
                    --third;
                }
                // 如果指针重合，随着 b 后续的增加
                // 就不会有满足 a+b+c=0 并且 b<c 的 c 了，可以退出循环
                if (second == third) {
                    break;
                }
                if (nums[second] + nums[third] == target) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    ans.add(list);
                }
            }
        }
        return ans;
    }
}