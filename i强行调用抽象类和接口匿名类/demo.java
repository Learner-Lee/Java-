package iǿ�е��ó�����ͽӿ�������;

abstract class demo {//�����࣬���Բ��ܴ����������������ģ�壬�������̳У�
	void p() {
		System.out.println("bones");
	}

	abstract void T();
}

class Show {
	public static void main(String[] args) {
		
//		class son extends demo{//�����ڲ���
//
//			@Override
//			void T() {
//				System.out.println("White Fox");
//				
//			}
//			
//		}
//		demo demo1=new son();//��̬������Ӧ��ָ���������
//		demo1.p();
//		demo1.T();
//		System.out.println("��Զ����");
//	}
	 demo demo1=new demo() {/*�൱�ڶ�����һ���������࣬�̳�demo�࣬
		                                               ��ʵ��������ĳ��󷽷��������ڲ���*/
		 
			@Override
			void T() {
			System.out.println("White Fox");
			}
		};	
		demo1.p();
		demo1.T();
		System.out.println("��Զ����");

	}

	
}
