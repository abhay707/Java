import java.util.*;

public class iterator {
    public static void main(String[] args) {
        ArrayList<Integer> ages = new ArrayList<Integer>();

        ages.add(23);
        ages.add(12);
        ages.add(93);

        Iterator<Integer> it = ages.iterator();
        while (it.hasNext()) {
            int i = it.next();
            if(i<18){
                it.remove();
            }

        }
        System.out.println(ages);
    }
}
