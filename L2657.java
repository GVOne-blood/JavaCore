public class L2657 {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int [] C = new int [A.length];
        int z = 0;
        C[0] = 0;
        int [] temp = new int [200];
        for (int i = 0; i < A.length; i++){
            temp[A[i]]++;
            temp[B[i]]++;
            for (int item : temp) if (item >= 2) {
                C[z]++;
            }
            z++;
        }
//        for (int i = 0; i < A.length; i++){
//            if (++temp[A[i]] == 2) z++;
//            if (++temp[B[i]] == 2) z++;
//            C[i] = z;
//        }
        return C;
    }
}
