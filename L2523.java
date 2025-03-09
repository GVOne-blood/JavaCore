public class L2523 {
    public int[] closestPrimes(int left, int right) {
        int sang[] = new int[1000002];
        sang[0] = 0; sang[1] = 0;
        for (int i = 2; i < sang.length; i++) sang[i] = 1;

        // Sieve of Eratosthenes
        for (int i = 2; i <= Math.sqrt(sang.length); i++) {
            if (sang[i] == 1) {
                for (int j = i * i; j < sang.length; j += i) sang[j] = 0;
            }
        }

        int[] result = new int[2];
        result[0] = -1; result[1] = -1;
        int min = Integer.MAX_VALUE;

        // Find the first prime number within the range
        while (sang[left] != 1 && left <= right) left++;
        if (left > right) return result; // No primes in the range

        int prevPrime = left;
        result[0] = prevPrime;

        // Find the closest pair of prime numbers
        for (int i = left + 1; i <= right; i++) {
            if (sang[i] == 1) {
                if (i - prevPrime < min) {
                    min = i - prevPrime;
                    result[0] = prevPrime;
                    result[1] = i;
                }
                prevPrime = i;
            }
        }

        if (result[0] == -1 || result[1] == -1) return new int[]{-1, -1};
        return result;
    }

}
