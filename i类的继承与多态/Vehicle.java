package i��ļ̳����̬;

public class Vehicle {
	double speed;
	String kind;
	String color;

	public Vehicle(double speed, String kind, String color) {
		super();
		this.speed = speed;
		this.kind = kind;
		this.color = color;
	}

}

class Car extends Vehicle {
	String name;

	public Car(double speed, String kind, String color, String name) {
		super(speed, kind, color);
		this.name = name;
	}

}

class Bus extends Vehicle {
	double passenger;

	public Bus(double speed, String kind, String color, Double passenger) {
		super(speed, kind, color);
		this.passenger = passenger;
	}
}

class show {
	public static void main(String[] args) {
		Car car1 = new Car(1225.08, "��ɯ����", "������ɫ�ĺ�", "king of kings");
		Bus bus1 = new Bus(2450.16, "soul", "����ɫ", 3.5);
		System.out.println("��������һ��ѡ���볡");
		System.out.println("�ٶ�Ϊ��" + car1.speed + "km/h");
		System.out.println("��ɫ�ǣ�" + car1.color);
		System.out.println("����Ϊ��" + car1.kind);
		System.out.println("�˳ƣ�" + car1.name);
		System.out.println("\n" + "�����������ѡ���볡");
		System.out.println("�ٶ�Ϊ��" + bus1.speed + "km/h");
		System.out.println("��ɫ�ǣ�" + bus1.color);
		System.out.println("����Ϊ��" + bus1.kind);
		System.out.println("�˿���Ϊ��" + bus1.passenger);
	}
}
//���彻ͨ������Vehicle��һ��С����Car��һ����������Bus�ࡣʵ��Car��Bus��Vehicle�ļ̳С�
//����һ����ͨ������Vehicle���������԰������ٶ�speed�����kind����ɫcolor����������һ���������Ĺ��췽����
//���һ��С����Car���̳���Vehicle��Car���г�Ա����name�����췽����
//���һ������������Bus���̳���Vehicle�� Bus�����������ԣ���λ��passenger�����췽��ʵ�ָ�ֵ��
//����Car��Bus�Ķ���Ϊ������Ը�ֵ������ʾ��״̬���������ԣ���
