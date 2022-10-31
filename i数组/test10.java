package i数组;
public class test10 {

	public static void main(String[] args) {
		int  [][] d=new int [2][];
        for (int i=0; i<d.length; i++) {
        	for (int j = 0; j < d.length; j++) {
				d [i] [j]=i + j;
				
			}
        }
		System.out.println("数组d中的元素：");
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				System.out.println(d[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
