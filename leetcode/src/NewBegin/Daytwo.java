package NewBegin;

import java.util.ArrayList;
import java.util.List;

public class Daytwo {
    public static void main (String[] args) {
        Solutionx02 a = new Solutionx02();
        int b = a.lengthOfLongestSubstring("adcadcdd");
        System.out.println(b);
    }
}

class Solution02 {
    public int lengthOfLongestSubstring(String s) {
        char[] a = s.toCharArray();// 将string转char类型
        List<Character> list = new ArrayList<>();// 定义一个列表
        if(a.length==0){// 如果s为空，则输出0
            return 0;
        }else{
            int num=1;// 创建一个整型变量用于记录个数
            for (int j=0;j<a.length;j++) {
                for(int i=j;i<a.length;i++) {
                    if(list.contains(a[i])==false){//如果列表中没有a[i]，则将他加入
                        list.add(a[i]);
                    }else {//如果列表中有a[i]，则判断列表中数的个数并比较
                        if(list.size()>=num)  {
                            num=list.size();
                            //System.out.println(list.size());
                        }
                        list.clear();// 比较完之后清空列表
                        break;
                    }
                }
            }
            return num;
        }
    }
}

class Solutionx02 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
}




