public class SlidingWindow {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;

        int sum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        System.out.println("Maximum sum: " + maxSum);
    }
}