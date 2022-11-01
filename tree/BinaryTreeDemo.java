package tree;

public class BinaryTreeDemo {
    public static void main(String[] args) {

    }
}


// 定义BinaryTree 二叉树
class BinaryTree{
    private friandNode root;

    public void setRoot(friandNode root) {
        this.root = root;
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
            this.root.preOrder();
        }else {
            System.out.println("二叉树为空~~");
        }
    }
}


class friandNode{
    private int no;
    private String name;
    private friandNode left;
    private friandNode right;

    public friandNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
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
                "no=" + no +
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
            this.left.infixOrder();
        }
        //递归右子树遍历
        if (this.right != null) {
            this.right.infixOrder();
        }
        // 先输出父结点
        System.out.println(this);
    }
}
