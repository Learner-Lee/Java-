package i������ͽӿ�;

public interface Valuable {
	void getMoney();
}

interface Protectable {
	void beProtected();
}

abstract class Animal {
	String name;

	abstract void enjoy();
}

class GoldenMonkey extends Animal implements Valuable, Protectable {

	@Override
	public void beProtected() {
		System.out.println("GoldenMonkeyס�ڷ�����");

	}

	@Override
	public void getMoney() {
		System.out.println("GoldenMonkey��10000Ԫÿ��");

	}

	@Override
	void enjoy() {
		System.out.println("GoldenMonkeyϲ�����㽶");
	}

}

class Test2 {

	public static void main(String[] args) {
		GoldenMonkey monkey = new GoldenMonkey();
		monkey.enjoy();
		monkey.getMoney();
		monkey.beProtected();

	}

}

//2���ӿڵĶ��弰ʹ��
//��1������һ���ӿ�Valuable��ֵǮ�Ķ��������ýӿ�����һ�����󷽷�getMoney()���÷�����ʾֵ����Ǯ��
//��2��������һ���ӿ�Protectable���ܱ����Ķ��������ýӿ�����һ�����󷽷�beProtected()��
//         �÷�����ʾ��ô��������
//��3������һ��������Animal���������г�Ա����name,tizhong����һ�����󷽷�enjoy()���÷�����ʾ����İ��á�
//��4������һ��GoldenMonkey�࣬����̳�Animal�࣬��ͬʱʵ����Valuable��Protectable�ӿڡ�
//          enjoy()����ʵ�֣������GoldenMonkeyϲ�����㽶����getMoney()����ʵ�֣�GoldenMonkey��10000Ԫÿ�
//          beProtected()����ʵ�֣�GoldenMonkeyס�ڷ����
//��5������һ������Test2��������GoldenMonkey���󣬲������������з�����ʵ�������
