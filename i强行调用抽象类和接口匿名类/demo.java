package i强行调用抽象类和接口匿名类;

abstract class demo {//抽象类，绝对不能创造对象（用于做父类模板，被别的类继承）
	void p() {
		System.out.println("bones");
	}

	abstract void T();
}

class Show {
	public static void main(String[] args) {
		
//		class son extends demo{//方法内部类
//
//			@Override
//			void T() {
//				System.out.println("White Fox");
//				
//			}
//			
//		}
//		demo demo1=new son();//多态，父类应用指向子类对象
//		demo1.p();
//		demo1.T();
//		System.out.println("永远的神");
//	}
	 demo demo1=new demo() {/*相当于定义了一个无名的类，继承demo类，
		                                               并实现了里面的抽象方法，匿名内部类*/
		 
			@Override
			void T() {
			System.out.println("White Fox");
			}
		};	
		demo1.p();
		demo1.T();
		System.out.println("永远的神");

	}

	
}
