import java.util.HashSet;

public class SetIntersection {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4 };
        int b[] = { 3, 5, 6, 1 };
        HashSet<Integer> Set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            Set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            if (Set.contains(b[i])) {
                System.out.print(b[i]+" ");
            }
        }
    }
}
