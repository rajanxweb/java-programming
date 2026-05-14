import java.util.HashMap;
//import java.util.HashTable;


public class HashMap24 {
    public static void main(String[] args){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Rajan", 21);
        hm.put("Shyam", 16);
        hm.put("Aman", 20);

        System.out.println(hm.get("Rajan"));
        for(String i: hm.keySet()){
            System.out.println(i + " : "+ hm.get(i));
        }

        for(int i : hm.values()){
            System.out.println(i );
        }
    }
} 
