public class Question2 {
    public static void main(String[] args) {

        int[] arr = {2, 0, 2, 1, 1, 0};

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {
                // Swap low and mid
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            }

            else if (arr[mid] == 1) {
                mid++;
            }

            else { // arr[mid] == 2
                // Swap mid and high
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}