package i����ʵ����important;
class Example01 {
	public static void main(String[] args) throws Exception {
		
		String str1 = new String();// ����һ���յ��ַ���
		
		String str2 = new String("abcd");// ����һ������Ϊabcd���ַ���
		
		char[] charArray = new char[]{'D','E','F'};// ����һ������Ϊ�ַ�������ַ���
		String str3 = new String(charArray);
	
		System.out.println("a"+str1+"b");
		System.out.println(str2);
		System.out.println(str3);
	}
}
