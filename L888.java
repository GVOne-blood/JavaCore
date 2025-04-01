import java.util.HashSet;
import java.util.Set;

public class L888 {
        public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
            int [] res = new int [2];
            int sumA = 0, sumB = 0;
            for (int i = 0; i < aliceSizes.length; i++) sumA += aliceSizes[i];
            for (int i = 0; i < bobSizes.length; i++) sumB += bobSizes[i];
            //int avg = (sumA - sumB) / 2;
    //        Set<Integer> set = new HashSet<>();
    //        for (int i = 0; i < bobSizes.length; i++) set.add(bobSizes[i]);
    //        for (int i = 0; i < aliceSizes.length; i++) {
    //            if (set.contains(aliceSizes[i] - avg)) {
    //                res[0] = aliceSizes[i];
    //                res[1] = aliceSizes[i] - avg;
    //                break;
    //            }
    //        }
          int  avg = (sumB - sumA) / 2;
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < aliceSizes.length; i++) set.add(aliceSizes[i]);
            for (int i = 0; i < bobSizes.length; i++) {
                if (set.contains(bobSizes[i] + avg)) {
                    res[0] = bobSizes[i] + avg;
                    res[1] = bobSizes[i];
                    break;
                }
            }

        return res;
        }
}
