package i_switchѭ��������;
import java.util.Scanner;

public class test12 {
	public static void main(String[] args) {
		System.out.println("�������������Ա��������");
		int x;
		int y;
		boolean a,b;
		b=true;
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		y = scanner.nextInt();
		while (b ) {
			System.out.println("�Ƿ�������㣬true or false");
			a = scanner.nextBoolean();
			b=a;
			
			while (a) {
				System.out.println("��������ļ������ͣ�");
				System.out.println("1���ӷ�����");
				System.out.println("2����������");
				System.out.println("3���˷�����");
				System.out.println("4����������");
				System.out.println("0���˳�");
				int key = scanner.nextInt();
				switch (key) {
				case 1:
					add(x, y);
					System.out.println("�Ƿ�����������㣬true or false");
					a = scanner.nextBoolean();
//					if (a=false) {
//						System.out.println("�ѳɹ��˳���");
//					}
					b=a;
					break;
				case 2:
					subtraction(x, y);
					System.out.println("�Ƿ�����������㣬true or false");
					a = scanner.nextBoolean();
//					if (a=false) {
//						System.out.println("�ѳɹ��˳���");
//					}
					b=a;
					break;
				case 3:
					multiplication(x, y);
					System.out.println("�Ƿ�����������㣬true or false");
					a = scanner.nextBoolean();
//					if (a=false) {
//						System.out.println("�ѳɹ��˳���");
//					}
					b=a;
					break;
				case 4:
					division(x, y);
					System.out.println("�Ƿ�����������㣬true or false");
					a = scanner.nextBoolean();
//					if (a=false) {
//						System.out.println("�ѳɹ��˳���");
//					}
					b=a;
					break;
				case 0:
					System.out.println("�ѳɹ��˳���");
					break;

				default:
					System.out.println("û���������뷨");
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
