package i������ͽӿڵ�Ӧ��_��ҵ;

interface Comput{
	  int add(int a,int b);
	}
class Jisuan{
	  // eat����Ҫ����Food����
	  public  void s(Comput c) {
	    int sum = c.add(10,20);
	    System.out.println("��ͽ����" + sum);
	  }
}

 class Test4{ 
	  // �����ڲ���
	  public static void main(String[] args) {
	     Comput c;
       c=(i,j)->{return i+j;};
	     Jisuan js=new Jisuan();
	     js.s(c);
	
     }
}
