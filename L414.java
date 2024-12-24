import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class L414 {
    public int thirdMax(int[] nums) {   
       long once = Long.MIN_VALUE, twice = Long.MIN_VALUE, third = Long.MIN_VALUE;
       for (long num :nums){
        if (num == once || num == twice || num == third) continue;
        if (once <= num){
            third = twice;
            twice = once;
            once = num;
        }
        else if (twice <= num) {
            third = twice;
            twice = num;
       }
        else if (third <= num) third = num;
    }
    if (third == Long.MIN_VALUE) return (int)once;
    return (int)third;
    }
}
