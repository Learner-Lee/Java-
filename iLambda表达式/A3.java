package iLambda���ʽ;

public interface A3 {
	//void a();
	void a(int i);
}

class Test02 {

	public static void main(String[] args) {
		// A a=Lambda���ʽ.
		A3 a3 = (int d) -> {System.out.println("Lambda���ʽ��ʵ�ֵ�"+d);};
		A3 C3 = (d) -> {System.out.println("C3 Lambda���ʽ��ʵ�ֵ�"+d);};//d�Զ�Ѱ��A3��Ӧ������
		A3 b3=new A3() {			
			@Override
			public void a(int i) {
				System.out.println("�������ڲ�����ʵ�ֵ�"+i);
			}
		};
		a3.a(5);
		b3.a(5);
		C3.a(5);
	}
}