package tree;

public class ArrBinaryTreeDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        // 测试
        ArrBinaryTree arrBinaryTree = new ArrBinaryTree(arr);

        System.out.println("前序");
        arrBinaryTree.preOrder();
        System.out.println("");

        System.out.println("中序");
        arrBinaryTree.infixOrder();
        System.out.println("");

        System.out.println("后序");
        arrBinaryTree.postOrder();
    }
}

// 编写一个ArrBinaryTree，实现顺序存储二叉树遍历
class ArrBinaryTree{
    private int[] arr;

    public ArrBinaryTree(int[] arr) {
        this.arr = arr;
    }

    // 重载方法preOrder
    public void preOrder(){
        this.preOrder(0);// 填写下标
    }
    // 重载方法preOrder
    public void infixOrder(){
        this.infixOrder(0);// 填写下标
    }
    // 重载方法preOrder
    public void postOrder(){
        this.postOrder(0);// 填写下标
    }

    // 编写一个方法，完成顺序存储二叉树的前序遍历
    /**
     * index 数组的下标
     */
    public void preOrder(int index){
        // 如果数组为空，或者arr.length = 0
        if (arr == null || arr.length == 0) {
            System.out.println("数组为空");
        }
        // 输出当前这个元素
        System.out.print(arr[index]);
        // 向左递归遍历
        if ((index * 2 + 1) < arr.length) {
            preOrder(index * 2 + 1);
        }
        // 向右递归遍历
        if ((index * 2 + 2) < arr.length) {
            preOrder(index * 2 + 2);
        }
    }



    // 中序遍历
    public void infixOrder(int index){
        // 如果数组为空，或者arr.length = 0
        if (arr == null || arr.length == 0) {
            System.out.println("数组为空");
        }
        // 向左递归遍历
        if ((index * 2 + 1) < arr.length) {
            infixOrder(index * 2 + 1);
        }
        // 输出当前这个元素
        System.out.print(arr[index]);
        // 向右递归遍历
        if ((index * 2 + 2) < arr.length) {
            infixOrder(index * 2 + 2);
        }
    }


    // 后序遍历
    public void postOrder(int index){
        // 如果数组为空，或者arr.length = 0
        if (arr == null || arr.length == 0) {
            System.out.println("数组为空");
        }

        // 向左递归遍历
        if ((index * 2 + 1) < arr.length) {
            postOrder(index * 2 + 1);
        }
        // 向右递归遍历
        if ((index * 2 + 2) < arr.length) {
            postOrder(index * 2 + 2);
        }

        // 输出当前这个元素
        System.out.print(arr[index]);
    }



}