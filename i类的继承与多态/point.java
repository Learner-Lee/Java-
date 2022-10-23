package i类的继承与多态;

public class point {
	double x;
	double y;

	public point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void show() {
		System.out.println("坐标为" + "(" + x + "," + y + ")");
	}

}

class Circle extends point {

	double r;

	public Circle(double x, double y, double r) {
		super(x, y);
		this.r = r;
	}

	public void areaCi() {
		double sum;
		sum = 3.14 * r * r;
		System.out.println(sum);
	}
}

class Cylinder extends Circle {
	double h;

	public Cylinder(double x, double y, double r, double h) {
		super(x, y, r);
		this.h = h;
	}

	public void areaCy() {
		double a = 2 * 3.14 * r * r + 3.14 * r * 2;
		System.out.println("面积=" + a);
	}

	public void Volume() {
		double v = 3.14 * r * r * h;
		System.out.println("体积=" + v);
	}
}

class Test {
	public static void main(String[] args) {
		Cylinder cylinder1 = new Cylinder(4, 2, 1, 8);
		Cylinder cylinder2 = new Cylinder(5, 3, 6, 7);
		System.out.println("第一个圆柱体为");
		cylinder1.show();
		System.out.println("半径为" + cylinder1.r);
		System.out.println("高为" + cylinder1.h);
		cylinder1.areaCy();
		cylinder1.Volume();
		System.out.println("\n" + "下一个圆柱体为");
		cylinder2.show();
		System.out.println("半径为" + cylinder2.r);
		System.out.println("高为" + cylinder2.h);
		cylinder2.areaCy();
		cylinder2.Volume();
	}
}
//定义点类Point、圆类Circle、圆柱体类Cylinder。实现继承关系。
//设计一个表示二维平面上点的类Point，包括表示坐标位置的成员变量x和y，构造方法实现给x、y赋值。
//    设计一个表示二维平面上圆的类Circle，它继承类Point，
//包括表示圆半径的成员变量r、构造方法、计算圆面积的方法。
//    设计一个表示圆柱体的类Cylinder,它继承自类Circle，包括表示圆柱体高的成员h、
//构造方法、计算圆柱体表面积的方法、计算圆柱体体积的方法。
//    在Test主类中建立2个Cylinder对象，输出其轴心位置坐标、半径、高、表面积及其体积的值。
