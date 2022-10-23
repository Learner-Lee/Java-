package i类的继承与多态;

public class Vehicle {
	double speed;
	String kind;
	String color;

	public Vehicle(double speed, String kind, String color) {
		super();
		this.speed = speed;
		this.kind = kind;
		this.color = color;
	}

}

class Car extends Vehicle {
	String name;

	public Car(double speed, String kind, String color, String name) {
		super(speed, kind, color);
		this.name = name;
	}

}

class Bus extends Vehicle {
	double passenger;

	public Bus(double speed, String kind, String color, Double passenger) {
		super(speed, kind, color);
		this.passenger = passenger;
	}
}

class show {
	public static void main(String[] args) {
		Car car1 = new Car(1225.08, "玛莎拉蒂", "五颜六色的黑", "king of kings");
		Bus bus1 = new Bus(2450.16, "soul", "亡灵色", 3.5);
		System.out.println("现在有请一号选手入场");
		System.out.println("速度为，" + car1.speed + "km/h");
		System.out.println("颜色是，" + car1.color);
		System.out.println("种类为，" + car1.kind);
		System.out.println("人称，" + car1.name);
		System.out.println("\n" + "现在有请二号选手入场");
		System.out.println("速度为，" + bus1.speed + "km/h");
		System.out.println("颜色是，" + bus1.color);
		System.out.println("种类为，" + bus1.kind);
		System.out.println("乘客数为，" + bus1.passenger);
	}
}
//定义交通工具类Vehicle，一个小车类Car，一个公共汽车Bus类。实现Car、Bus对Vehicle的继承。
//已有一个交通工具类Vehicle，其中属性包括：速度speed、类别kind、颜色color；方法包括一个带参数的构造方法。
//设计一个小车类Car、继承自Vehicle，Car类有成员变量name，构造方法。
//设计一个公共汽车类Bus，继承自Vehicle， Bus中增加了属性：座位数passenger，构造方法实现赋值。
//创建Car、Bus的对象，为其各属性赋值，并显示其状态（所有属性）。
