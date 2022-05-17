import java.util.HashMap;

public class Personmain {
    public static void main(String[] args) {
        HashMap<String, Person> personMap = new HashMap<>();
    
        Person casper = new Person("Casper", 55);
        Person mike = new Person("Mike", 4);
        Person matt = new Person("Matt", 12);
    
        personMap.put(casper.getName(), casper);
        personMap.put(mike.getName(), mike);
        personMap.put(matt.getName(), matt);
    
        if(personMap.get("Mike").getAge() == 4) {
            System.out.println("Correct!");
        }
    }
}
