package iǿ�е��ó�����ͽӿ�������;

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
				System.out.println("������");
				
			}
		};
		a.eat();
		a.speak();
	}
}