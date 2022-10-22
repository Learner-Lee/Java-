package iLambda±Ì¥Ô Ω;

abstract class A {
	abstract void a();

	abstract int b(float i);
}

class Test {

	public static void main(String[] args) {
		class B extends A {

			@Override
			void a() {
				System.out.println("aaaaaaaaaaa");

			}

			@Override
			int b(float i) {
				return (int) i;
			}

		}
		B b = new B();
		b.a();
		System.out.println(b.b(5.5f));
	}

}
