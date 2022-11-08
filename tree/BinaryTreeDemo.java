package tree;

public class BinaryTreeDemo {
    public static void main(String[] args) {
        // 先需要创建二叉树
        BinaryTree binaryTree = new BinaryTree();
        // 创建所需要的结点
        friandNode root = new friandNode(1,"法夫塔");
        friandNode node2 = new friandNode(2,"雷姆");
        friandNode node3 = new friandNode(3,"伊雷娜");
        friandNode node4 = new friandNode(4,"休比");
        friandNode node5 = new friandNode(5,"Sonnie");
        friandNode node6 = new friandNode(6,"白");
        friandNode node7 = new friandNode(7,"吉卜莉尔");

        // 说明，我们先手动创建二叉树，后面我们学习用递归创建二叉树
        root.setLeft(node2);
        root.setRight(node3);
        node3.setRight(node4);
        node3.setLeft(node5);
        node2.setRight(node6);
        node2.setLeft(node7);
        binaryTree.setRoot(root);

        // 测试
        System.out.println("前序遍历");// 1,2,3,5,4
        binaryTree.preOrder();

        // 测试
        System.out.println("中序遍历");// 2,1,5,3,4
        binaryTree.infixOrder();

        // 测试
        System.out.println("后序遍历");// 2,5,4,3,1
        binaryTree.postOrder();

        // 前序遍历查找
        // 遍历次数：4
        System.out.println("前序遍历方式~~");
        friandNode resnode1 = binaryTree.preOrderSearch(5);
        if (resnode1 != null) {
            System.out.printf("信息为num = %d , name = %s\n",resnode1.getNo(),resnode1.getName());
        }else {
            System.out.println("没有找到");
        }

        // 中序遍历查找
        // 遍历次数：3
        System.out.println("中序遍历方式~~");
        friandNode resnode2 = binaryTree.infixOrderSearch(5);
        if (resnode2 != null) {
            System.out.printf("信息为num = %d , name = %s\n",resnode2.getNo(),resnode2.getName());
        }else {
            System.out.println("没有找到");
        }


        // 后序遍历查找
        // 遍历次数：2
        System.out.println("后序遍历方式~~");
        friandNode resnode3 = binaryTree.postOrderSearch(5);
        if (resnode3 != null) {
            System.out.printf("信息为num = %d , name = %s\n",resnode3.getNo(),resnode3.getName());
        }else {
            System.out.println("没有找到");
        }


        // 测试删除结点

        System.out.println("删除前，前序遍历");
        binaryTree.preOrder();
//        binaryTree.delNode(5);// 删除叶子结点
        binaryTree.delNode(3);// 删除子二叉树
        System.out.println("删除后，前序遍历");
        binaryTree.preOrder();


    }
}


/**
 * 给original结点赋值，并连接成二叉树
 */
// 定义BinaryTree 二叉树
class BinaryTree{
    private friandNode root;

    public void setRoot(friandNode root) {
        this.root = root;
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
    public friandNode preOrderSearch(int n){
        if (root != null) {
            return root.preOrderSearch(n);
        }else {
            return null;
        }
    }
    // 中序遍历查找
    public friandNode infixOrderSearch(int n){
        if (root != null) {
            return root.infixOrderSearch(n);
        }else {
            return null;
        }
    }
    // 后序遍历查找
    public friandNode postOrderSearch(int n){
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

class friandNode{
    private int num; // 需要赋值
    private String name; // 需要赋值
    private friandNode left; // 左子树
    private friandNode right;// 右子树

    public friandNode(int no, String name) { // 赋初值
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

    public friandNode getLeft() {
        return left;
    }

    public void setLeft(friandNode left) {
        this.left = left;
    }

    public friandNode getRight() {
        return right;
    }

    public void setRight(friandNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "friandNode{" +
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
    public friandNode preOrderSearch(int n){
        System.out.printf("前序遍历查询 ------------ %d\n", 1);
        // 比较当前节点是不是
        if (this.num == n) {
            return this;
        }
        // 1.判断当前节点的左节点是否为空，如果不为空，则递归前序查找
        // 2.如果左递归前序查找，找到结点，则返回
        friandNode resNode = null ;
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
    public friandNode infixOrderSearch(int n){

        //判断当前结点的左子结点是否为空，如果不为空，则递归中序查找
        friandNode resNode = null ;
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
    public friandNode postOrderSearch(int n){

        //判断当前结点的左子结点是否为空，如果不为空，则递归后序查找
        friandNode resNode = null ;
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
