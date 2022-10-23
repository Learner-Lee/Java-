package i抽象类和接口的应用_作业;

public interface Inter {
	void f1();
}
 class Test3 {

	public static void main(String[] args) {
		Inter a=new Inter() {
			
			@Override
			public void f1() {
				System.out.println("通过匿名内部类的方式实现…");
				
			}
		};
		a.f1();
	}
		
}
//（1）定义一个接口Inter，接口中声明一个抽象方法f1()（无参数，无返回值）。
//（2）定义一个主类Test3,在主方法中，用匿名内部类的方法定义一个Inter类型的对象，
//并调用f1方法，实现输出“通过匿名内部类的方式实现…”
