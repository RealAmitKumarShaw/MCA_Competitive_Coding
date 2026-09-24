import java.util.*;

public class Length_of_last_Word {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String str = in.nextLine();
        int i = str.length() - 1;
        while (i >= 0 && !Character.isLetterOrDigit(str.charAt(i))) {
            i--;
        }
        int count = 0;
        while (i >= 0 && Character.isLetterOrDigit(str.charAt(i))) {
            count++;
            i--;
        }
        System.out.println(count);
        in.close();
    }
}
