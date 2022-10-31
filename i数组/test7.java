package i数组;
public class test7 {

	public static void main(String[] args) {
		int [ ] a= {5,7,3,43};
		int[] b=new int [4];
		for (int i=0; i<b.length;i++) {
			b[i] =i+1;
			System.out.print(b[i]+"  ");
		}
		System.out.println("\n数组a中的元素是：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"  ");
		}
	}
}
