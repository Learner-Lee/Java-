package i_if_else循环的运用;
import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		System.out.println("请输入你的成绩，来查询自己的档次");
		Scanner s=new Scanner(System.in);//扫描器
		a=s.nextDouble();
		System.out.println(a);
		if(a>90)
		{System.out.println("优秀");}
		else if(a>80)
		{System.out.println("良好");}
		else if(a>70)
		{System.out.println("一般");}
		else if(a>60)
		{System.out.println("加油");}
		else
		{System.out.println("继续加油");}	
		

	}

}
