package instanceof的用法;

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
		System.out.println(b instanceof C);//判断b对象是否是B类型，是true or false.
	}
}
//A  <--  B  <--  C , 与D无关。A>=B>=C.