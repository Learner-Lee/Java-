package NewBegin;

import java.util.List;

public class Dayone {
    public static void main (String[] args) {
        ListNode head = new ListNode();
        ListNode p;
        p = head.next;
        p= new ListNode(12) ;
        ListNode head1 = new ListNode();
        ListNode p1;
        p1 = head.next;
        p1= new ListNode(22) ;
        ListNode head2 = new ListNode();
        ListNode p2;
        p2 = head.next;
        Solution a = new Solution();
        p2 = a.addTwoNumbers(p,p1);

    }
}

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode () {
    }

    ListNode (int val) {
        this.val = val;
    }

    ListNode (int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
class Solution {
    String num = "";
    int num1 = 0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode p;
        p = head.next;
        while (l1 != null) {
            num = l1.val + num;
            l1 = l1.next;
        }
        num1 = Integer.parseInt(num);
        num = "";
        while (l2 != null) {
            num = l2.val + num;
            l2 = l2.next;
        }
        num1 = Integer.parseInt(num)+num1;
        num = String.valueOf(num1);
        System.out.println(num);
        char[] res = num.toCharArray();

        String str="Hello everyone! ";
        char[] c=num .toCharArray();
        for(int count=0;count<num.length();count++){
            System.out.print(c[count]+" ");
            String i1 = String.valueOf(c[count]);
            int a = Integer.parseInt(i1);
            p = new ListNode(a);
            p.next = head.next;
            head.next = p;
        }
        return p;
    }
}

class change{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);//新链表的头节点
        ListNode preNode = res;
        int a = 0;//表示进位
        while (l1 != null || l2 != null || a != 0){
            int sum = a;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
//            创建新的结点，存储计算结果
            preNode.next = new ListNode(sum %10);
            a = sum / 10;
            //更新当前结点
            preNode = preNode.next;
        }
        return res.next;
    }
}
