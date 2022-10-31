package Lx;
import java.util.Scanner;

public class Lx13 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in); // 定义Scanner类的对象in
		System.out.println("输入判断年份:");
		int year = in.nextInt(); // nextInt()是Scanner类的一个方法，将输入信息的下一个标记扫描为一个 int
		if (year%4==0&&year%100!=0&&year%400==0)
		{System.out.println("闰年");}
		else {System.out.println("不是闰年");}

	}
}
