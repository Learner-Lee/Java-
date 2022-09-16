package Sequencetable;

public class TestDelete {
    public static void main(String[] args) throws IllegalAccessException {
        int src[] = {1,1,1,1,1,1,1,1,2,3,1,4,4,4,5,6,7,8,5,5,7,4,35,6,7,90};
        TestDelete.SqListClass sq = new TestDelete.SqListClass();
        sq.CreateList(src);
        System.out.println(sq.toString());
        int[] s  = sq.delete();
        for (int o : s) {
            System.out.print(o+",");
        }

    }
    public static class SqListClass  {
        final int initcapacity = 20;
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
            String ans="";
            for (int i = 0; i < size; i++) {
                ans+=data[i]+"  ";
            }
            return  ans;
        }


        public void sort(){//冒泡排序法
            for (int i = 1; i < size; i++) {
                for (int j = 0; j < size - i; j++) {
                    if(data[j] > data[j+1]){
                        int temp = data[j];
                        data[j] = data[j+1];
                        data[j+1] = temp;
                    }
                    if (size == capacity) {
                        updatecapacity(2 * size);
                    }
                }
            }
        }

        /**
         * 去掉数组中重复的元素
         */
        //需要传入一个Object数组，然后返回去重后的数组
        public int[] delete(){
            sort();
            //用来记录去除重复之后的数组长度和给临时数组作为下标索引
            int t = 0;
            //临时数组
            int [] tempArr = new int[size];
            //遍历原数组
            for(int i = 0; i < size; i++){
                //声明一个标记，并每次重置
                boolean isTrue = true;
                //内层循环将原数组的元素逐个对比
                for(int j=i+1;j<size;j++){
                    //如果发现有重复元素，改变标记状态并结束当次内层循环
                    if(data[i]==data[j]){
                        isTrue = false;
                        break;
                    }
                }
                //判断标记是否被改变，如果没被改变就是没有重复元素
                if(isTrue){
                    //没有元素就将原数组的元素赋给临时数组
                    tempArr[t] = data[i];
                    //走到这里证明当前元素没有重复，那么记录自增
                    t++;
                }
            }
            //声明需要返回的数组，这个才是去重后的数组
            int[]  newArr = new int[t];
            //用arraycopy方法将刚才去重的数组拷贝到新数组并返回
            System.arraycopy(tempArr,0,newArr,0,t);
            return newArr;
        }

    }
}
