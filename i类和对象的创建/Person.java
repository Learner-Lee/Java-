package i类和对象的创建;


public class Person {
   private String name;
   private int age;
   
   public Person(String name,int age) {
	   this.name=name;
	   this.age=age;
   }
   
   void display() {
	   System.out.println("姓名是："+name+",年龄是："+age);
   }
}
