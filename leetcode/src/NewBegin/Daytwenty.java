package NewBegin;

public class Daytwenty {
    public static void main (String[] args) {

        Solution20 s = new Solution20();
        boolean bool = s.isValid("({})]");
        System.out.println(bool);
    }
}


class Solution20 {
    public boolean isValid(String s) {
        boolean bool = false;
        char[] arr = s.toCharArray();
        int len = arr.length;
        if (len <= 1) {
            return false;
        }
        if (arr[0] == ')' || arr[0] == '}' || arr[0] == ']') {
            return false;
        }

        // 建立栈
        int maxSize = len; // 栈的大小
        int[] stack = new int[maxSize]; // 数组模拟栈，数据放在数组中。
        int top = -1; // top表示栈顶，初始化为-1。

        int m = 0;
        while (m < len) {
            top++;
            stack[top] = arr[m];
            if (top >= 1) {
                if (stack[top-1] == '(' && stack[top] == ')') {
                    top -= 2;
                }else if (stack[top-1] == '[' && stack[top] == ']') {
                    top -= 2;
                }else if (stack[top-1] == '{' && stack[top] == '}') {
                    top -= 2;
                }
            }
            m++;
        }

        if (top == -1) {
            bool = true;
        }
        return bool;
    }

}