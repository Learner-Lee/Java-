package i常用实用类important;
public class Java1_1{
	   public static void main(String[ ] args){
		 char a[]={'p','e','i','z','h','e','n','g','x','u','e','y','u','a','n'};     
		String s1 = new String(a,8,7);
		String s2 = s1.toUpperCase();
		System.out.println(  s2  );
	   }
}
//打开Java1_1.java，修改并调试运行程序。toUpperCase(),substring(7,a.length)   
//完善程序，对字符数组截取字符，使得程序运行结果为XUEYUAN ;
