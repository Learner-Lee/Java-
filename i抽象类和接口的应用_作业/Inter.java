package i������ͽӿڵ�Ӧ��_��ҵ;

public interface Inter {
	void f1();
}
 class Test3 {

	public static void main(String[] args) {
		Inter a=new Inter() {
			
			@Override
			public void f1() {
				System.out.println("ͨ�������ڲ���ķ�ʽʵ�֡�");
				
			}
		};
		a.f1();
	}
		
}
//��1������һ���ӿ�Inter���ӿ�������һ�����󷽷�f1()���޲������޷���ֵ����
//��2������һ������Test3,���������У��������ڲ���ķ�������һ��Inter���͵Ķ���
//������f1������ʵ�������ͨ�������ڲ���ķ�ʽʵ�֡���
