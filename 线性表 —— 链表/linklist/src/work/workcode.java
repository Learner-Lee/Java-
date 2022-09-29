package work;


public class workcode {
    public static void main(String[] args) {
        int arr[] = {2,34,9,24,5,524,23,82,341,8,6,8,3,4,32,4,2};
        workcode.LinkListClass lc = new workcode.LinkListClass();
        lc.creatlistT(arr);
        System.out.println("最大值为；"+lc.max(arr));
        System.out.println("请输入，想要查询的数：");
        System.out.println(lc.amount(2));
        System.out.println("删除后为：");
        LinkNode p = lc.Delete(arr);
        while (true) {
            try {
                System.out.print(p.val+",");
                p=p.next;
                if(p.val == 0){
                    System.out.println(p.val);
                }
            } catch (Exception e) {
                break;
            }
        }
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
        LinkNode tail;
        public LinkListClass(){
            head = new LinkNode();
            head.next = null;
            head2 = new LinkNode();
            head2.next = null;
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

        public int amount(int X){
            int total = 0;
            LinkNode p = head;
            while (true) {
                try {
                    p=p.next;
                    if (p.val == X) {
                        total++;
                    }
                } catch (Exception e) {
                    break;
                }
            }
            return total;
        }

        public LinkNode Delete(int a[]){
            LinkNode p = head;
            LinkNode l = p;
            int num = 0;
            for (int i = 0; i < a.length; i++) {
                boolean isTrue;
                p = p.next;
                //声明一个标记，并每次重置
                isTrue = true;
                l = p;
                for (int j = i+1; j < a.length; j++) {
                    l = l.next;
                    if (p.val == l.val) {
                        isTrue = false;
                        break;
                    }
                }
                if (isTrue) {
                    creatlistself(p.val);
                    num=p.val;
                }
            }
            return head2.next;
        }

    }

}


//1.设计一个算法，通过一遍扫描，在带头节点的单链表L中确定值最大的节点。
//        2.设计一个算法，在带头节点的单链表L上统计出值为x的元素个数。
//        3.设计一个算法，在带头节点的单链表L上删除其值重复的元素。

