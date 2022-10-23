package i类和对象的创建_副本;

public class person {
	String name ;
	int age;
	void display() {
		System.out.println(name);
		System.out.println(age);
	}

}
//1、	编写Person类
//1）	该类包含两个私有成员name,age；
//2）	定义构造方法，用来初始化name和age
//3）	定义一个display方法，将姓名和年龄打印出来。
class Test{
	public static void main(String[] args) {
		person person1=new person();
		person1.age=100;
		person1.name="张三";
	    person1.display();
	}
}
