package NewBegin;

public class Dayeight {
    public static void main (String[] args) {
        Solution08 s = new Solution08();
        boolean bool = s.isPalindrome(30);
        System.out.println(bool);
    }
}


class Solution08 {
    public boolean isPalindrome(int x) {
        boolean istrue = true;
        String s = Integer.toString(x);
        char[] a = s.toCharArray();
        int leftside = 0;
        int rightside = a.length -1 ;
        while (a[leftside] == a[rightside]) {
            if (rightside-1 == leftside) {
                break;
            }
            if (rightside > 0) {
                rightside--;
            }
            if (leftside < a.length -1) {
                leftside++;
            }
            if (rightside == leftside) {
                break;
            }
        }
        if (rightside == leftside || a[rightside] == a[leftside]) {
            istrue = true;
        }else {
            istrue = false;
        }
        return istrue;
    }
}
