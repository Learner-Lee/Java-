package i抽象类和接口的应用_作业;

abstract class A{
	abstract void abc();
	void bbb() {
		abc();
	}
}
class B extends A{
	void abc() {
		System.out.println("bbb");
	}
}
 class Test2{
	static void f(A a) {
		a.bbb();
	}
	
	public static void main(String[] args) {
		f(new A() {		
			void abc() {
				System.out.println("bbb");			
			}
		});//代码1
	
	f(new B());//代码2
   }
}
