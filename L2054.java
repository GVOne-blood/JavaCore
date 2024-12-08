//2054. Two Best Non-Overlapping Events

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class L2054 {
    public static void maxTwoEvents(int[][] events) {
        // int [] start = new int[events.length];
        // int j = -1;
        // for (int[] i : events){
        //     j++;
        //     start[j] = i[0];
        //     System.out.println(start[j]);
        // }
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        System.out.println(Arrays.deepToString(events));

        return;
    }
    
}
