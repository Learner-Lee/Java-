package iǿ�е��ó�����ͽӿ�������;

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
		});// ����1��ͨ�������ڲ���ķ�ʽ����A���͵Ķ��󣬰Ѹö�����Ϊf�����Ĳ�����

		f(new B());// ����2��ʹ�ô�ͳ�ķ�ʽ��ͨ�������������������һ�����������Ϊf�Ĳ�����
	}
}
