package i父类与子类的继承;

public class Animal00 {
	//final String kind;
	final String kind="aaa";
	int age;
	String color;

	public Animal00(int age, String color) {
		super();
		//this.kind = kind;
		this.age = age;
		this.color = color;
		System.out.println("这是animal00有参变量");
	}
	public Animal00() {
		System.out.println("这是animal00无参变量");
	}

	
	void eat() {
		System.out.println("需要吃东西");
	}
	void eat(String a) {
		System.out.println("需要吃"+a);
	}//重载（在同一类里）

	
	void sleep() {
		System.out.println("需要睡觉");
	}
}

class Dog1 extends Animal00 {
	public Dog1() {
		//super();默认会调用父类无参的构造方法
		super(16, "black");
		System.out.println("this is a dog");
	}
	void eat () {
		super.eat();
		System.out.println("吃骨头");
	}//重写（在子类重写父类方法）
	void speak() {
		System.out.println("汪汪汪");
	}
}

class Test {
	public static void main(String[] args) {
		Dog1 dog1 = new Dog1();
		dog1.eat();
		dog1.sleep();
		dog1.speak();
	}
}