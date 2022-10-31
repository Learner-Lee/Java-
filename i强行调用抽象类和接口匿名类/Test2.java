package i强行调用抽象类和接口匿名类;

abstract class A2 {
	abstract void abc();

	void bbb() {
		abc();
	}
}

class B extends A2 {
	void abc() {
		System.out.println("bbb");
	}
}

public class Test2 {
	static void f(A2 a) {
		a.bbb();
	}

	public static void main(String[] args) {
		f(new A2() {
			void abc() {
				System.out.println("bbb");
			}
		});// 代码1，通过匿名内部类的方式创建A类型的对象，把该对象作为f方法的参数。

		f(new B());// 代码2，使用传统的方式：通过抽象类的子类来创建一个子类对象，作为f的参数。
	}
}
