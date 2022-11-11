package tree;

public class ThreadedBinaryTreeDemo {
    public static void main(String[] args) {
        // 测试一把中序线索二叉树功能
        // 创建所需要的结点
        friandNode02 root = new friandNode02(1,"法夫塔");
        friandNode02 node2 = new friandNode02(3,"雷姆");
        friandNode02 node3 = new friandNode02(6,"伊雷娜");
        friandNode02 node4 = new friandNode02(8,"休比");
        friandNode02 node5 = new friandNode02(10,"Sonnie");
        friandNode02 node6 = new friandNode02(14,"吉卜莉尔");

        // 二叉树，手动创建
        root.setLeft(node2);
        root.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);

        // 测试中序线索化
        ThreadBinaryTree threadBinaryTree = new ThreadBinaryTree();
        threadBinaryTree.setRoot(root);
        threadBinaryTree.threadedNodes();

        //测试：以10号结点测试
        friandNode02 leftNode = node5.getLeft();
        friandNode02 rightNode = node5.getRight();
        System.out.println("10号前驱结点=" + leftNode);
        System.out.println("10号后驱结点=" + rightNode);

        // 遍历线索化二叉树
        System.out.println("线索化遍历");
        threadBinaryTree.threadedList();// 8, 3, 10, 1, 14, 6

    }
}



/**
 * 给original结点赋值，并连接成二叉树
 */
// 定义ThreadBinaryTree 线索化二叉树
class ThreadBinaryTree{
    private friandNode02 root;

    // 为了实现线索化，需要创建要给指向当前结点的前驱节点的指针
    // 在递归进行线索化时，pre 总是保留一个结点
    private friandNode02 pre = null;

    public void setRoot(friandNode02 root) {
        this.root = root;
    }

    // 重载一把threadedNodes方法
    public void threadedNodes(){
        this.threadedNodes(root);
    }

    // 编写对二叉树进行中序遍历线索化的方法
    /**
     * @param node 就是
     */
    public void threadedNodes(friandNode02 node){
        // 如果node == null, 不能线索化
        if (node == null) {
            return;
        }
        // 1. 先线索化左子树
        threadedNodes(node.getLeft());
        // 2. 线索化当前节点

        // 处理当前结点的前驱节点
        if (node.getLeft() == null) {
            // 让当前结点的左指针指向前驱节点
            node.setLeft(pre);
            // 修改当前结点的左指针的类型
            node.setLeftType(1);
        }
        // 处理当前结点的前驱节点
        if (pre != null && pre.getRight() == null) {
            // 让前驱结点的右指针指向前驱结点
            pre.setRight(node);
            // 修改前驱结点的右指针的类型
            pre.setRightType(1);
        }
        // !!!重要
        pre = node;

        // 3. 在线索化右子树
        threadedNodes(node.getRight());

    }

    /**
     * 遍历线索化二叉树（中序）
     */
    public void threadedList(){
        // 定义一个变量，存储当前遍历的结点，从root开始
        friandNode02 node = root;
        while (node != null) {
            //循环找到leftType == 1 的结点，第一个找到就是8结点
            //后面随着遍历而变化，因为当leftType == 1时，说明该节点是按照线索化
            //处理后面的有效节点
            while (node.getLeftType() == 0) {
                node = node.getLeft();
            }

            // 打印当前这个结点
            System.out.println(node);
            // 如果当前结点的右指针指向的是后继节点，就一直输出
            while (node.getRightType() == 1) {
                // 获取当前结点的后继结点
                node = node.getRight();
                System.out.println(node);
            }
            //替换这个遍历的结点
            node = node.getRight();
        }
    }



    // 删除结点
    public void delNode(int no){
        if (root != null) {
            // 如果只有一个root结点，这里立刻判断root是不是就是要删除的结点
            if (root.getNo() == no) {
                root = null;
            }else {
                // 递归删除
                root.delNode(no);
            }
        }else {
            System.out.println("空树，不能删除~");
        }
    }

    // 前序遍历
    public void preOrder(){
        if (this.root != null) {
            this.root.preOrder();
        }else {
            System.out.println("二叉树为空~~");
        }
    }
    // 中序遍历
    public void infixOrder(){
        if (this.root != null) {
            this.root.infixOrder();
        }else {
            System.out.println("二叉树为空~~");
        }
    }
    // 后序遍历
    public void postOrder(){
        if (this.root != null) {
            this.root.postOrder();
        }else {
            System.out.println("二叉树为空~~");
        }
    }


    // 前序遍历查找
    public friandNode02 preOrderSearch(int n){
        if (root != null) {
            return root.preOrderSearch(n);
        }else {
            return null;
        }
    }
    // 中序遍历查找
    public friandNode02 infixOrderSearch(int n){
        if (root != null) {
            return root.infixOrderSearch(n);
        }else {
            return null;
        }
    }
    // 后序遍历查找
    public friandNode02 postOrderSearch(int n){
        if (root != null) {
            return root.postOrderSearch(n);
        }else {
            return null;
        }
    }
}







/**
 * 建立二叉树
 * 建立original结点，并定义方法
 */
// 建立二叉树结点

