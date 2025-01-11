import java.util.Arrays;

public class L88 {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = 0; // Pointer for nums1
            int j = 0; // Pointer for nums2
            int z = 0; // Pointer for merged array

            // Copy the original elements of nums1 (up to m) to a temporary array
            int[] temp = new int[m];
            for (int k = 0; k < m; k++) {
                temp[k] = nums1[k];
            }

            // Merge the temp array and nums2 into nums1
            while (i < m && j < n) {
                if (temp[i] <= nums2[j]) {
                    nums1[z] = temp[i];
                    i++;
                } else {
                    nums1[z] = nums2[j];
                    j++;
                }
                z++;
            }

            // Copy the remaining elements from temp (if any)
            while (i < m) {
                nums1[z] = temp[i];
                i++;
                z++;
            }

            // Copy the remaining elements from nums2 (if any)
            while (j < n) {
                nums1[z] = nums2[j];
                j++;
                z++;
            }

    }

}
