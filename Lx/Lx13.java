package Lx;
import java.util.Scanner;

public class Lx13 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in); // ����Scanner��Ķ���in
		System.out.println("�����ж����:");
		int year = in.nextInt(); // nextInt()��Scanner���һ����������������Ϣ����һ�����ɨ��Ϊһ�� int
		if (year%4==0&&year%100!=0&&year%400==0)
		{System.out.println("����");}
		else {System.out.println("��������");}

	}
}
