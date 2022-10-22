package i常用实用类important;
public class Example11 {
	public static void main(String[] args) {
		int[] fromArray = { 101, 102, 103, 104, 105, 106 };     //源数组
		int[] toArray = { 201, 202, 203, 204, 205, 206, 207 }; //目标数组
		System.arraycopy(fromArray, 2, toArray, 3, 4);     //源数组的下标2开始，复制到目标数组下标3的位置，拷贝4个
		// 打印目标数组中的元素
          for (int i = 0; i < toArray.length; i++) {
			System.out.println(i + ": " + toArray[i]);
		}
	}
}
