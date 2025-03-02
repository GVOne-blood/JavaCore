import java.util.ArrayList;
import java.util.List;

public class L2570 {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

        int n1 = 0;
        int n2 = 0;
       List<int []> result = new ArrayList<>();
       while (n1 < nums1.length && n2 < nums2.length){
        if (nums1[n1][0] == nums2[n2][0]){ result.add(new int [] {nums1[n1][0], nums1[n1][1] + nums2[n2][1]});
        n1++;
        n2++;
       }
       else if (nums1[n1][0] < nums2[n2][0]) {
           result.add(new int [] {nums1[n1][0], nums1[n1][1]});
           n1++;
        }
       else {
           result.add(new int [] {nums2[n2][0], nums2[n2][1]});
            n2++;
        }
       }

       while (n1 < nums1.length) { result.add(new int [] {nums1[n1][0], nums1[n1][1]}); n1++;}
       while (n2 < nums2.length) { result.add(new int [] {nums2[n2][0], nums2[n2][1]}); n2++; }
       int [][] temp = new int [result.size()][2];
       for (int i = 0; i < result.size(); i++) temp[i] = result.get(i);

       return temp;
    }
}
