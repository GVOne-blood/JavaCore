import java.util.Arrays;

public class L204 {
    public int countPrimes(int n) {
        int [] temp = new int [n];

        for (int i = 0; i < temp.length; i++) temp[i] = 1;
        temp[0] = 0;
        temp[1] = 0;
        for (int i = 2; i*i < n; i++){
            if (temp[i] == 1){
                for (int j = i*i ; j < n; j+=i) temp[j] = 0;
            }
        }
        return Arrays.stream(temp).sum();
    }
}
