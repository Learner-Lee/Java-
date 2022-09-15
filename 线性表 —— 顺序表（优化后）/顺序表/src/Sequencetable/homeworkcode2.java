package Sequencetable;



public class homeworkcode2 {
    public static void main(String[] args) throws IllegalAccessException {
        int src[] = {1,1,1,1,1,1,1,1,2,3,4,5,6,7,90};
        homeworkcode2.SqListClass sq = new homeworkcode2.SqListClass();
        sq.CreateList(src);
        System.out.println("最大值为：");
        sq.max();
        sq.amound(1);
        System.out.println(sq.toString());
        sq.del();
        System.out.println("");
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
//                System.out.printf("i:%d, value:%d, size:%d, size-value:%d\n", i, a[i], size, data[size]);
                size++;

            }
//            System.out.println(size);
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

        public void amound(int e){
            int sum = 0;
            for (int j = 0; j < data.length; j++) {
                if (e == data[j]) {
                    sum++;
                }
            }
            System.out.println(sum);
        }

        public void del() {
//            sort();
            for (int i = 0; i < size; i++) {
                for (int j = i+1; j < size; j++) {
                    if (data[i] == data[j]) {
//                        while (true) {
//                            try {
//                                for (int k = j; k < data.length; k++) {
//                                    data[k] = data[k+1];
//                                    System.out.print(data[k]);
//                                }
//                                size--;
//                            } catch (Exception k) {
//                                break;
//                            }
//                        }
                        try {
                            Delete(j);
                            j--;
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }


        public void sort(){
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < i+1; j++) {
                    if (data[j] >= data[i+1]) {
                        int a;
                        a = data[j];
                        data[j] = data[i+1];
                        data[i+1] = a;
                    }
                }
            }

//            for (int i = 0; i < size; i++) {
//                if (data[i] >= data[i+1]) {
//                    int a;
//                    a = data[i];
//                    data[i] = data[i+1];
//                    data[i+1] = a;
//                }
//            }

        }


        public void Delete(int a)throws IllegalAccessException{
            if (a<0||a>size-1) {
                throw new IllegalAccessException("删除：位置i不在有效范围内");
            }
            for (int k = 0; k < size-1; k++) {
                data[k] = data[k+1];
            }
            size--;
            if (capacity>initcapacity&&size==capacity/4) {
                updatecapacity(capacity/2);
            }
        }





    }
}
