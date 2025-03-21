import java.util.*;
public class dist {

    public static void main(String[] args) {
        Dictionary<String, String> geek = new Hashtable<>();
        geek.put("45", "Welcome");
        geek.put("12","Program");

        System.out.println("Value at key: " + geek.get("45"));
        System.out.println("Value at key: " + geek.get("12"));
        System.out.println("Size of Dictionary: " + geek.size());
        System.out.println("isEmpty()?: " + geek.isEmpty());
        System.out.println("Remove key 12: " + geek.remove("12"));
        System.out.println("Size of Dictionary: " + geek.size());
        System.out.println("isEmpty()?: " + geek.isEmpty());
    }
}