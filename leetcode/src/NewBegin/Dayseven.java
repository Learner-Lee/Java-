package NewBegin;


public class Dayseven {
    public static void main (String[] args) {
        Solution07 s = new Solution07();
        int i = s.myAtoi("23a8f");
        System.out.println(i);
    }
}
class Solution07 {
    public int myAtoi(String s) {
        char[] a = s.toCharArray();
        String str = "";
        double ans02;
        int ans;
        int i;
        boolean bool = true;
        for (i = 0; i < a.length; i++) {
            int m = i;
            if ('A'<= a[i] && a[i] <= 'Z') {
                return 0;
            }
            if ('a'<= a[i] && a[i] <= 'z') {
                return 0;
            }
            if (a[i] == '.') {
                return 0;
            }
            if (a[i] == '-') {
                if (i>0) {
                    if ('0' <= a[i-1]&&a[i-1] <= '9') {
                        return 0;
                    }
                }
            }
            if ('1' <= a[i]&&a[i] <= '9') {
                if (i >= 2) {
                    int x = i-1;
                    while (a[x] == '0') {
                        if (x == 0) {
                            break;
                        }
                        if (x > 0) {
                            x--;
                        }
                    }
                    int k = i-1;
                    while (a[k] == ' ') {
                        if (k == 0) {
                            break;
                        }
                        if (k > 0) {
                            k--;
                        }
                    }
                    if (a[i-1] == ' ') {
                        if ('0' <= a[k]&&a[k] <= '9') {
                            return 0;
                        }
                    }

                    if (x-1 >= 0) {
                        if (a[x] == '-'&&a[x-1] == '+') {
                            return 0;
                        }if (a[x] == '+'&&a[x-1] == '-') {
                            return 0;
                        }
                    }
                }
                if (i != 0) {
                    int x = i-1;
                    while (a[x] == '0') {
                        if (x == 0) {
                            break;
                        }
                        if (x > 0) {
                            x--;
                        }
                    }
                    if (a[x] == '-') {
                        str = "-";
                        while ('0' <= a[m] && a[m] <= '9') {
                            str = str + a[m];
                            m++;
                            if (m == a.length) {
                                break;
                            }
                        }
                    }else {
                        str = "";
                        while ('0' <= a[m] && a[m] <= '9') {
                            str = str + a[m];
                            m++;
                            if (m == a.length) {
                                break;
                            }
                        }
                    }
                }else {
                    str = "";
                    while ('0' <= a[m] && a[m] <= '9') {
                        str = str + a[m];
                        m++;
                        if (m == a.length) {
                            break;
                        }
                    }
                }




                if (i != 0) {
                    int x = i - 1;
                    while (a[x] == '0') {
                        if (x == 0) {
                            break;
                        }
                        if (x > 0) {
                            x--;
                        }
                    }
                    if (a[x] == ' ') {
                        bool = false;
                    }
                    if ('0' <= a[x]&&a[x] <= '9') {
                        bool = false;
                    }
                    if (a[x] == '-') {
                        if (x > 0) {
                            int y = x - 1;
                            while (a[y] == ' ') {
                                if (y == 0) {
                                    bool = false;
                                    break;
                                }
                                if (y > 0) {
                                    y--;
                                }
                            }
                        }
                    }
                }


                if (bool) {
                    for (int j = m; j < a.length; j++) {
                        if ('A'<= a[j] && a[j] <= 'Z') {
                            for (int k = j; k < a.length; k++) {
                                if ('0' <= a[k] && a[k] <= '9') {
                                    return 0;
                                }
                            }
                        }
                        if ('a'<= a[j] && a[j] <= 'z') {
                            for (int k = j; k < a.length; k++) {
                                if ('0' <= a[k] && a[k] <= '9') {
                                    return 0;
                                }
                            }
                        }
                    }
                }


                break;
            }
        }
//        System.out.println(str);
        if(str == ""){
            return 0;
        }
        ans02 = Double.parseDouble(str);
        int num = (int) Math.pow(2,31);
        if (-1*num <= ans02 && ans02 <= num - 1) {
            ans = (int)ans02;
            return ans;
        }else if(-1*num <= ans02) {
            return num;
        }else {
            return -1*(num+1);
        }
    }
}


class Solutionx07 {

    public int myAtoi(String str) {
        int len = str.length();
        // str.charAt(i) 方法回去检查下标的合法性，一般先转换成字符数组
        char[] charArray = str.toCharArray();

        // 1、去除前导空格
        int index = 0;
        while (index < len && charArray[index] == ' ') {
            index++;
        }

        // 2、如果已经遍历完成（针对极端用例 "      "）
        if (index == len) {
            return 0;
        }

        // 3、如果出现符号字符，仅第 1 个有效，并记录正负
        int sign = 1;
        char firstChar = charArray[index];
        if (firstChar == '+') {
            index++;
        } else if (firstChar == '-') {
            index++;
            sign = -1;
        }

        // 4、将后续出现的数字字符进行转换
        // 不能使用 long 类型，这是题目说的
        int res = 0;
        while (index < len) {
            char currChar = charArray[index];
            // 4.1 先判断不合法的情况
            if (currChar > '9' || currChar < '0') {
                break;
            }

            // 题目中说：环境只能存储 32 位大小的有符号整数，因此，需要提前判：断乘以 10 以后是否越界
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (currChar - '0') > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && (currChar - '0') > -(Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }

            // 4.2 合法的情况下，才考虑转换，每一步都把符号位乘进去
            res = res * 10 + sign * (currChar - '0');
            index++;
        }
        return res;
    }

    public static void main(String[] args) {
        Solutionx07 solution = new Solutionx07();
        String str = "2147483646";
        int res = solution.myAtoi(str);
        System.out.println(res);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}

