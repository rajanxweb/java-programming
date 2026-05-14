import java.util.Set;
import java.util.HashSet;
//import java.util.Set;
import java.util.TreeSet;

public class Set23 {
    public static void main(String[] args){
        Set<Integer> s = new HashSet<Integer>();
        s.add(2);
        s.add(5);
        s.add(1);
        for(int i : s){
            System.out.println(i);
        }

        Set<Integer> ts = new TreeSet<Integer>();
        ts.add(2);
        ts.add(1);
        ts.add(7);
        ts.add(0);
        for(int i : ts){
            System.out.println(i);
        }

    }
}
