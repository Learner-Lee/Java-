package i类和对象的创建;

class Account {
	private String account;
	private String name;
	private String address;
	private double balance;
	static double minBalance = 10.0;

	public Account(String account, String name, String address, double balance) {
		this.account = account;
		this.address = address;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(double cash) {
		System.out.print(name+"账户原有余额：" + balance + "    ");
		System.out.print("现存入：" + cash + "    ");
		balance += cash;
		System.out.println("现有余额：" + balance);
	}

	public void withdraw(double cash) {
		double temp = balance - cash;
		if (temp < minBalance)
			System.out.println("至少保留余额：" + minBalance);
		else {
			balance = temp;
			System.out.println(name+",你取款成功!取款" + cash + "    " + "现有余额：" + balance);
		}
	}

	public void tranfer(Account a1, Account a2, double cash) {
		double temp = a1.balance - cash;
		if (temp < minBalance)
			System.out.println("余额不足！");
		else {
			a1.balance -= cash;
			a2.balance += cash;
			System.out.println("转账成功！");
			System.out.println(a1.name + "转出" + cash + "," + a2.name + "转入" + cash);
			System.out.println(a1.name + "现有余额：" + a1.balance + "," + a2.name + "现有余额：" + a2.balance);
		}

	}

	public void query() {
		System.out.println("现有余额：" + balance);
	}

	public String toString() {
		return "账号:" + account + "    " + "姓名:" + name + "    " + "地址:" + address + "    " + "现有余额:" + balance;
	}
}