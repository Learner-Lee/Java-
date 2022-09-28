package work;

public class linklist {

    class Node {
        // 存储具体数据
        int val;
        // 保存下一个车厢的地址
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public class SingleLinkedList {
        // 当前火车中车厢的节点个数(实际就是具体元素的个数)
        private int size;
        // 当前火车的火车头
        private Node head;

        public void addFirst(int val) {
            // 新建一个车厢节点
            Node node = new Node(val);
            // 判断当前的火车是否为空
            if (head == null) {
                head = node;
            }else {
                // 火车中有节点，要把当前新车厢挂载到火车头部
                node.next = head;
                head = node;
            }
            size ++;
        }

    }







}
