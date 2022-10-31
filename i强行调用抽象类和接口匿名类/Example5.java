package i强行调用抽象类和接口匿名类;

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
		Speak speak = new Speak() {// 匿名内部类，相当于是S
			public void speakHello() {
				System.out.println("大家好，祝工作顺利！");
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

