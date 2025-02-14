import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class L3066 {
    public int minOperations(int[] nums, int k) {
        Queue<Long> q = new PriorityQueue<>(Comparator.naturalOrder());
        int cnt = 0;

        // Kiểm tra trường hợp mảng rỗng
        if (nums == null || nums.length == 0) {
            return -1; // Hoặc giá trị phù hợp khi không có phần tử nào
        }

        // Thêm các phần tử vào hàng đợi (chuyển đổi từ int sang long)
        for (int num : nums) {
            q.add((long) num);
        }

        // Thực hiện các phép tính
        while (q.size() >= 2 && q.peek() < k) {
            long temp1 = q.poll();
            long temp2 = q.poll();
            long newVal = temp1 * 2 + temp2;
            q.add(newVal);
            cnt++;
        }

        // Kiểm tra điều kiện thoát vòng lặp cuối cùng
        if (q.size() < 2 || q.peek() >= k) {
            return cnt;
        }

        return -1; // Nếu không thể thoả mãn điều kiện
    }
}
