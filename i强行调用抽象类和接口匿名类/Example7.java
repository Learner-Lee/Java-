package iǿ�е��ó�����ͽӿ�������;
interface Cubic1 {
   double getCubic(double x);
}

class A1 {
   void f(Cubic cubic) {
       double result=cubic.getCubic(3); 
       System.out.println("result="+result);
   } 
}
public class Example7 {
   public static void main(String args[]) {
      Cubic1 cu=new Cubic1() {         //�ͽӿ��йص�������
                   public double getCubic(double x) {
                      return x*x*x;                 
                   }
               };
     System.out.println(cu.getCubic(5));  
     cu= (double x)->{               //ʹ��Lambada���ʽ�򻯴���
                       return x*x*x;                 
                     };
     System.out.println(cu.getCubic(2)); 
     A1 a=new A1();
     a.f((double x)-> {               //ʹ��Lambada���ʽ�򻯴���
                        return x*x*x;                 
                      });
   } 
}




