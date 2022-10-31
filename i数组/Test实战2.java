package i数组;

import java.util.Scanner;

public class Test实战2 {

	public static void main(String[] args) {
//		int[] a= {1234,3,5,45,4,6,56,5,67,56,7,45};
//		int total=0;
//		for (int i = 0; i < a.length; i++) {
//			total+=a[i];
//		}
//		System.out.println((float)total/a.length);
		
		Scanner s=new Scanner(System.in);
		int[]b= new int [10];
		
		for (int i = 0; i < b.length; i++) {
			System.out.println("请输入分数");
			b[i]=s.nextInt();
		}
		int max=b[0],min=b[0];
		for (int i = 0; i < b.length; i++) {
			if (b[i]>max) {
				max=b[i];
				
			}
			if (b[i]<min) {
				min=b[i];
				
			}
		}
		int total=0;
		for (int i = 0; i < b.length; i++) {
			total+=b[i];
			
		}
		total=total-max-min;
		System.out.println((float)total/b.length);
	}

}
