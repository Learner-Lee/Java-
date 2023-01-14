package NewBegin;


public class Daythree {
    public static void main (String[] args) {
        int[] m = new int[]{1,3,5};
        int[] n = new int[]{2,4,9};
        FindMedianSortedArrays arrays = new FindMedianSortedArrays();
//        int[] res = arrays.sortedArrays(m, n);
//        for (int r : res) {
//            System.out.println(r);
//        }
        double res = arrays.findMedianSortedArrays(m,n);
        System.out.println(res);
    }
}

class FindMedianSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //将两个数组合并成一个有序的数组
        FindMedianSortedArrays arrays = new FindMedianSortedArrays();
        int[] res = arrays.sortedArrays(nums1, nums2);
        //判断数组的长度是奇数还是偶数
        int length = res.length;
        boolean bool = isOddNumber(length);
        System.out.println(bool);
        //是偶数的话
        //1 2 3 4
        //0 1 2 3
        //计算中位数
        double result = bool == true ? res[(0 + res.length - 1) / 2] :
                (res[(0 + res.length - 1) / 2] + res[(0 + res.length - 1) / 2 + 1]) / 2.0;
        return result;
    }

    public int[] sortedArrays(int[] m, int[] n) {
        int[] res = new int[m.length + n.length];
        //结果数组的下标
        int rIndex = 0;
        //m数组下标
        int mIndex = 0;
        //n数组下标
        int nIndex = 0;
        while (mIndex < m.length && nIndex < n.length) {
            if (m[mIndex] <= n[nIndex]) {
                res[rIndex] = m[mIndex];
                mIndex++;
            } else {
                res[rIndex] = n[nIndex];
                nIndex++;
            }
            rIndex++;
        }
        //判断数组是否遍历完成
        //n数组已经遍历完成，则只需要将m数组剩下的元素加到res数组中
        if (mIndex != m.length) {
            for (int i = mIndex; i < m.length; i++) {
                res[rIndex] = m[i];
                rIndex++;
            }
        } else {
            //m数组已经遍历完成，则将n数组剩下的元素加到res数组中
            for (int i = nIndex; i < n.length; i++) {
                res[rIndex] = n[i];
                rIndex++;
            }
        }
        return res;
    }

    /**
     * 判断奇数还是偶数
     */
    public boolean isOddNumber(int i) {
        //return i % 2 != 0;(i & 1) == 1
        return (i % 2 != 0) ? true : false;
    }
}

