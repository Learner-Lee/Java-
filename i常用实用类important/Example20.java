package i常用实用类important;
public class Example20{
	public static void main(String args[]) {
		Integer num = new Integer(20);
		//Integer num=20;//自动装箱
         int a = 10;
		int sum = num.intValue() + a;
		//int sum = num + a;   //自动拆箱
		System.out.println("sum="+sum);
	}
}
