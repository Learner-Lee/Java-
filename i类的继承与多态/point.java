package i��ļ̳����̬;

public class point {
	double x;
	double y;

	public point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void show() {
		System.out.println("����Ϊ" + "(" + x + "," + y + ")");
	}

}

class Circle extends point {

	double r;

	public Circle(double x, double y, double r) {
		super(x, y);
		this.r = r;
	}

	public void areaCi() {
		double sum;
		sum = 3.14 * r * r;
		System.out.println(sum);
	}
}

class Cylinder extends Circle {
	double h;

	public Cylinder(double x, double y, double r, double h) {
		super(x, y, r);
		this.h = h;
	}

	public void areaCy() {
		double a = 2 * 3.14 * r * r + 3.14 * r * 2;
		System.out.println("���=" + a);
	}

	public void Volume() {
		double v = 3.14 * r * r * h;
		System.out.println("���=" + v);
	}
}

class Test {
	public static void main(String[] args) {
		Cylinder cylinder1 = new Cylinder(4, 2, 1, 8);
		Cylinder cylinder2 = new Cylinder(5, 3, 6, 7);
		System.out.println("��һ��Բ����Ϊ");
		cylinder1.show();
		System.out.println("�뾶Ϊ" + cylinder1.r);
		System.out.println("��Ϊ" + cylinder1.h);
		cylinder1.areaCy();
		cylinder1.Volume();
		System.out.println("\n" + "��һ��Բ����Ϊ");
		cylinder2.show();
		System.out.println("�뾶Ϊ" + cylinder2.r);
		System.out.println("��Ϊ" + cylinder2.h);
		cylinder2.areaCy();
		cylinder2.Volume();
	}
}
//�������Point��Բ��Circle��Բ������Cylinder��ʵ�ּ̳й�ϵ��
//���һ����ʾ��άƽ���ϵ����Point��������ʾ����λ�õĳ�Ա����x��y�����췽��ʵ�ָ�x��y��ֵ��
//    ���һ����ʾ��άƽ����Բ����Circle�����̳���Point��
//������ʾԲ�뾶�ĳ�Ա����r�����췽��������Բ����ķ�����
//    ���һ����ʾԲ�������Cylinder,���̳�����Circle��������ʾԲ����ߵĳ�Աh��
//���췽��������Բ���������ķ���������Բ��������ķ�����
//    ��Test�����н���2��Cylinder�������������λ�����ꡢ�뾶���ߡ���������������ֵ��
