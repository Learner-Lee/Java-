package i父类与子类的继承;

class Animal {
	String kind;
	String name = "kiky";
	int age;

	void speak() {
		System.out.println("动物会叫");
	}

	void sleep() {
		System.out.println("动物需要睡觉");
	}
}

class horse extends Animal {
	String color;

	void eat() {
		System.out.println("马是草食动物");
	}

	void sleep() {
		System.out.println("动物需要睡觉，马是站着睡觉的");
	}
}

class Dog extends Animal  {
	float weight;

	void show() {
		System.out.println("这条狗的" + super.name + "是，他们的" + weight + "是");
	}

	void speak() {
		System.out.println("汪");
	}
}

public class Test001 {
	public static void main(String[] args) {
		//Dog dog1 = new Dog();

		Dog dog1=new Dog();
		horse horse1 = new horse();
		dog1.show();
		dog1.speak();
		horse1.sleep();
		horse1.speak();
		horse1.eat();
	}
}
