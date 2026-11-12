public class Armstrong {
    public static void main(String[] args) {
        int n = 370;
        int temp = n;
        int sum = 0;

        while (n > 0) {
            int d = n % 10;
            sum = sum + (d * d * d);
            n = n / 10;
        }

        if (temp == sum) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not an Armstrong");
        }
    }
}
