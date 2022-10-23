package i抽象类和接口的应用_作业;

interface Comput{
	  int add(int a,int b);
	}
class Jisuan{
	  // eat方法要传入Food对象
	  public  void s(Comput c) {
	    int sum = c.add(10,20);
	    System.out.println("求和结果是" + sum);
	  }
}

 class Test4{ 
	  // 匿名内部类
	  public static void main(String[] args) {
	     Comput c;
       c=(i,j)->{return i+j;};
	     Jisuan js=new Jisuan();
	     js.s(c);
	
     }
}
