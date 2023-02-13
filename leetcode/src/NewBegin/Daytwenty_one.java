package NewBegin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Daytwenty_one {
    public static void main (String[] args) {
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();
        int[] a = {1,2,4};
        int[] b = {1,3,4};

        ListNode s,q;
        s = list1;
        for (int i = 0; i < a.length; i++) {
            q = new ListNode( a[i]);
            s.next = q;
            s = q;
        }
        ListNode s2,q2;
        s2 = list2;
        for (int i = 0; i < b.length; i++) {
            q2 = new ListNode( b[i]);
            s2.next = q2;
            s2 = q2;
        }

        Solution21 sol = new Solution21();
        ListNode li = sol.mergeTwoLists(list1,list2);
        while (li.next != null) {
            System.out.print(li.next.val + "  ");
            li = li.next;
        }
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p,t ;
        p = list1.next;
        t = list2.next;

        List<Integer> lists = new ArrayList<>();
        while (p != null) {
            lists.add(p.val);
            p = p.next;
        }while (t != null) {
            lists.add(t.val);
            t = t.next;
        }

        Object[] arr = lists.toArray();
        Arrays.sort(arr);

        ListNode head = new ListNode();
        ListNode s,q;
        s = head;
        for (int i = 0; i < arr.length; i++) {
            q = new ListNode((Integer) arr[i]);
            s.next = q;
            s = q;
        }
        return head;
    }
}



class Solutionx21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}