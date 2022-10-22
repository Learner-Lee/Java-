package i常用实用类important;
public class Java1_3 {
    public static void main(String[] args) {
        String a = System. getProperty ("os.name");
        String b = System. getProperty ("java.version");
        System.out.println("java版本："+   b);
        System.out.println("操作系统名字："+a);
    }
}
//System类的应用
//打开Java1_3.java，修改并调试运行程序。
//程序中定义了两个字符串变量（String类的对象）a和b，
//应用System.getProperty()函数获取Java系统版本与操作系统名称。要求完善程序实现上述功能。
