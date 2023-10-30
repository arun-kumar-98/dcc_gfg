public class sumOfXorOfAllPairs {


    // Function for finding maximum and value pair
    public long sumXOR(int[] arr, int n) {
        int maxBits = 0;
        for (int num : arr) {
            maxBits = Math.max(maxBits, Integer.numberOfTrailingZeros(Integer.highestOneBit(num)) + 1);
        }

        long total = 0L;


        for (int i = 0; i < maxBits; i++) {
            int countSetbit = 0;
            for (int j = 0; j < n; j++) {
                if ((arr[j] & (1 << i)) != 0) {
                    countSetbit++;

                }

            }

            total += (long) countSetbit * (n - countSetbit) * (1L << i);
        }
        return total;

    }


    public static void main(String[] args) {

        int[] arr = {7, 3, 5};
        int n = arr.length;
        long result = new sumOfXorOfAllPairs().sumXOR(arr, n);
        System.out.println(result);


        System.out.println("Hello world!");
    }
}





