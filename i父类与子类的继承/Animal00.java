package i����������ļ̳�;

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
		System.out.println("����animal00�вα���");
	}
	public Animal00() {
		System.out.println("����animal00�޲α���");
	}

	
	void eat() {
		System.out.println("��Ҫ�Զ���");
	}
	void eat(String a) {
		System.out.println("��Ҫ��"+a);
	}//���أ���ͬһ���

	
	void sleep() {
		System.out.println("��Ҫ˯��");
	}
}

class Dog1 extends Animal00 {
	public Dog1() {
		//super();Ĭ�ϻ���ø����޲εĹ��췽��
		super(16, "black");
		System.out.println("this is a dog");
	}
	void eat () {
		super.eat();
		System.out.println("�Թ�ͷ");
	}//��д����������д���෽����
	void speak() {
		System.out.println("������");
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