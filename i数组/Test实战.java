package i数组;

public class Test实战 {

	public static void main(String[] args) {
		//遍历
//		int [] scoreArray1=new int[] {132,352,3921,4,3,54,65,7432,234,34,4,45,6452,3,246,5,6};
//		for (int i = 0; i < scoreArray1.length; i++) {
//			//0 1 2 3 4 5
//			System.out.println(scoreArray1[i]);
//		}
		
		
//		char[] c=new char[3];
//		c[0]='a';c[1]='b';c[2]='c';
//		for (int i = 0; i < c.length; i++) {
//			System.out.println(c[i]);
//		}
		
		
//		int [] aArray =new int [] {132,352,3921,4,3,54,65,7432,234,34,4,45,6452,3,246,5,6};
//		int [] newArray=new int [aArray.length];
//		for (int i = 0; i < aArray.length; i++) {
//			newArray[i]=aArray[i];			
//			}
//		for (int i = 0; i < newArray.length; i++) {
//			System.out.print(newArray[i]+" ");
//		}
		
		
//		int [] aArray =new int [] {132,352,3921,4,3,54,65,7432,234,34,4,45,6452,3,246,5,6};
//		int max= aArray[0];
//		int min= aArray[0];
//		for (int i = 1; i < aArray.length; i++) {
//			if (aArray[i]>max) {
//				max = aArray[i];
//			}
//			if (aArray[i]<min) {
//				min = aArray[i];
//			}
//		}
//		System.out.println(max);
//		System.out.println(min);
		
		
//		//倒置
//		int[] a= {233,1454,45,765,78};
//		//5   0 1 2 3 4     2
//		//    0 1 2 5-1  5-1-1
//		//4   0 1 2 3       2
//		for (int i = 0; i < (a.length/2); i++) {
//			// i   length-1-i
//			int temp =a[i];
//			a[i]=a[a.length-1-i];
//			a[a.length-1-i]=temp;
//		}
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]+"  ");
//		}
		
		
//		int[] oldArr= {1,2,3,0,4,5,6,7,4,0,4,5,4,3,0,2,3,1,0,0,0,};
//		int count =0;
//		for (int i = 0; i < oldArr.length; i++) {
//			if (oldArr[i]!=0) {
//				count++;
//			}
//		}
//		int[] newArr=new int [count ];
//		int number=0;
//		// number 0 放在索引为0的位置
//		//        1 放在索引为1的位置
//		//        2 放在索引为2的位置
//		for (int i = 0; i < oldArr.length; i++) {
//			if (oldArr[i]!=0) {
//				newArr[number]=oldArr[i];
//				number++;				
//			}
//		}
//		for (int i = 0; i < newArr.length; i++) {
//			System.out.print(newArr[i]+"   ");
//		}
		
		
		int[] oldArr= {1,2,3,0,0,0,0,0,0,0,0,4,0,4,0,0,0,0,4,5,6,7,4,0,4,5,4,3,0,2,3,1,0,0,0,};
		int numbertofind=5;
		int index=-1;
		for (int i = 0; i < oldArr.length; i++) {
			if (oldArr[i]==numbertofind) {
				index=i;break;
			}
		}
		System.out.println(index);
	}

}
