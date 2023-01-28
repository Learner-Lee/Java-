package NewBegin;

public class Daythirteen {
    public static void main (String[] args) {
        String[] strs = {"ca","c","bba","bacb","bcb"};
        Solution s = new Solution();
        String str = s.longestCommonPrefix(strs);
        System.out.println(str);
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        String result = "";
        if (strs[0].equals("") || strs[1].equals("")) {
            return "";
        }
        char[] arr1 = strs[0].toCharArray();
        char[] arr2 = strs[1].toCharArray();
        int n = 0;
        while (arr1[n] == arr2[n]) {
            result = result + arr1[n];
            n++;
            if (n >= arr1.length || n >= arr2.length) {
                break;
            }
        }
        if (result.equals("")) {
            return "";
        }
        for (int i = 2; i < strs.length; i++) {
            if (strs[i].equals("")) {
                return "";
            }
            String str = "";
            char[] arr = strs[i].toCharArray();
            char[] strarr = result.toCharArray();
            int m = 0;
            while (arr[m] == strarr[m]) {
                str = str + arr[m];
                m++;
                if (m >= arr.length || m >= strarr.length) {
                    break;
                }
            }
            result = str;
            if (result.equals("")) {
                return "";
            }
        }
        return result;
    }
}
