package NewBegin;



public class Dayten {
    public static void main (String[] args) {
        int[] i = {1,5,2,3,4,5};
        Solutionx10 s = new Solutionx10();
        int a = s.maxArea(i);
        System.out.println(a);

    }
}
class Solution10 {
    public int maxArea(int[] height) {
        int num = 0;
        if (height.length <= 1) {
            return 0;
        }
        for (int i = 0; i < height.length; i++) {
            if (i == height.length -1) {
                break;
            }
            for (int j = i+1; j < height.length; j++) {
                int length = j - i;
                int late ;
                if (height[i] >= height[j]) {
                    late = height[j]*length;
                }else {
                    late = height[i]*length;
                }
                if (late > num) {
                    num = late;
                }


            }
        }
        return num;
    }

}


class Solutionx10 {
    public int maxArea(int[] height) {
        int maxarea = 0;
        int leftside = 0;
        int rightside = height.length -1;
        if (height.length <= 1) {
            return 0;
        }
        while (leftside < rightside) {
            maxarea = Math.max(maxarea,Math.min(height[leftside],height[rightside])*(rightside - leftside));
            if (height[leftside] <= height[rightside]) {
                leftside++;
            }else {
                rightside--;
            }
        }
        return maxarea;
    }

}