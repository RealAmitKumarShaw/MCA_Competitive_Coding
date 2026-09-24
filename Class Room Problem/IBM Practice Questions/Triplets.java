public class Triplets {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int K = 3;
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int l = j + 1; l < arr.length; l++) {

                    if ((arr[i] + arr[j] + arr[l]) % K == 0) {
                        count++;
                    }
                }
            }
        }

        System.out.println("Number of triplets: " + count);
    }
}