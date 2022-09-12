package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Test_User2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的编号：");
        int id = sc.nextInt();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\学习\\数据结构+算法——学习资料\\课堂笔记\\对象的序列化\\user.bat"));

        while (true) {
            try {
                User u = (User)ois.readObject();
                if (u.getId() == id ) {
                    System.out.println(u);
                    break;
                }else{
                    System.out.println("编号有问题");
                    break;
                }
            } catch (Exception e) {
                break;
            }
        }
    }
}
