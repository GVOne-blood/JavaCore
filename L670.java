public class L670 {
    public int maximumSwap(int num) {

            char[] digits = String.valueOf(num).toCharArray();
            int n = digits.length;

            // Mảng last lưu vị trí xuất hiện cuối cùng của mỗi chữ số
            int[] last = new int[10];
            for (int i = 0; i < n; i++) {
                last[digits[i] - '0'] = i;
            }

            // Duyệt từ trái qua phải, tìm vị trí cần hoán đổi
            for (int i = 0; i < n; i++) {
                int currentDigit = digits[i] - '0';
                // Duyệt từ 9 xuống currentDigit + 1 để tìm chữ số lớn hơn
                for (int d = 9; d > currentDigit; d--) {
                    if (last[d] > i) { // Có chữ số lớn hơn xuất hiện sau vị trí i
                        // Hoán đổi
                        char temp = digits[i];
                        digits[i] = digits[last[d]];
                        digits[last[d]] = temp;
                        return Integer.parseInt(new String(digits));
                    }
                }
            }

            // Trả về số gốc nếu không có hoán đổi
            return num;
        }

    }
