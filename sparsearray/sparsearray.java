package sparsearray;

public class sparsearray {

    public static void main(String[] args) {
        //创建一个原始的二维数组 11*11
        //0表示没有棋子，1表示黑子，2表示蓝子
        int chassarr1[][] = new int[11][11];
        chassarr1 [1][2] = 1;
        chassarr1 [2][3] = 2;
        //输出原始的二维数组
        System.out.println("原始的二维数组");
        for (int row[]:chassarr1) {
            for (int deta:row
                 ) {
                System.out.print(deta +"    ");
            }
            System.out.println("");
        }
        //将二维数组 转 稀疏数组
        //1.先遍历二维数组，得到非零的个数
        int sum = 0;
        for (int i = 0; i < chassarr1.length; i++) {
            for (int j = 0; j < chassarr1[i].length; j++) {
                if (chassarr1[i][j] != 0) {
                    sum++;
                }
            }
        }
        System.out.println("sum="+sum);

        //2.创建对应的稀疏数组
        int sparsearr [][] = new int[sum+1][3];
        // 给稀疏数组赋值
        sparsearr[0][0] = chassarr1.length;
        sparsearr[0][1] = chassarr1[0].length;
        sparsearr[0][2] = sum;

        // 遍历二维数组，将非0的值存放到sparsearr中
        int count = 0;//count 用于记录是第几个非零数据
        for (int i = 0; i < chassarr1.length; i++) {
            for (int j = 0; j < chassarr1[i].length; j++) {
                if (chassarr1[i][j] != 0) {
                    count++;
                    sparsearr[count][0] = i;
                    sparsearr[count][1] = j;
                    sparsearr[count][2] = chassarr1[i][j];
                }
            }
        }

        //输出稀疏数组的形式
        System.out.println("");
        System.out.println("得到的稀疏数组为：");
        for (int i = 0; i < sparsearr.length; i++) {
            for (int j = 0; j < sparsearr[i].length; j++) {
                System.out.print(sparsearr[i][j]+ "\t");
            }
            System.out.println("");
        }

        //将稀疏数组 恢复成 原始的二维数组
        //1.先读取稀疏数组的第一行，根据第一行的数据，创建原始的二维数组
        int chassArr2[][] = new int[sparsearr[0][0]][sparsearr[0][1]];
        
        //2.在读取稀疏数组后几行的数据（从第二行开始），并赋给原始的二维数组即可

        for (int i = 1; i < sparsearr.length; i++) {
            chassArr2[sparsearr[i][0]][sparsearr[i][1]] = sparsearr[i][2];
        }

        System.out.println("");
        System.out.println("恢复后的二维数组为：");
        for (int i = 0; i < chassArr2.length; i++) {
            for (int j = 0; j < chassArr2[i].length; j++) {
                System.out.print(chassArr2[i][j]+ "\t");
            }
            System.out.println("");
        }
    }

}
