public class L2729 {

    public boolean solve(int n) {
        if (n <= 0) {
            return false; // Handle invalid input where n <= 0
        }

        int[] arr = new int[10]; // Changed array size to 10 to include digits 0-9
        arr[n % 10]++;
        arr[(n / 10) % 10]++;
        arr[(n / 100) % 10]++;
        arr[(n * 2) % 10]++;
        arr[(n * 2 / 10) % 10]++;
        arr[(n * 2 / 100) % 10]++;
        arr[(n * 3) % 10]++;
        arr[(n * 3 / 10) % 10]++;
        arr[(n * 3 / 100) % 10]++;

        if (arr[0] > 0) return false; // Ensure no digit 0 is present
        for (int i : arr) {
            if (i != 1 && i != 0) return false; // Check for exactly one occurrence of each digit
        }
        return true;
    }

//        int fred [] = new int [10];
//        String s = new String (String.valueOf(n) + String.valueOf(n * 2) + String.valueOf(n * 3));
//        for (char c : s.toCharArray()) fred[c - '0']++;
//        if (fred[0] > 0) return false;
//        for (int i = 1; i < 10; i++) {
//            if (fred[i] != 1) return false;
//        }
//        return true;

    }

