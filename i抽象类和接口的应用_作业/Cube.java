package i������ͽӿڵ�Ӧ��_��ҵ;

import i������ͽӿڵ�Ӧ��_��ҵ.Cube.Rectangle;

public class Cube {
	double height;
	
	public Cube(double height) {
		super();
		this.height = height;
	}
	void tiji(double buttomarea) {
		double v=height*buttomarea;
		System.out.println(v);
	}
	class Rectangle{
		double width,height;
		double dimianji() {
			double buttomarea=width*height;
			return buttomarea;			
		}
		public Rectangle(double width, double height) {
			super();
			this.width = width;
			this.height = height;
		}
		
	}

}
class Test {

	public static void main(String[] args) {
		 Cube.Rectangle R1=new Cube(5).new Rectangle(10, 20);
		  System.out.println(R1.dimianji());
		  Cube R2=new Cube(5);
		  R2.tiji(R1.dimianji());
	}
		
}
//��1��	����һ��Cube�࣬���а���һ����Ա����height��һ����Ա��������������������(���βΣ��β�Ϊ�����)��
//��2��	�������ڲ�����һ��Rectangle�࣬���а�����������width��height��һ������������������
//��3������һ������Test1,����Rectangle���󣬲����÷�����������������Cube��Ķ���
//          ���߸�ֵ�������������������Ϊ������ĵף����������������
