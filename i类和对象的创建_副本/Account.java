package i类和对象的创建_副本;
import java.util.Scanner;

public class Account {
	private int number;
	private String name;
	private  String address;
	private float balance;
	private byte minbalance = 10;
	private float deposit;
	
	
	
	public Account() {
		
	}

	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public byte getMinbalance() {
		return minbalance;
	}


	public void setMinbalance(byte minbalance) {
		this.minbalance = minbalance;
	}


	public float getDeposit() {
		return deposit;
	}


	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}


	public void setBalance(float balance) {
		this.balance = balance;
	}

	public Account(String a ,float b) {
		name=a;
		balance=b;
	}
	
	
	
	public void deposit() {
		System.out.println(balance);
		int sum = (int) (balance + deposit);
		System.out.println(deposit);
		System.out.println(sum);
		balance = sum;
	}


	public void withdraw() {

		if (balance < minbalance) {
			System.out.println("余额小于最小余额，拒绝取款");
		} else {
			System.out.println("取款成功");
		}

	}
//	public float tranfer(Account a1,Account a2,float amount) {
//		double temp=balance-amonut;
//		if (balance >= amount&&amount>=10) {
//			return amount;
//		} else {
//			return 0;
//		}
//		
//		
//	}
	
	public float deposit(float amount) {
		System.out.println("本次存款：" + amount);
		balance = balance + amount;
		return amount;
	}

	public float withdraw(float amount) {
		System.out.println("本次取款：" + amount);
		balance = balance - amount;
		if (balance >= amount) {
			return amount;
		} else {
			return 0;
		}
	}

	public float getBalance() {
		return balance;
	}

	public void query() {
		System.out.println("balance");

	}

	public void Display() {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("0：退出");
			int key = scanner.nextInt();
			if (key == 0) {
				break;
			}

		}
	}
}
//创建类Account，模拟银行账户功能。要求如下：
//成员变量（属性）：number(账号)、name（姓名）、address(地址)、balance(存款余额)、minBalance=10(最小余额)。
//成员方法：
//deposit（存款）：带参数的方法，如存款操作后，显示储户原有余额、今日存款数额及最终存款余额。
//withdraw（取款）：带参数的方法，取款时，若取款成功，显示信息提示；若最后余额小于最小余额，拒绝取款，并显示信息提示。
//tranfer（转账）：带参数，参数分别是两个账户对象，和转账金额。
//query(查询)：无参数，查询当前账户的余额情况。
//Display（）方法：返回账户的个人信息，具体显示信息可据方便性原则自拟。

