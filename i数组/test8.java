package i����;

public class test8 {

	public static void main(String[] args) {
//		int a[]=new int [5];
		int a[] = {1,2,3,1,0};
		boolean pd=true;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					System.out.println("���ظ�");
					pd =false;
					break;
				}
			}
		}
		if (pd) {
			System.out.println("���ظ�");
		}
//		else {
//			System.out.println("���ظ�");
//		}
	}

}
