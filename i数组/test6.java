package i数组;
public class test6 {
	public static void main(String[] args) {
		int[] a=new int [20];
		for (int i = 0; i < a.length; i++) {
			if (i==0||i==1) {
				a[i]=1;
			}
			else {
				a[i]=a[i-2]+a[i-1];
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"       ");
			
		}
		System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------");
		for (int i : a) {                    //增强型
			System.out.print(i+"       ");
		}
	}
}
