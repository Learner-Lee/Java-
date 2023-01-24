package NewBegin;

public class Dayeleven {
    public static void main (String[] args) {

        Solution11 s = new Solution11();
        String s1 = s.intToRoman(624);
        System.out.println(s1);
    }
}

//        字符          数值
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000

class Solution11 {
    public String intToRoman(int num) {
        String result = "";
        String[] str = new String[13];
        int[] arr = new int[13];
        str[0] = "M";str[1] = "CM";str[2] = "D";str[3] = "CD";str[4] = "C";
        str[5] = "XC";str[6] = "L";str[7] = "XL";str[8] = "X";str[9] = "IX";
        str[10] = "V";str[11] = "IV";str[12] = "I";

        arr[0] = 1000;arr[1] = 900;arr[2] = 500;arr[3] = 400;arr[4] = 100;
        arr[5] = 90;arr[6] = 50;arr[7] = 40;arr[8] = 10;arr[9] = 9;
        arr[10] = 5;arr[11] = 4;arr[12] = 1;

        while (num > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= num) {
                    num = num - arr[i];
                    result = result + str[i];
                    break;
                }
            }
        }

        return result;
    }
}
