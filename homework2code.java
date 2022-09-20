package Sequencetable;

public class homework2code {
    public static void main(String[] args) {
        int LA[]={3,5,8,11};
        int LB[]={2,6,8,9,11,15,20};
        int[] s;
        homework2code.SqListClass sq = new homework2code.SqListClass();
        sq.CreateList(LA);
        System.out.println("取并集为");
        s  = sq.U(LB);
        for (int o : s) {
            System.out.print(o+",");
        }
        System.out.println("");
        System.out.println("排序后为");
        int [] h = sq.sort(s);
        for (int o : h) {
            System.out.print(o+",");
        }
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

        public int [] U(int a[]){
            int t=1;
            int [] tempArr = new int[a.length+size];
            int lon = a.length;
            for (int i = 0; i < a.length; i++) {
                tempArr [i]=a[i];
            }
            for (int i = 0; i < size; i++) {
                tempArr[lon+i] = data[i];
            }
            int s[] = delete(tempArr);
            //声明需要返回的数组，这个才是去重后的数组
            int[]  newArr = new int[s.length];
            //用arraycopy方法将刚才去重的数组拷贝到新数组并返回
            System.arraycopy(s,0,newArr,0,s.length);
            return newArr;
        }

        public int [] sort(int a[]){//冒泡排序法
            for (int i = 1; i < a.length; i++) {
                for (int j = 0; j < a.length - i; j++) {//size - i,防止出现越界错误，并且减少循环次数
                    if(a[j] > a[j+1]){
                        int temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                    }
                }
            }
            //声明需要返回的数组，这个才是去重后的数组
            int[]  newArr = new int[a.length];
            //用arraycopy方法将刚才去重的数组拷贝到新数组并返回
            System.arraycopy(a,0,newArr,0,a.length);
            return newArr;

        }

        /**
         * 去掉数组中重复的元素
         */
        //需要传入一个Object数组，然后返回去重后的数组
        public int[] delete(int a[]){
            //用来记录去除重复之后的数组长度和给临时数组作为下标索引
            int t = 0;
            //临时数组
            int [] tempArr = new int[a.length];
            //遍历原数组
            for(int i = 0; i < a.length; i++){
                //声明一个标记，并每次重置
                boolean isTrue = true;
                //内层循环将原数组的元素逐个对比
                for(int j=i+1;j<a.length;j++){
                    //如果发现有重复元素，改变标记状态并结束当次内层循环
                    if(a[i]==a[j]){
                        isTrue = false;
                        break;
                    }
                }
                //判断标记是否被改变，如果没被改变就是没有重复元素
                if(isTrue){
                    //没有元素就将原数组的元素赋给临时数组
                    tempArr[t] = a[i];
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
//二、设有线性表LA=(3,5,8,11)和LB=(2,6,8,9,11,15,20)，要求用顺序表实现如下操作：
//        1.若LA和LB分别表示两个集合A和B，求新集合 A=A U B (即“并”操作)，预测输出LA=(3,5,8,11,2,6,9,15,20)。
//        2.将LA和LB表归并，仍要有序 (相同元素保留)，预测输出LC=(2,3,5,6,8,8,9,11,11,15,20)。
