package i��Ͷ���Ĵ���_����;
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
			System.out.println("���С����С���ܾ�ȡ��");
		} else {
			System.out.println("ȡ��ɹ�");
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
		System.out.println("���δ�" + amount);
		balance = balance + amount;
		return amount;
	}

	public float withdraw(float amount) {
		System.out.println("����ȡ�" + amount);
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
			System.out.println("0���˳�");
			int key = scanner.nextInt();
			if (key == 0) {
				break;
			}

		}
	}
}
//������Account��ģ�������˻����ܡ�Ҫ�����£�
//��Ա���������ԣ���number(�˺�)��name����������address(��ַ)��balance(������)��minBalance=10(��С���)��
//��Ա������
//deposit�������������ķ����������������ʾ����ԭ�������մ��������մ����
//withdraw��ȡ����������ķ�����ȡ��ʱ����ȡ��ɹ�����ʾ��Ϣ��ʾ����������С����С���ܾ�ȡ�����ʾ��Ϣ��ʾ��
//tranfer��ת�ˣ����������������ֱ��������˻����󣬺�ת�˽�
//query(��ѯ)���޲�������ѯ��ǰ�˻�����������
//Display���������������˻��ĸ�����Ϣ��������ʾ��Ϣ�ɾݷ�����ԭ�����⡣

