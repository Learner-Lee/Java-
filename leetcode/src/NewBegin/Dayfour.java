package NewBegin;

public class Dayfour {
    public static void main (String[] args) {

    }
}

//class Solution {
//    public String longestPalindrome(String s) {
//
//    }
//}

class LongestPalindrome {
    public String longestPalindrome(String s) {
        if(s.length()<2){
            return s;
        }
        int maxLeft = 0;
        int maxRight = 0;
        //记录当前左指针位置
        int x = 0;
        //记录当前右指针位置
        int y = 0;
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++){
            for(int j=chars.length-1;j>i;j--){
                if(chars[i]==chars[j]){
                    //如果第一个和最后一个元素相同，则前后指针均移动一个,前向后移动1个，后向前移动一个
                    int start = i+1;
                    int end = j-1;
                    //后指针不能小于前指针
                    //定义一个标志
                    boolean flag = true;
                    while(end>start){
                        if(chars[end]==chars[start]){
                            start++;
                            end--;
                        }else{
                            flag=false;
                            break;
                        }
                    }
                    //记录出现前后指针对应的值相等的坐标
                    if(flag){
                        x = i;
                        y = j;
                    }
                }
                if(y-x>maxRight-maxLeft){
                    maxLeft = x;
                    maxRight = y;
                }
            }
        }
        return s.substring(maxLeft,maxRight+1);
    }

    public static void main(String[] args) {
//        String s = "babad";
        String s = "cbbd";
        LongestPalindrome l = new LongestPalindrome();
        String s1 = l.longestPalindrome(s);
        System.out.println(s1);
    }
}

