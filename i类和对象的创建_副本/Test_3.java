package i类和对象的创建_副本;

public class Test_3 {

	public static void main(String[] args) {
		Account p1=new Account();
		Account p2=new Account();
		p1.setName("Tom");
		p1.setBalance(2000);
		p2.setName("koko");
		p2.setBalance(20);
		System.out.println(p1.getDeposit());
		System.out.println(p1);
		System.out.println(p1);
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
