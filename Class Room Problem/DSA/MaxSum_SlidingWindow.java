public class MaxSum_SlidingWindow {
    public static void main(String[] args) {
        int arr[] = {6, 1, 3, 2};
        int k = 3; // Window size = 3
        int sum = 0;

        // First Window
        for(int i = 0; i < k; i++){
            sum += arr[i]; 
        }

        int max = sum;

        // Slide to next window
        for(int i = k; i < arr.length; i++){
            sum = sum + arr[i] - arr[i - k];
            if(sum > max){
                max = sum;
            }
        }
        System.out.println("Maximum Sum = "+max);
    }
}
