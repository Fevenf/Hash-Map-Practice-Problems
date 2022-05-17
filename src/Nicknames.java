import java.util.HashMap;

public class Nicknames {
    public static void main(String[] args) throws Exception {
        //1 Retrieve from a hash map
       // Which command retrieves the value 3 from the hash map?

   HashMap<String, String> name = new HashMap<>();

    name.put("matthew", "matt");
    name.put("michael", "mix");
    name.put("arthur", "artie");

    
     System.out.println(name.get("matthew"));
    

    }
}



//     public static void main(String[] args) throws Exception {
//         //1 Retrieve from a hash map
//        // Which command retrieves the value 3 from the hash map?

//    HashMap<String, Integer> name = new HashMap<>();

//     name.put("3", 9);
//     name.put("6", 6);
//     name.put("9", 3);

//     if(name.get("9") == 3) {
//         System.out.println("Correct!");
//     }

//     }
// }
