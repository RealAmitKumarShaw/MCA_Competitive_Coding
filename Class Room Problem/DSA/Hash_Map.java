
import java.util.HashMap;

public class Hash_Map{
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        System.out.println(map);

        System.out.println(map.get(2));
    }
}
