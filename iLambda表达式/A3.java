package iLambda表达式;

public interface A3 {
	//void a();
	void a(int i);
}

class Test02 {

	public static void main(String[] args) {
		// A a=Lambda表达式.
		A3 a3 = (int d) -> {System.out.println("Lambda表达式来实现的"+d);};
		A3 C3 = (d) -> {System.out.println("C3 Lambda表达式来实现的"+d);};//d自动寻找A3对应的类型
		A3 b3=new A3() {			
			@Override
			public void a(int i) {
				System.out.println("用匿名内部类来实现的"+i);
			}
		};
		a3.a(5);
		b3.a(5);
		C3.a(5);
	}
}