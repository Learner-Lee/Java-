package NewBegin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day22 {
    public static void main (String[] args) {
        Solutionxx22 s = new Solutionxx22();
        List<String> list = s.generateParenthesis(2);
        System.out.println(Arrays.toString(list.toArray()));
    }
}

//class Solution22 {
//    public List<String> generateParenthesis(int n) {
//        return ;
//    }
//}


class Solutionx22 {
    List<String> ans = new ArrayList<String>();
    public void recursion(int left, int right, int level, String str) {

        if(level == 0) {
            //System.out.println(str);
            ans.add(str);
            return;
        }
        if(left > 0)
            recursion(left -1, right, level - 1,  str + "(");
        if(right > left)
            recursion(left, right - 1, level - 1, str + ")");
    }

    public List<String> generateParenthesis(int n) {

        recursion(n, n, 2 * n, "");

        return ans;
    }
}


class Solutionxx22 {
    public List<String> generateParenthesis(int n) {
        //返回的集合
        List<String> ans = new ArrayList<>();
        //函数
        backTrack(ans,new StringBuilder(),0,0,n);
        return ans;
    }
    /*
    跟踪到目前为止放置的左括号和右括号的数目，进行添加到集合：
        ans：返回的目标集合
        cur：括号字符串组成的情况，通过拼接
        left：左括号的数目
        right：右括号的数目
        max：代表生成括号的对数
    */
    public void backTrack(List<String> ans,StringBuilder cur,int left,int right,int max){
        //如果当前字符串的长度等于需要生成的括号的对数*2，则返回
        if(cur.length() == max*2){
            //System.out.println("cur.length() == max*2："+cur.toString());
            ans.add(cur.toString());
            //System.out.println("现在执行return了");
            return;
        }
        //如果左括号的数目小于需要生成的括号数目，证明还可以添加左括号
        if(left < max){
            cur.append('(');
            //System.out.println("left < max："+cur.toString());
            //递归：
            backTrack(ans, cur, left + 1, right, max);
            //删除字符串的最后一个字符
            //目的：这段if判断执行多少次就删除多少个字符
            cur.deleteCharAt(cur.length()-1);
            //System.out.println("left < max：cur.length()-1："+cur.toString());
        }
        //如果右括号数量小于左括号的数量，放一个右括号
        if(right < left){
            cur.append(')');
            //System.out.println("right < left："+cur.toString());
            //递归：
            backTrack(ans,cur,left,right+1,max);
            //目的：
            cur.deleteCharAt(cur.length()-1);
            //System.out.println("right < left：cur.length()-1："+cur.toString());
        }

    }
}



//        left < max：(
//        left < max：((
//        left < max：(((
//        right < left：((()
//        right < left：((())
//        right < left：((()))
//        cur.length() == max*2：((()))
//        现在执行return了
//        right < left：cur.length()-1：((())
//        right < left：cur.length()-1：((()
//        right < left：cur.length()-1：(((
//        left < max：cur.length()-1：((
//
//        right < left：(()
//        left < max：(()(
//        right < left：(()()
//        right < left：(()())
//        cur.length() == max*2：(()())
//        现在执行return了
//        right < left：cur.length()-1：(()()
//        right < left：cur.length()-1：(()(
//        left < max：cur.length()-1：(()
//
//        right < left：(())
//        left < max：(())(
//        right < left：(())()
//        cur.length() == max*2：(())()
//        现在执行return了
//        right < left：cur.length()-1：(())(
//        left < max：cur.length()-1：(())
//        right < left：cur.length()-1：(()
//        right < left：cur.length()-1：((
//        left < max：cur.length()-1：(
//
//        right < left：()
//        left < max：()(
//        left < max：()((
//        right < left：()(()
//        right < left：()(())
//        cur.length() == max*2：()(())
//        现在执行return了
//        right < left：cur.length()-1：()(()
//        right < left：cur.length()-1：()((
//        left < max：cur.length()-1：()(
//
//        right < left：()()
//        left < max：()()(
//        right < left：()()()
//        cur.length() == max*2：()()()
//        现在执行return了
//        right < left：cur.length()-1：()()(
//        left < max：cur.length()-1：()()
//        right < left：cur.length()-1：()(
//        left < max：cur.length()-1：()
//        right < left：cur.length()-1：(
//        left < max：cur.length()-1：









class Solutionxttt22 {
    List<String> ans = new ArrayList<String>();
    public void recursion(int left, int right, int level, String str) {

        if(level == 0) {
            //System.out.println(str);
            ans.add(str);
            return;
        }
        if(left > 0){
            public void recursion(int left-1, int right, int level-1, String str + "(") {

                if(level == 0) {
                    //System.out.println(str);
                    ans.add(str);
                    return;
                }
                if(left > 0){
                    public void recursion(int left-1, int right, int level-1, String str + "(") {

                        if(level == 0) {
                            //System.out.println(str);
                            ans.add(str);
                            return;
                        }
                        if(left > 0){

                        }
                        if(right > left){
                            recursion(left, right - 1, level - 1, str + ")");
                        }

                    }
                }
                if(right > left){
                    recursion(left, right - 1, level - 1, str + ")");
                }

            }
        }



        if(right > left){
            recursion(left, right - 1, level - 1, str + ")");
        }

    }

    public List<String> generateParenthesis(int n) {

        recursion(n, n, 2 * n, "");

        return ans;
    }
}





