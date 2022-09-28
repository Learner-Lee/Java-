package work;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;

public class workcode {
    public static void main(String[] args) {
        int arr[] = {2,34,9,24,5,524,23,82,341,8,6,2,3,4,32,4};
        workcode.LinkListClass lc = new workcode.LinkListClass();
        lc.creatlistT(arr);
        System.out.println("最大值为；"+lc.max(arr));
        System.out.println("请输入，想要查询的数：");
//        Scanner scanner = new Scanner(System.in);
//        int val = scanner.nextInt();
        System.out.println(lc.amount(arr,2));
//        scanner.close();
        System.out.println("删除后为：");
//        LinkNode p = lc.deleteDuplicates();
//        while (true) {
//            try {
//                System.out.print(p.val+",");
//                p=p.next;
//            } catch (Exception e) {
//                break;
//            }
//        }
        System.out.println(lc.Delete());

    }
    static class LinkNode {
        // 存储具体数据
        int val;
        LinkNode next;

        public LinkNode(int val) {
            this.val = val;
            next = null;
        }
        public LinkNode() {
            next = null;
        }
    }

    public static class LinkListClass{
        LinkNode head;
        LinkNode head2;
        LinkNode head3;
        LinkNode tail;
        public LinkListClass(){
            head = new LinkNode();
            head.next = null;
            head2 = new LinkNode();
            head2.next = null;
            head3 = new LinkNode();
            head3.next = null;
            tail = new LinkNode();
            tail.next = null;
        }

        public void creatlistF(int a[]){
            LinkNode s;
            for (int i = 0; i < a.length; i++) {
                s = new LinkNode(a[i]);
                s.next = head.next;
                head.next = s;
            }
        }
        public void creatlistself(int D){
            LinkNode r;
            r = new LinkNode(D);
            r.next = head2.next;
            head2.next = r;

        }
        public void creatlistT(int a[]){
            LinkNode s,t;
            t = tail;
            for (int i = 0; i < a.length; i++) {
                  s=new LinkNode(a[i]);
                  t.next = s;
                  t = s;
            }
            t.next = null;
        }


        public int max(int a[]){
            int max1 = 0;
            creatlistF(a);
            LinkNode p = head;
            while (true) {
                try {
                    p=p.next;
                    if (p.val > max1) {
                        max1 = p.val;
                    }
                } catch (Exception e) {
                	break;
                }
            }
            return max1;
        }

        public int amount(int a[],int X){
            int total = 0;
            creatlistF(a);
            LinkNode p = head;
            while (true) {
                try {
                    p=p.next;
                    if (p.val == X) {
                        total++;
                    }
                    System.out.println("     "+p.val+"     "+total);
                } catch (Exception e) {
                    break;
                }
            }
            return total;
        }



//        public LinkNode deleteDuplicates () {
//            // write code here
//            if (head == null) return null;
//
//            LinkNode newHead = new LinkNode(0);
//            newHead.next = head;
//            LinkNode p = head, pre = newHead;
//
//            while (p != null && p.next != null) {
//                // 关键：找到重复元素的起点
//                if (p.val == p.next.val) {
//                    LinkNode temp = p.next;
//                    while (temp != null && temp.val == p.val) {
//                        temp = temp.next;
//                    }
//                    pre.next = temp;
//                    p = temp;
//                } else {
//                    pre = p;
//                    p = p.next;
//                }
//            }
//            return newHead.next;
//        }










        public int Delete(){
            LinkNode p = head;
            LinkNode l = p;
            int num = 0;
//            LinkNode s = head2;
            while (true) {
                boolean isTrue;
                try {
                    p = p.next;
                    //声明一个标记，并每次重置
                    isTrue = true;
                    l = p;
                    while (true) {
                        try {
                            l = l.next;
                            if (p.val == l.val) {
                                isTrue = false;
                                break;
                            }
                        } catch (Exception e) {
                            break;
                        }
                    }/*while*/
                } catch (Exception e) {
                    break;
                }
                if (isTrue) {
//                    s = new LinkNode(p.val);
//                    s.next = head2.next;
//                    head2.next = s;
//                    creatlistself(p.val);
                   num=p.val;
                }
            }/*while*/
            return num;
        }

    }

}


//1.设计一个算法，通过一遍扫描，在带头节点的单链表L中确定值最大的节点。
//        2.设计一个算法，在带头节点的单链表L上统计出值为x的元素个数。
//        3.设计一个算法，在带头节点的单链表L上删除其值重复的元素。

