package i����;

public class test11 {

	public static void main(String[] args) {
		
		System.out.println("-------------------------");
		int[][] d = new int[2][]; // ������ά����ʱ��ֻ����һά����
		// ��ά���Ȳ���
		d[0] = new int[3];
		d[1] = new int[4];
		// ��ʼ��
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				d[i][j] = i + j;
			}
		}
	System.out.println("����d�е�Ԫ�أ�");
	for (int i = 0; i < d.length; i++) {// ʹ��Ƕ�׵�forѭ�����
		for (int j = 0; j < d[i].length; j++) {
			System.out.print(d[i][j] + " ");
		}
		System.out.println();
}

		
		
		
		
		
		
		
		
//		int[][] c = new int[3][4]; // ��ά���鶯̬��ʼ����һά�Ͷ�ά��ָ������
//		for (int i = 0; i < c.length; i++) {// ʹ��Ƕ�׵�forѭ����ʼ����ά����
//			for (int j = 0; j < c[i].length; j++) {
//				c[i][j] = i + j;
//			}
//		}
//		System.out.println("����c�е�Ԫ�أ�");
//		for (int i = 0; i < c.length; i++) {// ʹ��Ƕ�׵�forѭ�����
//			for (int j = 0; j < c[i].length; j++) {
//				System.out.print(c[i][j] + " ");
//			}
//			System.out.println();
//		}

		
		
		
		
		
//		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
//		System.out.println("����aһά���ȣ�" + a.length);
//		System.out.println("����a��ά���ȣ�" + a[0].length);
//		System.out.println("����a�е�Ԫ�أ�");
//		for (int i = 0; i < a.length; i++) {// ʹ��Ƕ�׵�forѭ�����
//			for (int j = 0; j < a[i].length; j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
//		System.out.println("-------------------------");

	}

}
