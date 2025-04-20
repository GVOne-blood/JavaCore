public class L781 {
    public int numRabbits(int[] answers) {
        int [] fred = new int [1001];
        for (int i = 0; i < answers.length; i++) fred[answers[i]]++;
        int res = 0;
        for (int i = 0; i < 1000; i++){
            if (fred[i] > 0){
                if (fred[i] >= 1) res += fred[i];
                else res += i;
            }
        }
        return res;
    }
}
