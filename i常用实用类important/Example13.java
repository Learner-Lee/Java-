package i常用实用类important;
import java.io.*;
public class Example13 {
	public static void main(String[] args) throws IOException {
		Runtime rt = Runtime.getRuntime();    //创建Runtime实例对象
		rt.exec("notepad.exe");                 //调用exec()方法
		                                      //启动eclipse程序
	}
}
