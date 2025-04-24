public class L3516 {
    public int findClosest(int x, int y, int z) {
        if (Math.abs(x - z) > Math.abs(y - z)) return 2;
        else if (Math.abs(x - z) < Math.abs(y - z)) return 1;
        System.out.println(Math.abs(x - z) + " " + Math.abs(y - z));
         return 0;
    }

    public static void main(String[] args) {
        L3516 l3516 = new L3516();
        System.out.println(l3516.findClosest(2, 5, 6));

    }
}
