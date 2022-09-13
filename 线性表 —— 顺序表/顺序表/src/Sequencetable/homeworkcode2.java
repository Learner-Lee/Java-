package Sequencetable;

import java.util.Arrays;

public class homeworkcode2 {
    public static void main(String[] args) {
        int src[] = {1,1,1,1,1,1,1,1,1,2,3,4,5,6,7,90};
        homeworkcode2.SqListClass sq = new homeworkcode2.SqListClass();
        sq.CreateList(src);
        System.out.println("最大值为：");
        sq.max();
//        sq.amound(1);
        System.out.println(sq.toString());
        sq.del();
        System.out.println(sq.toString());

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
                capacity=newcapacity;
                data=newdata;

            }
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
            String ans="";
            for (int i = 0; i < size; i++) {
                ans+=data[i]+"  ";
            }
            return  ans;
        }

        public void max(){
            int max = data[0];
            for (int i = 0; i < data.length; i++) {
                if (max <= data[i]) {
                    max = data[i];
                }

            }
            System.out.println(max);
        }

//        public void amound(int e){
//            int sum = 0;
//            for (int j = 0; j < data.length; j++) {
//                if (e == data[j]) {
//                    sum++;
//                    System.out.println(sum);
//                }
//                System.out.print(data[j]);
//            }
//
//            System.out.println(sum);
//        }

        public void del(){
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data.length; j++) {
                    if (data[i] == data[j]) {
                        while (true) {
                            try {
                                for (int k = j; k < data.length; k++) {
                                    data[k] = data[k+1];
                                }
                            } catch (Exception k) {
                                break;
                            }
                        }
                    }
                }
            }
        }





    }
}
