package Calculator;

public class ArrayCalculator {
    public static void main(String[] args) {
        // 根据思路，完成运算
        String expression = "3+2*6-2";
        // 创建两个栈，数栈与符号栈
        ArrayStack2 numStack = new ArrayStack2(10);
        ArrayStack2 operStack = new ArrayStack2(10);
        // 定义需要的变量
        int index = 0;// 用于扫描，指针；
        int num1 = 0;
        int num2 = 0;
        int oper = 0;
        int res = 0;
        char ch = ' ';//将每次扫描得到的char保存到ch
        // 开始 while 循环的扫描expression
        while (true) {
            // 依次得到expression 的每一个字符
            ch = expression.substring(index, index+1).charAt(0);
            // 判断ch是什么，然后做相应的处理
            if (operStack.isoper(ch)) {//如果是运算符
                // 判断当前的符号栈是否为空
                if (!operStack.isEmpty()) {
                    // 处理
                    if (operStack.priority(ch) <= operStack.priority(operStack.peek())) {
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        oper = operStack.pop();
                        res = numStack.calculate(num1,num2,oper);
                        // 把运算结果入数栈
                        numStack.push(res);
                        // 将当前操作符入符号栈
                        operStack.push(ch);
                    }else {
                        operStack.push(ch);
                    }
                }else {
                    //直接入栈
                    operStack.push(ch);
                }
            }else {// 如果是数
                numStack.push(ch - 48);// ASCII表
            }
            // 让index + 1，并判断是否扫描到expression最后，
            index++;
            if (index >= expression.length()) {
                break;
            }
        }

        while (true) {
            if (operStack.isEmpty()) {
                break;
            }
            num1 = numStack.pop();
            num2 = numStack.pop();
            oper = operStack.pop();
            res = numStack.calculate(num1,num2,oper);
            numStack.push(res);
        }
        // 将数栈最后一个数输出，就是结果
        System.out.printf("表达式%s = %d",expression,numStack.pop());
    }
}
//先定义一个栈
// 定义一个 ArrayStack2类，表示栈。需要拓展功能
class ArrayStack2{
    private int maxSize; // 栈的大小
    private int[] stack; // 数组模拟栈，数据放在数组中。
    private int top = -1; // top表示栈顶，初始化为-1。

    // 构造器
    public ArrayStack2(int maxSize){
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }

    // 栈满
    public boolean isFull(){
        return top == maxSize - 1;
    }
    //栈空
    public  boolean isEmpty(){
        return top == -1;
    }

    // 入栈-push
    public void push(int value){
        // 先判断栈是否满
        if (isFull()) {
            System.out.println("栈满");
            return; // 终止方法
        }
        top++;
        stack[top] = value;
    }

    // 出栈-pop,将栈顶的数据返回。
    public int pop(){
        // 判断栈是否为空
        if (isEmpty()) {
            // 抛出异常
            throw new RuntimeException("栈内没有数据");
        }
        int value = stack[top];
        top--;
        return value ;
    }

    // 显示栈的情况【遍历栈】,遍历时，需要从栈顶开始显示数据。
    public void list(){
        if (isEmpty()) {
            System.out.println("栈空，没有数据");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.printf("stack[%d] = %d\n",i,stack[i]);
        }

    }



    // 拓展功能
    // 返回运算符的优先级，优先级由程序员来决定。优先级使用数字表示。
    // 数字越大优先级越高。
    public int priority(int oper){
        if (oper == '*' || oper == '/') {
            return 1;
        }else if (oper == '+' || oper == '-') {
            return 0;
        }else{
            return -1;
        }
    }
    //  判断是否是一个运算符
    public boolean isoper(char val){
        return val == '+' || val == '-' || val == '*' || val == '/';
    }

    // 计算方法
    public int calculate(int num1 , int num2 ,int oper){
        int res = 0;
        switch (oper) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num2 - num1;// 注意顺序
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num2 / num1;
                break;
            default:
                break;
        }
        return res;
    }

    //返回当前栈顶的值，但不是出栈
    public int peek(){
        return stack[top];
    }
}
