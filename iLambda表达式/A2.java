package iLambda±Ì¥Ô Ω;

abstract class A2 {
	abstract void a();

	abstract int b(float i);
}

class Test01 {

	public static void main(String[] args) {
		A a=new A() {
			
			@Override
			int b(float i) {
				return (int) i;
			}
			
			@Override
			void a() {
				System.out.println("aaaaaAAAaaaaa");
			}
		};
		a.a();
		System.out.println(a.b(5.5f));
	}

}