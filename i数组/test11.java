package i数组;

public class test11 {

	public static void main(String[] args) {
		
		System.out.println("-------------------------");
		int[][] d = new int[2][]; // 声明二维数组时，只给出一维长度
		// 二维长度不等
		d[0] = new int[3];
		d[1] = new int[4];
		// 初始化
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				d[i][j] = i + j;
			}
		}
	System.out.println("数组d中的元素：");
	for (int i = 0; i < d.length; i++) {// 使用嵌套的for循环输出
		for (int j = 0; j < d[i].length; j++) {
			System.out.print(d[i][j] + " ");
		}
		System.out.println();
}

		
		
		
		
		
		
		
		
//		int[][] c = new int[3][4]; // 二维数组动态初始化，一维和二维都指定长度
//		for (int i = 0; i < c.length; i++) {// 使用嵌套的for循环初始化二维数组
//			for (int j = 0; j < c[i].length; j++) {
//				c[i][j] = i + j;
//			}
//		}
//		System.out.println("数组c中的元素：");
//		for (int i = 0; i < c.length; i++) {// 使用嵌套的for循环输出
//			for (int j = 0; j < c[i].length; j++) {
//				System.out.print(c[i][j] + " ");
//			}
//			System.out.println();
//		}

		
		
		
		
		
//		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
//		System.out.println("数组a一维长度：" + a.length);
//		System.out.println("数组a二维长度：" + a[0].length);
//		System.out.println("数组a中的元素：");
//		for (int i = 0; i < a.length; i++) {// 使用嵌套的for循环输出
//			for (int j = 0; j < a[i].length; j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
//		System.out.println("-------------------------");

	}

}
