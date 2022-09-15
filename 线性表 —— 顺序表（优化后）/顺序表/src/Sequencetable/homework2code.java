package Sequencetable;

import java.util.Arrays;

public class homework2code {
    public static void main(String[] args) {
        int LA[]={3,5,8,11};
        int LB[]={2,6,8,9,11,15,20};
        homework2code.SqListClass sq = new homework2code.SqListClass();
        sq.CreateList(LA);
        homework2code.SqListClass sq2 = new homework2code.SqListClass();
        sq2.CreateList(LB);
        sq.toString();
        System.out.println(sq.toString());
        sq2.toString();
        System.out.println(sq2.toString());
//        sq.U(LA[],LB[]);
//        System.out.println(Arrays.toString());
    }
    public static class SqListClass  {
        final int initcapacity = 10;
        public int[] data;
        public int size;
        private int capacity;
        public SqListClass(){
            data = new int[initcapacity];
            size = 0;
            capacity = initcapacity;
        }
        private void updatecapacity(int newcapacity) {
            int[] newdata= new int[newcapacity];
            for (int i = 0; i < size; i++) {
                newdata[i]=data[i];


            }
            capacity=newcapacity;
            data=newdata;
        }
        public void CreateList(int[] a) {
            size = 0;
            for (int i = 0; i < a.length; i++) {
                if (size == capacity) {
                    updatecapacity(2 * size);
                }
                data[size] = a[i];
                size++;
            }
        }

        public String toString(){
            String ans = "";
            for (int i = 0; i < size; i++) {
                ans+=data[i]+"   ";

            }
            return ans;
        }

        public void U(int a[],int b[]){
            for (int i = 0; i < a.length+b.length; i++) {
                a[a.length+1] = b[i];
            }
        }


    }
}
//二、设有线性表LA=(3,5,8,11)和LB=(2,6,8,9,11,15,20)，要求用顺序表实现如下操作：
//        1.若LA和LB分别表示两个集合A和B，求新集合 A=A U B (即“并”操作)，预测输出LA=(3,5,8,11,2,6,9,15,20)。
//        2.将LA和LB表归并，仍要有序 (相同元素保留)，预测输出LC=(2,3,5,6,8,8,9,11,11,15,20)。
