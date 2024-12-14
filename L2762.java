import java.util.TreeMap;

public class L2762 {
    public long continuousSubarrays(int[] nums) {
        // Tạo treemap để lưu trữ số lần xuat hien cửa số hiện tại
        TreeMap<Integer, Integer> freq = new TreeMap<>();
        int left = 0, right = 0;
        int n = nums.length;
        long count = 0; // Tổng số subarray thỏa mãn

        while (right < n) {
            // Thêm phần tử hiện tại vào map <giá trị phần tử, tần suất>
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);

            // Khi mà cửa số hiện tại có  |nums[i] - nums[j]| ≤ 2
            // Dịch chuyển cửa sổ từ trái sang
            while (freq.lastEntry().getKey() - freq.firstEntry().getKey() > 2) {
                // Xóa phần tử tận cùng bên trái của Map
                freq.put(nums[left], freq.get(nums[left]) - 1);
                if (freq.get(nums[left]) == 0) {
                    freq.remove(nums[left]);
                }
                left++;
            }

            // Số phần tử con hợp lệ = cuối - đầu + 1
            count += right - left + 1;
            right++;
        }

        return count;
    }
}
