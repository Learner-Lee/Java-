package Lx;
import java.util.Scanner;

public class Lx14 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("������ķ���:");
		int mark = in.nextInt();// markΪ����ķ���
		int temp = mark / 10; // �˴�ʵ�ְѷ�������10ȡ����Ȼ�����ȡ��������ֵ�жϵȼ�
		char result;
		switch (temp) {
		case 9:
			System.out.println("��ĵȼ���:A");
			break;
		case 8:
			System.out.println("��ĵȼ���:B");
			break;
		case 7:
			System.out.println("��ĵȼ���:C");
			break;
		case 6:
			System.out.println("��ĵȼ���:D");
			break;

		default:
			System.out.println("��ĵȼ���:E");
			break;
		}

//		System.out.println("��ĵȼ���:" +result );
	}
}