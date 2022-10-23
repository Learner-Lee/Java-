package i抽象类和接口;

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
		System.out.println("GoldenMonkey住在房间里");

	}

	@Override
	public void getMoney() {
		System.out.println("GoldenMonkey卖10000元每斤");

	}

	@Override
	void enjoy() {
		System.out.println("GoldenMonkey喜欢吃香蕉");
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

//2、接口的定义及使用
//（1）定义一个接口Valuable（值钱的东西），该接口中有一个抽象方法getMoney()，该方法表示值多少钱；
//（2）定义另一个接口Protectable（受保护的东西），该接口中有一个抽象方法beProtected()，
//         该方法表示怎么被保护。
//（3）定义一个抽象类Animal，该类中有成员变量name,tizhong还有一个抽象方法enjoy()，该方法表示动物的爱好。
//（4）定义一个GoldenMonkey类，该类继承Animal类，并同时实现了Valuable、Protectable接口。
//          enjoy()方法实现：输出“GoldenMonkey喜欢吃香蕉”；getMoney()方法实现：GoldenMonkey卖10000元每斤；
//          beProtected()方法实现：GoldenMonkey住在房间里。
//（5）定义一个主类Test2，并创建GoldenMonkey对象，并调用它的所有方法，实现输出。
