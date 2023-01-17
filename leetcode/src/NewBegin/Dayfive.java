package NewBegin;

public class Dayfive {
    public static void main (String[] args) {
        Solution05 s = new Solution05();
        String str = s.convert("PAYPALISHIRING",3);
        System.out.println(str);
    }
}

class Solution05 {
    public String convert (String s,int numRows) {
        char[] a = s.toCharArray();
        char[][] inside = new char[numRows][s.length()];
        String str = "";
        int m = 0;
        int n = 0;
//        System.out.println(a[m]);

        while (m < a.length) {
            for (int i = 0; i < inside.length; i++) {
                if (m >= a.length) {
                    break;
                }
                inside[i][n] = a[m];
                m++;
            }
            n++;
            for (int i = inside.length - 2; i > 0; i--) {
                if (m >= a.length) {
                    break;
                }
                inside[i][n] = a[m];
                m++;
                n++;
            }
        }
        for (int i = 0; i < inside.length; i++) {
            for (int j = 0; j < inside[i].length; j++) {
                if (inside[i][j] != '\u0000') {
                    str = str + inside[i][j];
                }
            }
        }
        return str;
    }
}
