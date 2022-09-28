package linklist;

public class testDemo {
    //定义节点
    public static class ListNode{
        int val;
        ListNode next;// 指针，指向下一个节点位置。
        public ListNode(int val) {
            this.val = val;
        }
    }


    // 定义一个头节点
    ListNode head;

    ListNode p=new ListNode(1);
//    head.next = p;
    // 定义一个尾节点
    ListNode tail;
    // 链表长度
    int size;

    // 增加节点，尾插，就是顺序插入
    public void addNode(int val){
        // 头节点的处理
        if (head == null) {
            head = new ListNode(val);
            size++;
        }

    }


}
