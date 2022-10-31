package Lx;
public class LX18 {
	public static void main(String args[]) {
		int i, j, n = 9;
		System.out.print("	*	|");
		for (i = 1; i <= n; i++)
			System.out.print("	" + i);
		System.out.print("\n------------|");

		for (i = 1; i <= n; i++)//为什么这行控制“-”的长度？
			System.out.print("-------");
		
		
		System.out.println();

		for (i = 1; i <= n; i++) {
			                  System.out.print("	" + i + "	|");//嵌套
		                  for (j = 1; j <= i; j++)
				              System.out.print("	" + i * j);
			                  System.out.println();
		           }
	}
}
