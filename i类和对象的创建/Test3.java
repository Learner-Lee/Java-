package i��Ͷ���Ĵ���;


public class Test3 {

	public static void main(String[] args) {
		Account account1=new Account("001", "����", "����ѧԺ", 1000);
		Account account2=new Account("002", "����", "�廪��ѧ", 500);	
		System.out.println(account1.toString());
		System.out.println(account2.toString());
		
		account1.deposit(500);
		account2.withdraw(400);
		account1.tranfer(account1, account2, 300);
		account1.query();
		account2.query();
		

	}

}
