package BasePackage;

public class main {
    public static void main(String[] args) {
        int[] a = {1,23,45,6,7};
        EasySort easySort = new EasySort(a);
        easySort.Sort();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
    }
}
