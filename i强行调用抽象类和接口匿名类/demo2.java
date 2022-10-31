package i强行调用抽象类和接口匿名类;

public interface demo2 {
	void speak();
	void eat();

}
class TT{
	public static void main(String[] args) {
		demo2 a=new demo2() {
			
			@Override
			public void speak() {
				System.out.println("trigger");
				
			}
			
			@Override
			public void eat() {
				System.out.println("京阿尼");
				
			}
		};
		a.eat();
		a.speak();
	}
}