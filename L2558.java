import java.util.Arrays;

public class L2558 {
    public long pickGifts(int[] gifts, int k) {
        long sum = 0;
        while (k > 0){
            int maxIndex = 0;
            for (int i = 1; i < gifts.length; i++){
                    if (gifts[i] > gifts[maxIndex]) maxIndex = i;
            }
        //    System.out.println("maximal : " + Math.sqrt(Arrays.stream(gifts).max().getAsInt()));
            if (k > 0)
            gifts[maxIndex] = (int)(Math.sqrt(gifts[maxIndex]));
            k--;
        }
        for (int i : gifts) sum += i;
        return sum;
    }
}
