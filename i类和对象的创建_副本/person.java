package i��Ͷ���Ĵ���_����;

public class person {
	String name ;
	int age;
	void display() {
		System.out.println(name);
		System.out.println(age);
	}

}
//1��	��дPerson��
//1��	�����������˽�г�Աname,age��
//2��	���幹�췽����������ʼ��name��age
//3��	����һ��display�������������������ӡ������
class Test{
	public static void main(String[] args) {
		person person1=new person();
		person1.age=100;
		person1.name="����";
	    person1.display();
	}
}
