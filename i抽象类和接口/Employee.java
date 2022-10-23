package i抽象类和接口;
public  abstract class Employee {
	public abstract double earnings( );
	
}
class YearWorker extends Employee{
	@Override
	public double earnings() {
		return 1000;
	}	
	void manner() {
		System.out.println("YearWorker对象按年领取薪水");
	}
}
class MonthWorker extends Employee{
	@Override
	public double earnings() {
		return 100;
	}	
	void manner() {
		System.out.println("MonthWorker对象按月领取薪水");
	}
}
class WeekWorker extends Employee{
	@Override
	public double earnings() {
		return 10;
	}
	void manner() {
		System.out.println("WeekWorker对象按周领取薪水");
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

//1、定义一个abstract（抽象）类，类名为Employee。Employee的子类有YearWorker，MonthWorker和WeekWorker
//YearWorker对象按年领取薪水，MonthWorker对象按月领取薪水，WeekWorker对象按周领取薪水。
//Employee类有一个抽象方法：public abstract double earnings( );各子类重写父类的earnings方法，
//给出各自领取报酬的具体方式。
//定义一个主类Test1，并在主方法中定义三个子类对象 ，并分别调用earnings方法，输出各自领取薪水的方式。
