package instanceof���÷�;

class D{
	
}

public class A {
}
class B extends A {	
} 
class C extends B {
}
class show{
	public static void main(String[] args) {
		B b =new B();
		System.out.println(b instanceof C);//�ж�b�����Ƿ���B���ͣ���true or false.
	}
}
//A  <--  B  <--  C , ��D�޹ء�A>=B>=C.