class friandNode02{
    private int num; // 需要赋值
    private String name; // 需要赋值
    private friandNode02 left; // 左子树
    private friandNode02 right;// 右子树
    // 说明
    // 1. 如果leftType == 0表示指向的是左子树，如果为 1 则表示指向的是前驱结点
    // 2. 如果rightType == 0表示指向的是右子树，如果为 1 则表示指向的是后继结点
    private int leftType;
    private int rightType;

    public int getLeftType() {
        return leftType;
    }

    public void setLeftType(int leftType) {
        this.leftType = leftType;
    }

    public int getRightType() {
        return rightType;
    }

    public void setRightType(int rightType) {
        this.rightType = rightType;
    }

    public friandNode02(int no, String name) { // 赋初值
        this.num = no;
        this.name = name;
    }

    // 给与修改权
    public int getNo() {
        return num;
    }

    public void setNo(int no) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public friandNode02 getLeft() {
        return left;
    }

    public void setLeft(friandNode02 left) {
        this.left = left;
    }

    public friandNode02 getRight() {
        return right;
    }

    public void setRight(friandNode02 right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "friandNode02{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }

    // 前序遍历
    public void preOrder(){
        System.out.println(this); // 先输出父结点
        //递归左子树遍历
        if (this.left != null) {
            this.left.preOrder();
        }
        //递归右子树遍历
        if (this.right != null) {
            this.right.preOrder();
        }
    }


    // 中序遍历
    public void infixOrder(){
        //递归左子树遍历
        if (this.left != null) {
            this.left.infixOrder();
        }
        // 先输出父结点
        System.out.println(this);
        //递归右子树遍历
        if (this.right != null) {
            this.right.infixOrder();
        }
    }


    // 后序遍历
    public void postOrder(){
        //递归左子树遍历
        if (this.left != null) {
            this.left.postOrder();
        }
        //递归右子树遍历
        if (this.right != null) {
            this.right.postOrder();
        }
        // 先输出父结点
        System.out.println(this);
    }


    // 递归删除结点
    /**
     * 1. 如果是叶子结点就删除该节点
     * 2. 如果是非叶子结点就删除该子树
     */
    public void delNode (int no){

        // 1.如果当前结点的左子结点不为空，并且左子结点就是要删除的结点，就将this.left = null ; 并且返回（结束递归删除）
        if (this.left != null && this.left.num == no) {
            this.left = null;
            return;
        }
        // 2.如果当前结点的右子结点不为空，并且右子结点就是要删除的结点，就将this.right = null ; 并且返回（结束递归删除）
        if (this.right != null && this.right.num == no) {
            this.right = null;
            return;
        }
        // 3.左递归删除
        if (this.left != null) {
            this.left.delNode(no);
        }
        // 3.右递归删除
        if (this.right != null) {
            this.right.delNode(no);
        }

    }



    // 前序遍历查找
    /**
     * no  查找no
     * 找到返回node ，没有返回null
     */
    public friandNode02 preOrderSearch(int n){
        System.out.printf("前序遍历查询 ------------ %d\n", 1);
        // 比较当前节点是不是
        if (this.num == n) {
            return this;
        }
        // 1.判断当前节点的左节点是否为空，如果不为空，则递归前序查找
        // 2.如果左递归前序查找，找到结点，则返回
        friandNode02 resNode = null ;
        if (this.left != null) {
            resNode = this.left.preOrderSearch(n);
        }
        if (resNode != null) {
            return resNode;
        }
        // 1.如果没找到，继续判断
        // 2.当前结点的右节点是否为空，如果不为空，则继续向右查找
        if (this.right != null) {
            resNode = this.right.preOrderSearch(n);
        }
        // 无论何值直接返回
        return resNode;
    }

    // 中序遍历查找
    public friandNode02 infixOrderSearch(int n){

        //判断当前结点的左子结点是否为空，如果不为空，则递归中序查找
        friandNode02 resNode = null ;
        if (this.left != null) {
            resNode = this.left.infixOrderSearch(n);
        }
        if (resNode != null) {
            return resNode;
        }


        System.out.printf("前序遍历查询 ------------ %d\n", 2);
        // 如果找到，则返回，如果没有找到，就和当前结点比较，如果是则返回当前结点
        if (this.num == n) {
            return this;
        }

        // 否则继续进行右递归的中序查找
        if (this.right != null) {
            resNode = this.right.infixOrderSearch(n);
        }
        return resNode;
    }

    // 后序遍历查找
    public friandNode02 postOrderSearch(int n){

        //判断当前结点的左子结点是否为空，如果不为空，则递归后序查找
        friandNode02 resNode = null ;
        if (this.left != null) {
            resNode = this.left.postOrderSearch(n);
        }
        if (resNode != null) {
            return resNode;
        }
        //如果左子树没有找到，则向右递归进行后序遍历查找
        if (this.right != null) {
            resNode = this.right.postOrderSearch(n);
        }
        if (resNode != null) {
            return resNode;
        }


        System.out.printf("前序遍历查询 ------------ %d\n", 3);
        // 如果左右子树都没有找到，就比较当前结点是不是
        if (this.num == n) {
            return this;
        }
        return resNode;
    }
}
