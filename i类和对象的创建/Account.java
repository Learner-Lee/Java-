package i��Ͷ���Ĵ���;

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
		System.out.print(name+"�˻�ԭ����" + balance + "    ");
		System.out.print("�ִ��룺" + cash + "    ");
		balance += cash;
		System.out.println("������" + balance);
	}

	public void withdraw(double cash) {
		double temp = balance - cash;
		if (temp < minBalance)
			System.out.println("���ٱ�����" + minBalance);
		else {
			balance = temp;
			System.out.println(name+",��ȡ��ɹ�!ȡ��" + cash + "    " + "������" + balance);
		}
	}

	public void tranfer(Account a1, Account a2, double cash) {
		double temp = a1.balance - cash;
		if (temp < minBalance)
			System.out.println("���㣡");
		else {
			a1.balance -= cash;
			a2.balance += cash;
			System.out.println("ת�˳ɹ���");
			System.out.println(a1.name + "ת��" + cash + "," + a2.name + "ת��" + cash);
			System.out.println(a1.name + "������" + a1.balance + "," + a2.name + "������" + a2.balance);
		}

	}

	public void query() {
		System.out.println("������" + balance);
	}

	public String toString() {
		return "�˺�:" + account + "    " + "����:" + name + "    " + "��ַ:" + address + "    " + "�������:" + balance;
	}
}