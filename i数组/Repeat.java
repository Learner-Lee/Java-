package i����;
class Repeat {
	public static void main(String args[]) {
		int[] a = { 1, 2, 3, 1, 0 };
		int i, j;
		boolean p = false; // ����boolean���ͣ���д��

		for (i = 0; i < a.length - 1; i++)
			for (j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					p = true;
					break;
				}
			}

		if (p == true)
			System.out.println("�ظ�");
		else
			System.out.println("���ظ�");
	}
}

class Repeat�� {
	public static void main(String args[]) {
		int[] a = { 1, 2, 3, 4, 0 };
		int i, j;

		for (i = 0; i < a.length - 1; i++)
			for (j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("�ظ�");
					return;
				}
			}
		if (i == a.length - 1)
			System.out.println("���ظ�");
	}
}