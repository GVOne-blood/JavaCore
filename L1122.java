public class L1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int [] fred = new int[1001];
        int [] res = new int[arr1.length];
        for (int i = 0;i < arr1.length; i++) fred[arr1[i]]++;

        int j = 0;
        for (int i = 0;i < arr2.length; i++){
            while (fred[arr2[i]] > 0){
                res[j] = arr2[i];
                j++;
                fred[arr2[i]]--;
            }
        }
        for (int i = 0; i < fred.length; i++) if (fred[i] > 0){
            while (fred[i] > 0){
                res[j] = i;
                j++;
                fred[i]--;
            }
        }
        return res;
    }
}
