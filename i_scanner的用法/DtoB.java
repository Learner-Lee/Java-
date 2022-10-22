package i_scanner的用法;
import java.util.Scanner;
class DtoB {
	public static void main(String args[]) {
		Scanner Scanner=new Scanner(System.in);
		System.out.println("请输入一个十进制数");
		int x=Scanner.nextInt();
//		int x = 35;
		int a[] = new int[32];
		for (int i = 0; i < a.length; i++) {
			a[i] = x % 2;
			x /= 2;
		}
		for (int i = a.length - 1; i >= 0; i--)
			System.out.print(a[i]);
	}
}