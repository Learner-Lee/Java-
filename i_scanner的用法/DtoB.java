package i_scanner���÷�;
import java.util.Scanner;
class DtoB {
	public static void main(String args[]) {
		Scanner Scanner=new Scanner(System.in);
		System.out.println("������һ��ʮ������");
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