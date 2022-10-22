package i_switch循环的运用;
import java.util.Scanner;

public class test12 {
	public static void main(String[] args) {
		System.out.println("请输入两个数以便进行运算");
		int x;
		int y;
		boolean a,b;
		b=true;
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		y = scanner.nextInt();
		while (b ) {
			System.out.println("是否进行运算，true or false");
			a = scanner.nextBoolean();
			b=a;
			
			while (a) {
				System.out.println("请输入你的计算类型：");
				System.out.println("1：加法运算");
				System.out.println("2：减法运算");
				System.out.println("3：乘法运算");
				System.out.println("4：除法运算");
				System.out.println("0：退出");
				int key = scanner.nextInt();
				switch (key) {
				case 1:
					add(x, y);
					System.out.println("是否继续进行运算，true or false");
					a = scanner.nextBoolean();
//					if (a=false) {
//						System.out.println("已成功退出！");
//					}
					b=a;
					break;
				case 2:
					subtraction(x, y);
					System.out.println("是否继续进行运算，true or false");
					a = scanner.nextBoolean();
//					if (a=false) {
//						System.out.println("已成功退出！");
//					}
					b=a;
					break;
				case 3:
					multiplication(x, y);
					System.out.println("是否继续进行运算，true or false");
					a = scanner.nextBoolean();
//					if (a=false) {
//						System.out.println("已成功退出！");
//					}
					b=a;
					break;
				case 4:
					division(x, y);
					System.out.println("是否继续进行运算，true or false");
					a = scanner.nextBoolean();
//					if (a=false) {
//						System.out.println("已成功退出！");
//					}
					b=a;
					break;
				case 0:
					System.out.println("已成功退出！");
					break;

				default:
					System.out.println("没有这种输入法");
					break;
				}
				if (key == 0) {
					b=false;
					break;
				}
			}
		}
		

	}

	public static void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public static void subtraction(int a, int b) {
		int c = a - b;
		System.out.println(c);
	}

	public static void multiplication(int a, int b) {
		int c = a * b;
		System.out.println(c);
	}

	public static void division(int a, int b) {
		int c = a / b;
		System.out.println(c);
	}
}
