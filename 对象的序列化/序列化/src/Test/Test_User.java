package Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test_User {
    public static void main(String[] args) throws IOException {
        User u = new User();
        u.setId(1101);
        u.setUsername("admin");
        u.setPassword("123456");
        u.setMoney(999.99);
        u.setMsg("第三关。。。");

        User u2 = new User(1102,"zhangsan","999",1.1,"第二关");
        User u3 = new User(1103,"a","99",3.1,"第7关");
        User u4 = new User(1104,"b","9",4.1,"第8关");


        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\学习\\数据结构+算法——学习资料\\课堂笔记\\对象的序列化\\user.bat"));
        oos.writeObject(u);
        oos.writeObject(u2);
        oos.writeObject(u3);
        oos.writeObject(u4);
        oos.flush();
        oos.close();
        System.out.println("游戏关闭，数据已保存");
    }
}
