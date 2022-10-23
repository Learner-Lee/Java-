package i抽象类和接口的应用_作业;

import i抽象类和接口的应用_作业.Cube.Rectangle;

public class Cube {
	double height;
	
	public Cube(double height) {
		super();
		this.height = height;
	}
	void tiji(double buttomarea) {
		double v=height*buttomarea;
		System.out.println(v);
	}
	class Rectangle{
		double width,height;
		double dimianji() {
			double buttomarea=width*height;
			return buttomarea;			
		}
		public Rectangle(double width, double height) {
			super();
			this.width = width;
			this.height = height;
		}
		
	}

}
class Test {

	public static void main(String[] args) {
		 Cube.Rectangle R1=new Cube(5).new Rectangle(10, 20);
		  System.out.println(R1.dimianji());
		  Cube R2=new Cube(5);
		  R2.tiji(R1.dimianji());
	}
		
}
//（1）	定义一个Cube类，其中包含一个成员变量height，一个成员方法：计算立方体的体积(带形参，形参为底面积)。
//（2）	并在其内部定义一个Rectangle类，其中包含两个变量width和height，一个方法：计算底面积。
//（3）定义一个主类Test1,创建Rectangle对象，并调用方法求出其面积；创建Cube类的对象，
//          给高赋值，且以上述长方形面积为长方体的底，求出长方体的体积。
