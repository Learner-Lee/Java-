package i����;
import java.util.Scanner;
public class test5 {
	public static void main(String[] args) {
		float[] a=new float[10];
		Scanner s=new Scanner(System.in);
		System.out.println("������ѧ���ɼ���");
		float sum=0, max=0,min=100,avg=0;
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextFloat();
			sum+=a[i];
			if (max<a[i]) {				
				max=a[i];				
			}
			if (min>a[i]) {
				min=a[i];
			}
		}
		avg=(sum-max-min)/(a.length-2);
		System.out.println("��ѡ�ֵ÷��ǣ�"+avg);
	}

}
