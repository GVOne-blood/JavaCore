import java.util.Arrays;

public class L283 {
    public void moveZeroes(int[] nums) {
     int z = 0;
     int nz = 0;

     while (z < nums.length && nz < nums.length){
         if (nums[z] != 0) z++;
         if (z < nz && nums[z] != nums[nz]) {
             int temp = nums[z];
             nums[z] = nums[nz];
             nums[nz] = temp;

         }
         else {
             if (nums[nz] == 0) nz++;
         }

     }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
