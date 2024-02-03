import java.util.HashMap;
public class HashMapExample {
    public static void main(String[] args){
        HashMap<String, Integer> Example = new HashMap<>();
        Example.put("Key",69);
        System.out.println("Put Example"+Example);
        Example.put("Key1",6969);
        System.out.println("Put Example"+Example);
        Example.remove("Key1");
        System.out.println("Remove Example"+Example);
        Example.replace("Key",23);
        System.out.println("Replace Example"+Example);
        System.out.println(Example);
        Example.get("Key");
    }
}
