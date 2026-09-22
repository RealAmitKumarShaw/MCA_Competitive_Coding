public class target_pair {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int target = 20;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] == target) {
                    System.out.printf("[%d,%d]%n", arr[i], arr[j]);
                }
            }
        }
    }
}
