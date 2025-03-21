import java.util.*;
public class HashMap {
    public static void main(String[] args) {
        Hashtable<Integer, String> hash = new Hashtable<>();
        hash.put(1, "Hulla");
        hash.put(10, "Bulla");
        hash.put(101, "Mulla");

        System.out.println(hash);
        System.out.println("Getting value for key 1: " + hash.get(1));
        System.out.println("Getting value for key 10: " + hash.get(10));
        System.out.println("Getting value for key 101: " + hash.get(101));

        hash.remove(10);
        System.out.println("After removing key 10: " + hash);

    }
}
