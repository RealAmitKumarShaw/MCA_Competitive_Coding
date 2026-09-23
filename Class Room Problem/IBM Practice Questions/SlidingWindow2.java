public class SlidingWindow2 {
    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int sum = 0;
        int count = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        if (sum >= 7) {
            count++;
        }

        // Slide the window
        for (int i = k; i < arr.length; i++) {

            sum = sum + arr[i] - arr[i - k];

            if (sum >= 7) {
                count++;
            }
        }

        System.out.println("Number of windows: " + count);
    }
}
