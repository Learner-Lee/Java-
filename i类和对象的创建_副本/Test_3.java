package i��Ͷ���Ĵ���_����;

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
//������Account��ģ�������˻����ܡ�Ҫ�����£�
//��Ա���������ԣ���number(�˺�)��name����������address(��ַ)��balance(������)��minBalance=10(��С���)��
//��Ա������
//deposit�������������ķ����������������ʾ����ԭ�������մ��������մ����
//withdraw��ȡ����������ķ�����ȡ��ʱ����ȡ��ɹ�����ʾ��Ϣ��ʾ����������С����С���ܾ�ȡ�����ʾ��Ϣ��ʾ��
//tranfer��ת�ˣ����������������ֱ��������˻����󣬺�ת�˽�
//query(��ѯ)���޲�������ѯ��ǰ�˻�����������
//Display���������������˻��ĸ�����Ϣ��������ʾ��Ϣ�ɾݷ�����ԭ�����⡣
