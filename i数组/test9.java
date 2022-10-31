package i数组;
public class test9 {

	public static void main(String[] args) {
		int [][] a=new int [11][11];//为什么会浪费一行？
//		a[0][0]=1;
		for (int i = 1; i < a.length; i++) {
			for (int j = 1; j < a[i].length; j++) {
				a[0][0]=1;
				a[i][0]=1;
				a[i][i]=1;
				a[i][j]=a[i-1][j-1]+a[i-1][j];						
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <i; j++) {
				System.out.printf("%5d",a[i-1][j]);
			}
			System.out.println();
		}
	}
}
