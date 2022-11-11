package queue;

import java.util.Scanner;

public class CirculationQueueDemo {
    public static void main(String[] args) {
        // 测试
        // 创建一个列表
        System.out.println("测试CirculationQueueDemo的代码");
        CirculationQueue Queue = new CirculationQueue(3);
        char key = ' '; // 接收用户输入
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        //输出一个菜单
        while (loop) {
            System.out.println("s(show): 显示队列");
            System.out.println("e(exit): 退出程序");
            System.out.println("a(add): 添加数据到队列");
            System.out.println("g(get) : 从队列取出数据");
            System.out.println("h(head): 查看队列头的数据");
            System.out.println("Circulation.请输入你的选择：");
            key = scanner.next().charAt(0);// 接收一个字符
            switch (key) {
                case 's':// 显示队列
                    Queue.showQueue();
                    break;
                case 'a':// 添加数据
                    System.out.println("请输入一个数");
                    int value = scanner.nextInt();
                    Queue.addQueue(value);
                    break;
                case 'g':// 取出数据
                    try {
                        int res = Queue.getQueue();
                        System.out.printf("输出数据为：%d\n",res);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':// 查看头数据
                    try {
                        int res = Queue.headQueue();
                        System.out.printf("头数据为：%d\n",res);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':// 退出程序
                    scanner.close();
                    loop = false;
                    break;

                default:
                    break;
            }

        }
        System.out.println("程序退出~~");
    }
}

class CirculationQueue{
    private int maxSize;// 表示数组的最大容量
    private int front;// 队列头
    // rear变量的含义做一个调整：rear指向队列的最后一个元素的后一个位置，因为希望空出一个空间做为约定，rear的初始值 = 0

    private int rear;// 队列尾
    // front变量的含义做一个调整：front指向队列的第一个元素，也就是说arr[front]就是队列的第一个元素，front的初始值 = 0

    private int[] arr;// 该数据用于存放数据，模拟队列

    // 创建队列的构造器
    public CirculationQueue(int arrMaxSize){
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = 0;
        rear = 0;
    }

    // 判断队列是否满
    public boolean isFull(){
        return (rear + 1)% maxSize == front ;// 空出最后一个数
    }

    // 判断队列是否为空
    public boolean isEmpty(){
        return rear == front ;
    }

    // 添加数据到队列
    public void addQueue(int n){
        // 判断队列是否满
        if (isFull()) {
            System.out.println("队列满，不能加入数据~");
            return;
        }
        // 直接将数据加入
        arr[rear] = n;
        // 将 rear 后移，这里必须考虑循环
        rear = (rear + 1)%maxSize;
    }

    // 获取队列数据，出队列
    public int getQueue(){
        int val = 0;
        if (isEmpty()) {
            //通过抛出异常
            throw new RuntimeException("队列空，不能取数据");
        }
        /*
        这里需要分析出 front 是指向队列的第一个元素
        1. 先把 front 对应的值保留到一个临时变量
        2. 将 front 后移，需要考虑取模
        3. 将临时保存的变量返回
         */
        val = arr[front];
        front = (front + 1) % maxSize;
        return val;
    }

    // 显示队列的所有数据
    public void showQueue(){
        // 遍历
        if (isEmpty()) {
            System.out.println("队列空，没有数据~");
            return;
        }
        for (int i = front; i < front + size(); i++) {// 为什么不会越界
            System.out.printf("arr[%d]=%d\n", i % maxSize, arr[i % maxSize]);
        }
    }

    // 求出当前队列有效数据的个数
    public int size(){
        // rear = 2
        // front = 1
        // maxsize = 3
        return (rear + maxSize - front) % maxSize;
    }

    // 显示队列的头数据
    public int headQueue(){
        // 判断
        if (isEmpty()) {
            throw new RuntimeException("队列空，没有数据");
        }
        return arr[front];
    }
}