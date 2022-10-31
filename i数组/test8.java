package i数组;

public class test8 {

	public static void main(String[] args) {
//		int a[]=new int [5];
		int a[] = {1,2,3,1,0};
		boolean pd=true;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					System.out.println("有重复");
					pd =false;
					break;
				}
			}
		}
		if (pd) {
			System.out.println("无重复");
		}
//		else {
//			System.out.println("有重复");
//		}
	}

}
