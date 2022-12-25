package graph;

import java.util.ArrayList;
import java.util.Arrays;

public class graph {

    private ArrayList<String> vertexList;//存储顶点集合
    private int[][] edges;//存储图对应的邻结矩阵
    private int numedges;//边的数目
    // 定义给数组Boolean[],记录某个结点是否被访问
    private boolean[] isvisited ;

    public static void main(String[] args) {
        // 测试
        int n = 5;//结点个数
        String Vertexs[] = {"A","B","C","D","E"};
        // 创建图对象
        graph graph = new graph(n);
        // 循环的添加顶点
        for (String vertex: Vertexs
             ) {
            graph.insertVertex(vertex);
        }

        // 添加边
        // A-B A-C B-C B-D B-E
        graph.insertEdge(0,1,1);//A-B
        graph.insertEdge(0,2,1);//A-C
        graph.insertEdge(1,2,1);//B-C
        graph.insertEdge(1,3,1);//B-D
        graph.insertEdge(1,4,1);//B-E

        //显示矩阵
        graph.showGraph();


        // 测试dfs遍历
        System.out.println("深度遍历");
        graph.dfs();
    }

    // 构造器
    public graph(int n){
        //初始化矩阵和vertexList
        edges = new int[n][n];
        vertexList = new ArrayList<String>(n);
        numedges = 0;
        isvisited = new boolean[n];
    }

    //插入结点
    public void insertVertex(String vertex){
        vertexList.add(vertex);
    }

    //添加边
    /**
     *
     * @param v1 表示点是下标，就是第几个顶点  例："A" - "B"  "A" -> 0  "B" -> 1
     * @param v2 第二个顶点对应的下标
     * @param weight 边所代表的数字
     */
    public void insertEdge(int v1,int v2,int weight){ // 顶点一，顶点二，边所代表的数字
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        numedges++;
    }

    // 得到第一个邻接结点的下标
    /**
     *
     * @param index 提供下标
     * @return 如果存在就返回下标，否则返回-1
     */
    public int getFirstNeighbor(int index){
        for (int j = 0; j < vertexList.size(); j++) {
            if (edges[index][j] > 0) {
                return j;
            }
        }
        return -1;
    }
    // 根据前一个邻接结点的下标来获取下一个邻接结点
    public int getNextNeighbor(int v1,int v2){
        for (int j = v2 + 1; j < vertexList.size(); j++) {
            if (edges[v1][j] > 0) {
                return j;
            }
        }
        return -1;
    }


    // 图中常用的方法
    // 1. 返回结点的个数
    public int getNumVertex(){
        return vertexList.size();
    }
    // 2. 得到边的个数
    public int getNumedges(){
        return numedges;
    }
    // 3. 返回结点i(下标)对应的数据 0 -> "A"  1 -> "B"  2 -> "C"
    public String getValueByIndex(int i){
        return vertexList.get(i);
    }
    // 4. 返回V1、V2的权值
    public int getWeight(int v1,int v2){
        return edges [v1][v2];
    }
    // 5. 显示图对应的矩阵
    public void showGraph(){
        for (int[] link: edges) {
            System.out.println(Arrays.toString(link));
        }
    }

    // 深度优先遍历算法
    // i 第一次就是0
    private void dfs(boolean[] isvisited,int i){
        // 首先我们访问该节点，输出
        System.out.print(getValueByIndex(i)+"->");
        // 将结点设置为已经访问
        isvisited[i] = true;
        // 查找结点i的第一个邻接结点W
        int w = getFirstNeighbor(i);
        while (w != -1) {// 说明有邻接结点
            if (!isvisited[w]) {
                dfs(isvisited,w);
            }
            // 如果w结点已经被访问过
            w = getNextNeighbor(i,w);
        }
    }

    // 对dfs 进行一个重载，遍历我们所有的结点，并进行dfs
    public void dfs(){
        // 遍历所有的结点，进行dfs[回溯]
        for (int i = 0; i < getNumVertex(); i++) {
            if (!isvisited[i]) {
                dfs(isvisited,i);
            }
        }
    }

}
