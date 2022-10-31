package Lx;
import java.util.Scanner;

public class Lx14 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("输入你的分数:");
		int mark = in.nextInt();// mark为输入的分数
		int temp = mark / 10; // 此处实现把分数整除10取整，然后根据取到的整数值判断等级
		char result;
		switch (temp) {
		case 9:
			System.out.println("你的等级是:A");
			break;
		case 8:
			System.out.println("你的等级是:B");
			break;
		case 7:
			System.out.println("你的等级是:C");
			break;
		case 6:
			System.out.println("你的等级是:D");
			break;

		default:
			System.out.println("你的等级是:E");
			break;
		}

//		System.out.println("你的等级是:" +result );
	}
}