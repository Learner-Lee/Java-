package i数组;
class Repeat {
	public static void main(String args[]) {
		int[] a = { 1, 2, 3, 1, 0 };
		int i, j;
		boolean p = false; // 利用boolean类型，书写简单

		for (i = 0; i < a.length - 1; i++)
			for (j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					p = true;
					break;
				}
			}

		if (p == true)
			System.out.println("重复");
		else
			System.out.println("不重复");
	}
}

class Repeat１ {
	public static void main(String args[]) {
		int[] a = { 1, 2, 3, 4, 0 };
		int i, j;

		for (i = 0; i < a.length - 1; i++)
			for (j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("重复");
					return;
				}
			}
		if (i == a.length - 1)
			System.out.println("不重复");
	}
}