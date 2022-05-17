import java.util.HashMap;
import java.util.Map;

public class Program {

    public static void main(String[] args) {
//Print me my hash map
        // HashMap<String, String> hashmap = new HashMap<>();
        // hashmap.put("f.e", "for example");
        // hashmap.put("etc.", "and so on");
        // hashmap.put("i.e", "more precisely");

        // printKeys(hashmap);
        // System.out.println("---");
        // printKeysWhere(hashmap, "i");
        // System.out.println("---");
        // printValuesOfKeysWhere(hashmap, ".e");

//Print me another hash map
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    
    }

    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (Map.Entry<String, String> abbreviationMap : hashmap.entrySet()) {
            if (abbreviationMap.getKey().contains(text)) {
                System.out.println(abbreviationMap.getValue());
            }
        }
    }
    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book book : hashmap.values()) {
            System.out.println(book);
        }
    }
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book book : hashmap.values()) {
            if (book.getName().contains(text)) {
                System.out.println(book);
            }
        }
    }
}
