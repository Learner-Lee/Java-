package i_while循环的用法;

public class Test {

	public static void main(String[] args) {
		int i=0;
		int sum=0;
		while (i<=10) {
			i++;
			System.out.print(i+"  ");
			sum+=i;
		}
		System.out.println();
		System.out.println(sum );

	}

}
