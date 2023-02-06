package NewBegin;

public class Daynineteen {
    public static void main (String[] args) {
        int[] arr = {1};
        ListNode head = new ListNode();
        ListNode p,t;
        p = head;
        for (int i = 0; i < arr.length; i++) {
            t = new ListNode(arr[i]);
            p.next = t;
            p = t;
        }
        Solution19 s = new Solution19();
        ListNode r = s.removeNthFromEnd(head,1);
        display(r);
    }

    public static void display(ListNode head){
        ListNode cur = head.next;
        System.out.println("结果为：");
        while(cur != null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }
}




class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = getLength(head);
        int target = len - n;
        removeIndex(head,target);
        return head;
    }
    // 求出链表长度
    public int getLength(ListNode head) {
        ListNode indexNode = head;
        int length = 0;
        while(indexNode != null) {
            length++;
            indexNode = indexNode.next;
        }
        return length;
    }


    //删除指定位置的节点
    public ListNode removeIndex(ListNode head, int index) {
        if (index < 1 || index > getLength(head)) {
            return head;
        }
        if (index == 1) {
            head.next = head.next.next;
            return head;
        }
        int i = 1;
        ListNode p = head;
        while (p.next != null) {
            if (i != index) {
                p = p.next;
                i++;
            } else {
                p.next = p.next.next;
                i++;
            }
        }
        return head;
    }
}


