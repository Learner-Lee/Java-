package i����ʵ����important;
public class Example03 {
	public static void main(String[] args) {
		String str = "abcd";
		System.out.print("���ַ���תΪ�ַ������Ľ��:");
		
		char[] charArray = str.toCharArray(); // �ַ���ת��Ϊ�ַ�����
		
		for (int i = 0; i < charArray.length; i++) {
			if (i != charArray.length - 1) { 
				// ���������������һ��Ԫ��,��Ԫ�غ���Ӷ���
				System.out.print(charArray[i] + ",");
			} else {
				// ��������һ��Ԫ�غ��治�Ӷ���
				System.out.println(charArray[i]);
			}
		}
		
		System.out.println(12+34);
		System.out.println(String.valueOf(12)+34);//???
		
		System.out.println("���ַ���ת���ɴ�д֮��Ľ��:" + str.toUpperCase().toLowerCase());
		
	}
}
