package i����������ļ̳�;

class Animal {
	String kind;
	String name = "kiky";
	int age;

	void speak() {
		System.out.println("������");
	}

	void sleep() {
		System.out.println("������Ҫ˯��");
	}
}

class horse extends Animal {
	String color;

	void eat() {
		System.out.println("���ǲ�ʳ����");
	}

	void sleep() {
		System.out.println("������Ҫ˯��������վ��˯����");
	}
}

class Dog extends Animal  {
	float weight;

	void show() {
		System.out.println("��������" + super.name + "�ǣ����ǵ�" + weight + "��");
	}

	void speak() {
		System.out.println("��");
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
