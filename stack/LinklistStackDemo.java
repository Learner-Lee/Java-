package stack;

public class LinklistStackDemo {
    public static void main(String[] args) {

    }
}
// 定义一个 LinklistStack类，表示栈。
class LinklistStack{

    static class LinkNode {
        // 存储具体数据
        int val;
        LinkNode next;// 指针
        public LinkNode(int val) {
            this.val = val;
            next = null;
        }
        public LinkNode() {
            next = null;
        }
    }


    public static class LinkListClass {
        LinkNode head;
        public LinkListClass() {
            head = new LinkNode();
            head.next = null;
        }
        //栈空
        public  boolean isEmpty(){
            return top == -1;
        }

    }

}
