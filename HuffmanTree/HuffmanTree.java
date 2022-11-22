package HuffmanTree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class HuffmanTree {
    public static void main(String[] args) {
        int[] arr = {13,7,8,3,29,6,1};
        Node root = createHuffmanTree(arr);

        //测试
        preOrder(root);
    }

    //编写一个前序遍历方法
    public static void preOrder(Node root){
        if (root != null) {
            root.PreOrder();
        }else {
            System.out.println("空树~");
        }
    }

    // 创建哈夫曼树的方法

    /**
     *
     * @param arr 需要创建成哈夫曼树的数组
     * @return 创建好后的哈夫曼树的root值
     */
    public static Node createHuffmanTree(int[] arr){
        // 第一步为了操作方便
        // 1. 遍历 arr 数组
        // 2. 将arr的每个元素构成成一个Node
        // 3. 将Node 放入ArrayList中
        List<Node> nodes = new ArrayList<Node>();
        for (int value : arr) {
            nodes.add(new Node(value));
        }

        while (nodes.size() > 1){
            // 排序从小到达
            Collections.sort(nodes);

            System.out.println("node = " + nodes);

            // 取出根节点权值最小的两个二叉树
            //(1) 取出权值最小的结点
            Node leftnode = nodes.get(0);
            //(2) 取出权值第二小的结点
            Node rightnode = nodes.get(1);

            //(3) 构造一棵新的二叉树
            Node parent = new Node(leftnode.value + rightnode.value);
            parent.left = leftnode;
            parent.right = rightnode;

            //(4) 从ArrayList删除处理过的二叉树
            nodes.remove(leftnode);
            nodes.remove(rightnode);
            //(5) 将parent加入到nodes中
            nodes.add(parent);
        }

        return nodes.get(0);

    }
}


// 创建结点类
// 为了让Node 对象持续排序Collections集合排序
// 让Node 实现Comparable接口
class Node implements Comparable<Node>{
    int value; // 结点权值
    Node left; // 指向左结点
    Node right; // 指向右结点

    public Node(int value) {
        this.value = value;
    }

    // 前序遍历
    public void PreOrder(){
        System.out.println(this);
        if (this.left != null) {
            this.left.PreOrder();
        }
        if (this.right != null) {
            this.right.PreOrder();
        }
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    @Override
    public int compareTo(Node o) {
        // 表示从大到小排序
        return this.value - o.value;
    }
}
