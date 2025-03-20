import java.util.ArrayList;
import java.util.List;

public class L2951 {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < mountain.length - 1; i++)
            if (mountain[i -1] < mountain[i] && mountain[i] > mountain[i + 1])
                result.add(i);
    return result;
    }
}
