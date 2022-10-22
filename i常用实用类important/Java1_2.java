package i常用实用类important;
public class Java1_2 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer(); 
         sb1.append("   guangdong  ");
         StringBuffer sb2 = new StringBuffer();
         sb2.append(" peizhengxueyuan"); 
         sb1.append(sb2);  
         System.out.println(   sb1   );  
         System.out.println(   sb1.reverse()   );
    }
}
//StringBuffer类的应用
//打开Java1_2.java，修改并调试运行程序。
//程序中定义了两个可变字符串sb1和sb2，为sb1添加字符串"guangdong"，
//为sb2添加字符串"peizhengxueyuan"。再将sb2添加到s1里面。
//然后显示输出sb1和sb1反转后形成的字符串内容。
