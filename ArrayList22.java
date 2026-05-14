import java.util.ArrayList;
import java.util.List;



public class ArrayList22 {
    public static void main(String[] args){
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(4);
        l.add(6);
        System.out.println(l.get(2));
        System.out.println(l.indexOf(6));
        for(int val : l){
            System.out.println(val);
        }
    }
}
