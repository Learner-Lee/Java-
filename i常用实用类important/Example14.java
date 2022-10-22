package i常用实用类important;
public class Example14 {
	public static void main(String[] args) throws Exception {
		Runtime rt = Runtime.getRuntime();       //创建一个Runtime实例对象
		Process process = rt.exec("notepad.exe");// 得到表示进程的Process对象
		
		int sum=0;
		for (long i = 0; i < 1000000000; i++) {
			sum+=i;
		}
		
		process.destroy();           // 杀掉进程
	}
}
