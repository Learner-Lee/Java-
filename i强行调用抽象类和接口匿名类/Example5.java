package iǿ�е��ó�����ͽӿ�������;

abstract class Speak {
	public abstract void speakHello();
}

class Student {
	void f(Speak sp) {
		sp.speakHello();
	}
}

public class Example5 {
	public static void main(String args[]) {
		Speak speak = new Speak() {// �����ڲ��࣬�൱����S
			public void speakHello() {
				System.out.println("��Һã�ף����˳����");
			}
		};
		speak.speakHello();
		
		
		Student st = new Student();
		st.f(new Speak() {

			@Override
			public void speakHello() {
				System.out.println("madhouse,yyds");
				
			}
			
		});
	}
}

