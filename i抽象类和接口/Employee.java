package i������ͽӿ�;
public  abstract class Employee {
	public abstract double earnings( );
	
}
class YearWorker extends Employee{
	@Override
	public double earnings() {
		return 1000;
	}	
	void manner() {
		System.out.println("YearWorker��������ȡнˮ");
	}
}
class MonthWorker extends Employee{
	@Override
	public double earnings() {
		return 100;
	}	
	void manner() {
		System.out.println("MonthWorker��������ȡнˮ");
	}
}
class WeekWorker extends Employee{
	@Override
	public double earnings() {
		return 10;
	}
	void manner() {
		System.out.println("WeekWorker��������ȡнˮ");
	}
}
class Test01 {

	public static void main(String[] args) {
		YearWorker person1=new YearWorker();
		MonthWorker person2=new MonthWorker();
		WeekWorker person3=new WeekWorker();	
		person1.manner();
		System.out.println(person1.earnings());
		person2.manner();
		System.out.println(person2.earnings());
		person3.manner();
		System.out.println(person3.earnings());

	}

}

//1������һ��abstract�������࣬����ΪEmployee��Employee��������YearWorker��MonthWorker��WeekWorker
//YearWorker��������ȡнˮ��MonthWorker��������ȡнˮ��WeekWorker��������ȡнˮ��
//Employee����һ�����󷽷���public abstract double earnings( );��������д�����earnings������
//����������ȡ����ľ��巽ʽ��
//����һ������Test1�������������ж�������������� �����ֱ����earnings���������������ȡнˮ�ķ�ʽ��
