package BasePackage;

public class LargeNumArr {
    public int[] largeArr(){
        // 创建8,000,000个随机数据
        int[] arr = new int[8000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*8000000);
        }
        return arr;
    }
}
