public class L2582 {
    public int passThePillow(int n, int time) {
        if (time < n) return time + 1;
        if (n < 3) if (time % 2 == 0) return 1; else return 2;
        int loop = (time / (n - 1));
        int temp = (int)1.98f;
        int mod = time % (n - 1);
        if (loop % 2 != 0) return n - mod;
        return mod + 1;

    }
}
