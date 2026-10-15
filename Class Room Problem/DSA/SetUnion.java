import java.util.HashSet;

public class SetUnion {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4 };
        int b[] = { 3, 5, 6, 7 };
        HashSet<Integer> Set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            Set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            Set.add(b[i]);
        }
        System.out.println(Set);
    }

}
