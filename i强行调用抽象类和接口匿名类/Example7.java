package i强行调用抽象类和接口匿名类;
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
      Cubic1 cu=new Cubic1() {         //和接口有关的匿名类
                   public double getCubic(double x) {
                      return x*x*x;                 
                   }
               };
     System.out.println(cu.getCubic(5));  
     cu= (double x)->{               //使用Lambada表达式简化代码
                       return x*x*x;                 
                     };
     System.out.println(cu.getCubic(2)); 
     A1 a=new A1();
     a.f((double x)-> {               //使用Lambada表达式简化代码
                        return x*x*x;                 
                      });
   } 
}




