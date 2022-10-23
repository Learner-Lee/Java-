package i类和对象的创建_副本;

public class Number {
	private int n1;
	private int n2;
	
	
	
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	
	
	void jiafa() {
		int c=n1+n2;
		System.out.println(c);
	}
	void jian() {
		int c=n1-n2;
		System.out.println(c);
	}
	void cheng() {
		int c=n1*n2;
		System.out.println(c);
	}
	void chu() {
		int c=n1/n2;
		System.out.println(c);
	}

}
//2、	编写一个Number类，模拟简单的计算器。
//1）	该类包含有两个整型成员变量n1,n2，并设为私有。
//2）	定义构造方法，为 n1,n2初始化；
//3）	定义公有四个成员方法，分别对两个成员执行加减乘除的运算。
