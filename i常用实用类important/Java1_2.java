package i����ʵ����important;
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
//StringBuffer���Ӧ��
//��Java1_2.java���޸Ĳ��������г���
//�����ж����������ɱ��ַ���sb1��sb2��Ϊsb1����ַ���"guangdong"��
//Ϊsb2����ַ���"peizhengxueyuan"���ٽ�sb2��ӵ�s1���档
//Ȼ����ʾ���sb1��sb1��ת���γɵ��ַ������ݡ�
