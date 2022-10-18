package stack;

import java.util.Scanner;

public class LinklistStackDemo {
    public static void main(String[] args) {
        // 测试 LinklistStack，是否正确。

        // 先创建一个 LinklistStack 的对象。-> 表示栈
        LinklistStack stack = new LinklistStack();
        String key = "";
        boolean loop = true;  // 控制是否退出菜单。
        Scanner scanner = new Scanner(System.in);

        while (loop){
            System.out.println("show: 显示栈内信息");
            System.out.println("exit: 退出栈");
            System.out.println("push: 添加数据到栈");
            System.out.println("pop : 从栈取出数据");
            System.out.println("请输入你的选择：");
            key = scanner.next();

            switch (key) {
                case "show":
                    stack.list();
                    break;
                case "exit":
                    scanner.close();
                    loop = false;
                    break;
                case "push":
                    System.out.println("请输入一个数：");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case "pop":
                    try {
                        int result = stack.pop();
                        System.out.printf("出栈的数据为：%d\n",result);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                default:
                    break;
            }/*switch*/
        }/*while*/
        System.out.println("程序已退出~~");
    }
}
// 定义一个 LinklistStack类，表示栈。
class LinklistStack{
    int maxsize = -1;
    LinkNode head;

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


    public LinklistStack() {
        head = new LinkNode();
        head.next = null;
    }
    //栈空
    public  boolean isEmpty(){
        return head.next==null;
    }
    //入栈——push
    public void push(int D){
        LinkNode r;
        r = new LinkNode(D);
        r.next = head.next;
        head.next = r;
    }
    // 出栈-pop,将栈顶的数据返回。
    public int pop(){
        // 判断栈是否为空
        if (isEmpty()) {
            // 抛出异常
            throw new RuntimeException("栈内没有数据");
        }
        int value = head.next.val;
        head.next = head.next.next;
        return value ;
    }

    // 显示栈的情况【遍历栈】,遍历时，需要从栈顶开始显示数据。
    public void list(){
        LinkNode p = head.next;
        int num;
        if (isEmpty()) {
            System.out.println("栈空，没有数据");
            return;
        }
        while (p != null) {
            maxsize++;
            num = p.val;
            p = p.next;
            System.out.printf("stack[%d] = %d\n",maxsize,num);
        }
    }
}
