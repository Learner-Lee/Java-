package iLambda表达式;

public interface A4 {
	int  a(int i ,int j);
}

class Test03 {

	public static void main(String[] args) {
		// A a=Lambda表达式.
		A4 a4 = (int d ,int c) -> {System.out.println("Lambda表达式来实现的"+d);
		                                return d*c;};
		A4 b4=new A4() {			
			@Override
			public int  a(int i,int j) {
				System.out.println("用匿名内部类来实现的"+i);
				return i*j;
			}
		};
		System.out.println(a4.a(5,6));
		System.out.println(b4.a(5,6));
		
	}
}