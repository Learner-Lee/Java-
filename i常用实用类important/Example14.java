package i����ʵ����important;
public class Example14 {
	public static void main(String[] args) throws Exception {
		Runtime rt = Runtime.getRuntime();       //����һ��Runtimeʵ������
		Process process = rt.exec("notepad.exe");// �õ���ʾ���̵�Process����
		
		int sum=0;
		for (long i = 0; i < 1000000000; i++) {
			sum+=i;
		}
		
		process.destroy();           // ɱ������
	}
}
