import java.util.*;

public class L2342 {
    public int sum(int n) {
        int s = 0;
        while (n != 0) {
            s += n % 10;
            n = n / 10;
        }
        return s;
    }

    public int maximumSum(int[] nums) {
        Map<Integer, Integer> fred = new HashMap<>();
        Boolean[] m = new Boolean[82];
        Arrays.fill(m, false);

        Integer[] num = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(num, Collections.reverseOrder());

        for (int nu : num) {
            int sumNu = sum(nu);
            if (fred.containsKey(sumNu) ) {
                if (!m[sumNu]) {
                    fred.put(sumNu, fred.get(sumNu) + nu);
                    m[sumNu] = true;
                }
            }
             else {
                fred.put(sumNu, nu);
            }
        }

        int max = 0;
        for (int key : fred.keySet()) {
            if (m[key] == true) {
                max = Math.max(max, fred.get(key));
            }
        }

        return max == 0 ? -1 : max;
    }
}