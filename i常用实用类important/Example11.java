package i����ʵ����important;
public class Example11 {
	public static void main(String[] args) {
		int[] fromArray = { 101, 102, 103, 104, 105, 106 };     //Դ����
		int[] toArray = { 201, 202, 203, 204, 205, 206, 207 }; //Ŀ������
		System.arraycopy(fromArray, 2, toArray, 3, 4);     //Դ������±�2��ʼ�����Ƶ�Ŀ�������±�3��λ�ã�����4��
		// ��ӡĿ�������е�Ԫ��
          for (int i = 0; i < toArray.length; i++) {
			System.out.println(i + ": " + toArray[i]);
		}
	}
}
