package NewBegin;

public class Daysix {
    public static void main (String[] args) {
        Solution06 s = new Solution06();
        int a = s.reverse(1534236469);
        System.out.println(a);
    }
}

class Solution06 {
    public int reverse(int x) {
        int num = (int) Math.pow(2,31);
        System.out.println(num);
        if (-1*num <= x && x <= num - 1) {
            if (x >= 0) {
                String s = Integer.toString(x);
                char[] a = s.toCharArray();
                String sans = "";
                for (int i = a.length-1; i >= 0; i--) {
                    sans = sans+a[i];
                }
                double ans02 = Double.parseDouble(sans);
                if (ans02 <= num - 1) {
                    int ans = (int)ans02;
                    return ans;
                }else {
                    return 0;
                }
            }else {
                x = -1*x;
                String s = Integer.toString(x);
                char[] a = s.toCharArray();
                String sans = "-";
                for (int i = a.length-1; i >= 0; i--) {
                    sans = sans+a[i];
                }
                double ans02 = Double.parseDouble(sans);
                if (-1*num <= ans02) {
                    int ans = (int)ans02;
                    return ans;
                }else {
                    return 0;
                }
            }
        }else {
            return 0;
        }
    }
}
